<?php
namespace lucene\analysis;

use lucene\CharArraySet;

/**
 * Class StopAnalyzer
 * @package lucene
 */
class StopAnalyzer extends Analyzer
{
    public function __construct(CharArraySet $stopWords = null)
    {
    }
}