<?php
namespace lucene\index;

use lucene\Analyzer;

/**
 *
 *
 * Class IndexWriterConfig
 * @package lucene\index
 */
class IndexWriterConfig
{
    /**
     * IndexWriterConfig constructor.
     * @param Analyzer|null $analyzer
     */
    public function __construct(Analyzer $analyzer = null)
    {
    }
}