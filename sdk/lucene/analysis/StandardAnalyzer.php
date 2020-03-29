<?php
namespace lucene\analysis;

use lucene\CharArraySet;

/**
 * Class StandardAnalyzer
 * @package lucene\analysis
 */
class StandardAnalyzer extends Analyzer
{
    public int $maxTokenLength;

    public function __construct(CharArraySet $stopWords = null)
    {
    }
}