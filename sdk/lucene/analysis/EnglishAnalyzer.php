<?php
namespace lucene\analysis;

use lucene\CharArraySet;

/**
 * Class EnglishAnalyzer
 * @package lucene
 */
class EnglishAnalyzer extends Analyzer
{
    public function __construct(CharArraySet $stopWords = null)
    {
    }
}