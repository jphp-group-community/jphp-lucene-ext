package org.develnext.jphp.ext.lucene;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.core.StopAnalyzer;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.ru.RussianAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.*;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.store.*;
import org.develnext.jphp.ext.lucene.classes.analysis.*;
import org.develnext.jphp.ext.lucene.classes.WrapCharArraySet;
import org.develnext.jphp.ext.lucene.classes.WrapTokenStream;
import org.develnext.jphp.ext.lucene.classes.document.*;
import org.develnext.jphp.ext.lucene.classes.index.WrapIndexWriter;
import org.develnext.jphp.ext.lucene.classes.index.WrapIndexWriterConfig;
import org.develnext.jphp.ext.lucene.classes.store.*;
import php.runtime.env.CompileScope;
import php.runtime.ext.support.Extension;

public class LuceneExtension extends Extension {
    public static final String NS = "lucene";

    @Override
    public String[] getPackageNames() {
        return new String[] { "lucene" };
    }

    @Override
    public Status getStatus() {
        return Status.BETA;
    }

    @Override
    public void onRegister(CompileScope compileScope) {
        registerWrapperClass(compileScope, CharArraySet.class, WrapCharArraySet.class);
        registerWrapperClass(compileScope, TokenStream.class, WrapTokenStream.class);

        registerWrapperClass(compileScope, Analyzer.class, WrapAnalyzer.class);
        registerWrapperClass(compileScope, StandardAnalyzer.class, WrapStandardAnalyzer.class);
        registerWrapperClass(compileScope, StopAnalyzer.class, WrapStopAnalyzer.class);
        registerWrapperClass(compileScope, EnglishAnalyzer.class, WrapEnglishAnalyzer.class);
        registerWrapperClass(compileScope, RussianAnalyzer.class, WrapEnglishAnalyzer.class);
        registerClass(compileScope, WrapLanguageAnalyzer.class);

        registerWrapperClass(compileScope, Directory.class, WrapDirectory.class);
        registerWrapperClass(compileScope, BaseDirectory.class, WrapBaseDirectory.class);
        registerWrapperClass(compileScope, FSDirectory.class, WrapFSDirectory.class);
        registerWrapperClass(compileScope, SimpleFSDirectory.class, WrapSimpleFSDirectory.class);
        registerWrapperClass(compileScope, MMapDirectory.class, WrapMMapDirectory.class);

        registerWrapperClass(compileScope, Document.class, WrapDocument.class);
        registerWrapperClass(compileScope, Field.class, WrapField.class);
        registerWrapperClass(compileScope, StoredField.class, WrapStoredField.class);
        registerWrapperClass(compileScope, StringField.class, WrapStringField.class);
        registerWrapperClass(compileScope, TextField.class, WrapTextField.class);

        registerWrapperClass(compileScope, IndexWriterConfig.class, WrapIndexWriterConfig.class);
        registerWrapperClass(compileScope, IndexWriter.class, WrapIndexWriter.class);
    }
}
