<?php
namespace lucene\analysis;

use lucene\CharArraySet;

/**
 * Class EnglishAnalyzer
 * @package lucene
 */
final class LanguageAnalyzer
{
    /**
     * LanguageAnalyzer constructor.
     * @param string $lang like ru, en, it, es, de, etc.
     * @param CharArraySet|null $stopWords a stopword set
     * @param CharArraySet|null $stemExclusionSet a set of terms not to be stemmed
     * @return Analyzer
     */
    public static function create(string $lang, CharArraySet $stopWords = null, CharArraySet $stemExclusionSet = null): Analyzer
    {
    }
}