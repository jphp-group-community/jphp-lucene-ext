package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name("StandardAnalyzer")
@Namespace(LuceneExtension.NS + "\\analysis")
public class WrapStandardAnalyzer extends WrapAnalyzer<StandardAnalyzer> {
    interface WrappedInterface {
        @Property int maxTokenLength();
    }

    public WrapStandardAnalyzer(Environment env, StandardAnalyzer wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapStandardAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct() {
        __construct(null);
    }

    @Signature
    public void __construct(@Nullable CharArraySet stopWords) {
        if (stopWords == null) {
            __wrappedObject = new StandardAnalyzer();
        } else {
            __wrappedObject = new StandardAnalyzer(stopWords);
        }
    }
}
