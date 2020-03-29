package org.develnext.jphp.ext.lucene.classes.document;

import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("StringField")
@Reflection.Namespace(LuceneExtension.NS + "\\document")
public class WrapStringField extends WrapField<StringField> {
    public WrapStringField(Environment env, StringField wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapStringField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(String name, String value, Field.Store store) {
        __wrappedObject = new StringField(name, value, store);
    }
}
