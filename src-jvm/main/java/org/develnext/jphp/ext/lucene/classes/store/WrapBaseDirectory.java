package org.develnext.jphp.ext.lucene.classes.store;

import org.apache.lucene.store.BaseDirectory;
import org.apache.lucene.store.FSDirectory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Name("BaseDirectory")
@Reflection.Namespace(LuceneExtension.NS + "\\store")
public class WrapBaseDirectory<T extends BaseDirectory> extends WrapDirectory<T> {
    public WrapBaseDirectory(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapBaseDirectory(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
