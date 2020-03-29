package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.util.Version;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Abstract;
import php.runtime.annotation.Reflection.Getter;
import php.runtime.annotation.Reflection.Name;
import php.runtime.annotation.Reflection.Setter;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

import java.io.Reader;
import java.text.ParseException;

@Abstract
@Name(LuceneExtension.NS + "\\analysis")
public class WrapAnalyzer<T extends Analyzer> extends BaseWrapper<T> {
    public WrapAnalyzer(Environment env, T wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    public TokenStream tokenStream(String fieldName, Reader text) {
        return getWrappedObject().tokenStream(fieldName, text);
    }

    @Getter
    public String getVersion() {
        Version version = getWrappedObject().getVersion();
        return version.toString();
    }

    @Setter
    public void setVersion(String version) throws ParseException {
        getWrappedObject().setVersion(Version.parse(version));
    }
}
