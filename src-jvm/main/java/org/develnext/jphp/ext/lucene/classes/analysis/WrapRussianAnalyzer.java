package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.ru.RussianAnalyzer;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("RussianAnalyzer")
@Reflection.Namespace(LuceneExtension.NS + "\\analysis")
public class WrapRussianAnalyzer extends WrapAnalyzer<RussianAnalyzer> {
    public WrapRussianAnalyzer(Environment env, RussianAnalyzer wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapRussianAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct() {
        __construct(null);
    }

    @Reflection.Signature
    public void __construct(@Reflection.Nullable CharArraySet stopWords) {
        if (stopWords == null) {
            __wrappedObject = new RussianAnalyzer();
        } else {
            __wrappedObject = new RussianAnalyzer(stopWords);
        }
    }
}
