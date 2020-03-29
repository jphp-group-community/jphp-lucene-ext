<?php

use lucene\CharArraySet;

$class = new ReflectionClass(CharArraySet::class);
$method = $class->getMethod('add');

foreach ($method->getParameters() as $parameter) {
    echo ($parameter->getName()), ", ";
}