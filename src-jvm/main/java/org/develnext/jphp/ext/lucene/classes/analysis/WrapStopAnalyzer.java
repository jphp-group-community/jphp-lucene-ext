package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection.*;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Name("StopAnalyzer")
@Namespace(LuceneExtension.NS + "\\analysis")
public class WrapStopAnalyzer extends WrapAnalyzer<StopAnalyzer> {
    public WrapStopAnalyzer(Environment env, StopAnalyzer wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapStopAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct() {
        __construct(null);
    }

    @Signature
    public void __construct(@Nullable CharArraySet stopWords) {
        __wrappedObject = new StopAnalyzer(stopWords);
    }
}
