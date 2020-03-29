package org.develnext.jphp.ext.lucene.classes.document;

import org.apache.lucene.document.Field;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Name("Field")
@Reflection.Namespace(LuceneExtension.NS + "\\document")
public class WrapField<T extends Field> extends BaseWrapper<T> {
    public WrapField(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapField(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
