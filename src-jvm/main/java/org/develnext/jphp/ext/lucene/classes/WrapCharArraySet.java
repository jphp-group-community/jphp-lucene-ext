package org.develnext.jphp.ext.lucene.classes;

import org.apache.lucene.analysis.CharArraySet;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.ForeachIterator;
import php.runtime.lang.spl.Countable;
import php.runtime.lang.spl.Traversable;
import php.runtime.memory.LongMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.util.List;

@Reflection.Name("CharArraySet")
@Reflection.Namespace(LuceneExtension.NS)
public class WrapCharArraySet extends BaseWrapper<CharArraySet> implements Countable, Traversable {
    public WrapCharArraySet(Environment env, CharArraySet wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapCharArraySet(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Reflection.Signature
    public void __construct(List<String> collection, boolean ignoreCase) {
        __wrappedObject = new CharArraySet(collection, ignoreCase);
    }

    @Reflection.Signature
    public boolean add(String value) {
        return getWrappedObject().add(value);
    }

    @Reflection.Signature
    public boolean contains(String value) {
        return getWrappedObject().contains(value);
    }

    @Reflection.Signature
    public void clear() {
        getWrappedObject().clear();
    }

    @Reflection.Signature
    public Memory __toString(Environment env, Memory... args) {
        return StringMemory.valueOf(getWrappedObject().toString());
    }

    @Override
    @Reflection.Signature
    public Memory count(Environment environment, Memory... memories) {
        return LongMemory.valueOf(getWrappedObject().size());
    }

    @Override
    public ForeachIterator getNewIterator(Environment environment, boolean b, boolean b1) {
        return ForeachIterator.of(environment, (Iterable) getWrappedObject().iterator());
    }

    @Override
    public ForeachIterator getNewIterator(Environment environment) {
        return ForeachIterator.of(environment, (Iterable) getWrappedObject().iterator());
    }
}
