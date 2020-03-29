package org.develnext.jphp.ext.lucene.classes.index;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.codecs.Codec;
import org.apache.lucene.index.FieldInvertState;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.LogByteSizeMergePolicy;
import org.apache.lucene.index.MergePolicy;
import org.apache.lucene.search.CollectionStatistics;
import org.apache.lucene.search.Sort;
import org.apache.lucene.search.TermStatistics;
import org.apache.lucene.search.similarities.Similarity;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("IndexWriterConfig")
@Reflection.Namespace(LuceneExtension.NS + "\\index")
public class WrapIndexWriterConfig extends BaseWrapper<IndexWriterConfig> {
    public WrapIndexWriterConfig(Environment env, IndexWriterConfig wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapIndexWriterConfig(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __construct(null);
    }

    @Reflection.Signature
    public void __construct(@Reflection.Nullable Analyzer analyzer) {
        __wrappedObject = analyzer == null ? new IndexWriterConfig() : new IndexWriterConfig(analyzer);
    }
}
