package org.develnext.jphp.ext.lucene.classes.analysis;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.CharArraySet;
import org.apache.lucene.analysis.StopwordAnalyzerBase;
import org.apache.lucene.analysis.ar.ArabicAnalyzer;
import org.apache.lucene.analysis.bg.BulgarianAnalyzer;
import org.apache.lucene.analysis.bn.BengaliAnalyzer;
import org.apache.lucene.analysis.br.BrazilianAnalyzer;
import org.apache.lucene.analysis.ca.CatalanAnalyzer;
import org.apache.lucene.analysis.cz.CzechAnalyzer;
import org.apache.lucene.analysis.da.DanishAnalyzer;
import org.apache.lucene.analysis.de.GermanAnalyzer;
import org.apache.lucene.analysis.el.GreekAnalyzer;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.es.SpanishAnalyzer;
import org.apache.lucene.analysis.et.EstonianAnalyzer;
import org.apache.lucene.analysis.eu.BasqueAnalyzer;
import org.apache.lucene.analysis.fa.PersianAnalyzer;
import org.apache.lucene.analysis.fi.FinnishAnalyzer;
import org.apache.lucene.analysis.fr.FrenchAnalyzer;
import org.apache.lucene.analysis.ga.IrishAnalyzer;
import org.apache.lucene.analysis.gl.GalicianAnalyzer;
import org.apache.lucene.analysis.hi.HindiAnalyzer;
import org.apache.lucene.analysis.hu.HungarianAnalyzer;
import org.apache.lucene.analysis.hy.ArmenianAnalyzer;
import org.apache.lucene.analysis.id.IndonesianAnalyzer;
import org.apache.lucene.analysis.it.ItalianAnalyzer;
import org.apache.lucene.analysis.lt.LithuanianAnalyzer;
import org.apache.lucene.analysis.lv.LatvianAnalyzer;
import org.apache.lucene.analysis.nl.DutchAnalyzer;
import org.apache.lucene.analysis.no.NorwegianAnalyzer;
import org.apache.lucene.analysis.pt.PortugueseAnalyzer;
import org.apache.lucene.analysis.ro.RomanianAnalyzer;
import org.apache.lucene.analysis.ru.RussianAnalyzer;
import org.apache.lucene.analysis.sv.SwedishAnalyzer;
import org.apache.lucene.analysis.th.ThaiAnalyzer;
import org.apache.lucene.analysis.tr.TurkishAnalyzer;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseObject;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Final
@Reflection.Name("LanguageAnalyzer")
@Reflection.Namespace(LuceneExtension.NS + "\\analysis")
public class WrapLanguageAnalyzer extends BaseObject {

    public WrapLanguageAnalyzer(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public static Analyzer create(String lang) {
        return create(lang, null, null);
    }

    @Reflection.Signature
    public static Analyzer create(String lang, @Reflection.Nullable CharArraySet stopWords) {
        return create(lang, stopWords, null);
    }

    @Reflection.Signature
    public static Analyzer create(String lang, @Reflection.Nullable CharArraySet stopWords, @Reflection.Nullable CharArraySet stemExcludeSet) {
        Analyzer analyzer = null;

        switch (lang) {
            case "en": analyzer = new EnglishAnalyzer(stopWords, stemExcludeSet); break;
            case "ru": analyzer = new RussianAnalyzer(stopWords, stemExcludeSet); break;
            case "ar": analyzer = new ArabicAnalyzer(stopWords, stemExcludeSet); break;
            case "bg": analyzer = new BulgarianAnalyzer(stopWords, stemExcludeSet); break;
            case "bn": analyzer = new BengaliAnalyzer(stopWords, stemExcludeSet); break;
            case "br": analyzer = new BrazilianAnalyzer(stopWords, stemExcludeSet); break;
            case "ca": analyzer = new CatalanAnalyzer(stopWords, stemExcludeSet); break;
            case "cz": analyzer = new CzechAnalyzer(stopWords, stemExcludeSet); break;
            case "da": analyzer = new DanishAnalyzer(stopWords, stemExcludeSet); break;
            case "de": analyzer = new GermanAnalyzer(stopWords, stemExcludeSet); break;
            case "el": analyzer = new GreekAnalyzer(stopWords); break;
            case "es": analyzer = new SpanishAnalyzer(stopWords, stemExcludeSet); break;
            case "et": analyzer = new EstonianAnalyzer(stopWords, stemExcludeSet); break;
            case "eu": analyzer = new BasqueAnalyzer(stopWords, stemExcludeSet); break;
            case "fa": analyzer = new PersianAnalyzer(stopWords); break;
            case "fi": analyzer = new FinnishAnalyzer(stopWords, stemExcludeSet); break;
            case "fr": analyzer = new FrenchAnalyzer(stopWords, stemExcludeSet); break;
            case "ga": analyzer = new IrishAnalyzer(stopWords, stemExcludeSet); break;
            case "gl": analyzer = new GalicianAnalyzer(stopWords, stemExcludeSet); break;
            case "hi": analyzer = new HindiAnalyzer(stopWords, stemExcludeSet); break;
            case "hu": analyzer = new HungarianAnalyzer(stopWords, stemExcludeSet); break;
            case "hy": analyzer = new ArmenianAnalyzer(stopWords, stemExcludeSet); break;
            case "id": analyzer = new IndonesianAnalyzer(stopWords, stemExcludeSet); break;
            case "it": analyzer = new ItalianAnalyzer(stopWords, stemExcludeSet); break;
            case "lt": analyzer = new LithuanianAnalyzer(stopWords, stemExcludeSet); break;
            case "lv": analyzer = new LatvianAnalyzer(stopWords, stemExcludeSet); break;
            case "nl": analyzer = new DutchAnalyzer(stopWords, stemExcludeSet); break;
            case "no": analyzer = new NorwegianAnalyzer(stopWords, stemExcludeSet); break;
            case "pt": analyzer = new PortugueseAnalyzer(stopWords, stemExcludeSet); break;
            case "ro": analyzer = new RomanianAnalyzer(stopWords, stemExcludeSet); break;
            case "sv": analyzer = new SwedishAnalyzer(stopWords, stemExcludeSet); break;
            case "th": analyzer = new ThaiAnalyzer(stopWords); break;
            case "tr": analyzer = new TurkishAnalyzer(stopWords, stemExcludeSet); break;
            default:
                throw new IllegalArgumentException("Unknown lang - " + lang);
        }

        return analyzer;
    }
}
