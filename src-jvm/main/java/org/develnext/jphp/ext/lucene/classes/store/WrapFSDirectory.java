package org.develnext.jphp.ext.lucene.classes.store;

import org.apache.lucene.store.FSDirectory;
import org.apache.lucene.store.MMapDirectory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Abstract
@Reflection.Name("FSDirectory")
@Reflection.Namespace(LuceneExtension.NS + "\\store")
public class WrapFSDirectory<T extends FSDirectory> extends WrapBaseDirectory<T> {
    public WrapFSDirectory(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapFSDirectory(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }
}
