package io.vrap.rmf.codegen.common.generator.core;

import io.reactivex.Flowable;
import io.vrap.rmf.codegen.common.processor.extension.ExtensionMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.Interpreter;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.misc.ObjectModelAdaptor;
import org.stringtemplate.v4.misc.STNoSuchPropertyException;

import java.util.List;

public class RmfModelAdaptor extends ObjectModelAdaptor {

    private final List<ExtensionMapper> mappers;
    private final Class handledClass;
    private static final Logger LOGGER = LoggerFactory.getLogger(RmfModelAdaptor.class);

    private final static Object NULL = new Object();

    public RmfModelAdaptor(final Class handledClass, List<ExtensionMapper> mappers) {
        this.mappers = mappers;
        this.handledClass = handledClass;
    }

    public Class getHandledClass() {
        return handledClass;
    }

    @Override
    public synchronized Object getProperty(Interpreter interp, ST self, Object o, Object property, String propertyName) throws STNoSuchPropertyException {

        Object result = Flowable.fromIterable(mappers)
                .flatMapMaybe(extensionMapper -> extensionMapper.apply(o, propertyName))
                .blockingFirst(NULL);

        if (result != NULL) {
            return result;
        }
        try{
            return super.getProperty(interp, self, o, property, propertyName);
        }catch (STNoSuchPropertyException exception){
            LOGGER.warn("property '{}' not found in {} or any of its extensions",propertyName, o.getClass());
            throw exception;
        }
    }
}
