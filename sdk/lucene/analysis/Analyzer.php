<?php
namespace lucene\analysis;

use lucene\TokenStream;
use php\io\File;
use php\io\Stream;

abstract class Analyzer
{
    public string $version = '8.5.0';

    /**
     * @param string $fieldName
     * @param string|Stream|File $reader
     * @return TokenStream
     */
    public function tokenStream(string $fieldName, $reader): TokenStream
    {
    }
}