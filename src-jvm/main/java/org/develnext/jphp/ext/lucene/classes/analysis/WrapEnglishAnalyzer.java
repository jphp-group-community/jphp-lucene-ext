package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("EnglishAnalyzer")
@Reflection.Namespace(LuceneExtension.NS + "\\analysis")
public class WrapEnglishAnalyzer extends WrapAnalyzer<EnglishAnalyzer> {
    public WrapEnglishAnalyzer(Environment env, EnglishAnalyzer wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapEnglishAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __construct(null);
    }

    @Reflection.Signature
    public void __construct(@Reflection.Nullable CharArraySet stopWords) {
        if (stopWords == null) {
            __wrappedObject = new EnglishAnalyzer();
        } else {
            __wrappedObject = new EnglishAnalyzer(stopWords);
        }
    }
}
