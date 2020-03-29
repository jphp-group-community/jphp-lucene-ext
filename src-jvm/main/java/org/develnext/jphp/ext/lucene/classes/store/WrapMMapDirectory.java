package org.develnext.jphp.ext.lucene.classes.store;

import org.apache.lucene.store.MMapDirectory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;
import java.nio.file.Paths;

@Reflection.Name("MMapDirectory")
@Reflection.Namespace(LuceneExtension.NS + "\\store")
public class WrapMMapDirectory extends WrapFSDirectory<MMapDirectory> {
    public final static int DEFAULT_MAX_CHUNK_SIZE = MMapDirectory.DEFAULT_MAX_CHUNK_SIZE;

    public WrapMMapDirectory(Environment env, MMapDirectory wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapMMapDirectory(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct(String path) throws IOException {
        __wrappedObject = new MMapDirectory(Paths.get(path));

    }

    @Signature
    public void __construct(String path, int maxChunkSize) throws IOException {
        __wrappedObject = new MMapDirectory(Paths.get(path), maxChunkSize);
    }
}
