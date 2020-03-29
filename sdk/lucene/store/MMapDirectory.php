<?php
namespace lucene\store;

/**
 * Class MMapDirectory
 * @package lucene\store
 */
class MMapDirectory extends FSDirectory
{
    const DEFAULT_MAX_CHUNK_SIZE = 1 << 30; // JRE_IS_64BIT ? (1 << 30) : (1 << 28)

    /**
     * MMapDirectory constructor.
     * @param string $path
     * @param int $maxChunkSize
     */
    public function __construct(string $path, int $maxChunkSize = self::DEFAULT_MAX_CHUNK_SIZE)
    {
    }
}