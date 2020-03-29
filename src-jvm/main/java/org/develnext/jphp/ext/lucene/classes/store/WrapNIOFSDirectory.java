package org.develnext.jphp.ext.lucene.classes.store;

import org.apache.lucene.store.NIOFSDirectory;
import org.apache.lucene.store.SimpleFSDirectory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;
import java.nio.file.Paths;

@Reflection.Name("NIOFSDirectory")
@Reflection.Namespace(LuceneExtension.NS + "\\store")
public class WrapNIOFSDirectory extends WrapFSDirectory<NIOFSDirectory> {
    public WrapNIOFSDirectory(Environment env, NIOFSDirectory wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapNIOFSDirectory(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(String path) throws IOException {
        __wrappedObject = new NIOFSDirectory(Paths.get(path));
    }
}
