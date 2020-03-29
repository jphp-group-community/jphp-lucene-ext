package org.develnext.jphp.ext.lucene.classes.store;

import org.apache.lucene.store.Directory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Abstract
@Reflection.Name("Directory")
@Reflection.Namespace(LuceneExtension.NS + "\\store")
public class WrapDirectory<T extends Directory> extends BaseWrapper<T> {
    public WrapDirectory(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapDirectory(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
