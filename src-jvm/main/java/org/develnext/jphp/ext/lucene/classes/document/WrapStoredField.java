package org.develnext.jphp.ext.lucene.classes.document;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.FieldType;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.TextField;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.memory.BinaryMemory;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("StoredField")
@Reflection.Namespace(LuceneExtension.NS + "\\document")
public class WrapStoredField extends WrapField<StoredField> {
    public WrapStoredField(Environment env, StoredField wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapStoredField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(Environment env, String name, Memory value) {
        switch (value.getRealType()) {
            case BOOL: __wrappedObject = new StoredField(name, value.toInteger()); break;
            case DOUBLE: __wrappedObject = new StoredField(name, value.toDouble()); break;
            case INT: __wrappedObject = new StoredField(name, value.toLong()); break;
            default: {
                if (value.toValue() instanceof BinaryMemory) {
                    __wrappedObject = new StoredField(name, value.getBinaryBytes(env.getDefaultCharset()));
                } else {
                    __wrappedObject = new StoredField(name, value.toString());
                }
                break;
            }
        }
    }
}
