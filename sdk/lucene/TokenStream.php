<?php
namespace lucene;

/**
 * Class TokenStream
 * @package lucene
 */
class TokenStream implements \Traversable
{
    function reset(): void {}
    function incrementToken(): bool {}
    function close(): void {}
    function end(): void {}

    /**
     * @return array of string
     */
    function getTerms(): array {}

    /**
     * @return array [[start, end], [start, end], ...]
     */
    function getOffsets(): array {}
}