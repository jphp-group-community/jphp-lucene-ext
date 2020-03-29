package org.develnext.jphp.ext.lucene.classes.index;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.Directory;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;

@Reflection.Name("IndexWriter")
@Reflection.Namespace(LuceneExtension.NS + "\\index")
public class WrapIndexWriter extends BaseWrapper<IndexWriter> {
    public WrapIndexWriter(Environment env, IndexWriter wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapIndexWriter(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(Directory directory, IndexWriterConfig config) throws IOException {
        __wrappedObject = new IndexWriter(directory, config);
    }

    @Reflection.Signature
    public long addDocument(Document document) throws IOException {
        return getWrappedObject().addDocument(document);
    }
}
