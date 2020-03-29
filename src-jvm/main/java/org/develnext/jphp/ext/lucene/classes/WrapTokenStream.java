package org.develnext.jphp.ext.lucene.classes;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.miscellaneous.EmptyTokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.Memory;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.common.collections.iterators.EmptyIterator;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.lang.ForeachIterator;
import php.runtime.lang.spl.Traversable;
import php.runtime.memory.ArrayMemory;
import php.runtime.memory.StringMemory;
import php.runtime.reflection.ClassEntity;

import java.io.IOException;
import java.util.Iterator;

@Reflection.Name("TokenStream")
@Reflection.Namespace(LuceneExtension.NS)
public class WrapTokenStream extends BaseWrapper<TokenStream> implements Traversable {
    interface WrappedInterface {
        void reset();
        boolean incrementToken();
        void close();
        void end();
    }

    public WrapTokenStream(Environment env, TokenStream wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapTokenStream(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void __construct() {
        __wrappedObject = new EmptyTokenStream();
    }

    @Signature
    public Memory getOffsets(Environment env, Memory... args) throws IOException {
        getWrappedObject().reset();
        getWrappedObject().clearAttributes();
        OffsetAttribute offsetAttribute = getWrappedObject().addAttribute(OffsetAttribute.class);

        ArrayMemory result = ArrayMemory.createListed(10);

        while (getWrappedObject().incrementToken()) {
            result.add(ArrayMemory.ofAny(env, offsetAttribute.startOffset(), offsetAttribute.endOffset()));
        }

        return result.toConstant();
    }

    @Signature
    public Memory getTerms(Environment env, Memory... args) throws IOException {
        getWrappedObject().reset();
        getWrappedObject().clearAttributes();
        CharTermAttribute charTermAttribute = getWrappedObject().addAttribute(CharTermAttribute.class);

        ArrayMemory result = ArrayMemory.createListed(10);

        while (getWrappedObject().incrementToken()) {
            result.add(charTermAttribute.toString());
        }

        return result.toConstant();
    }

    @Override
    public ForeachIterator getNewIterator(Environment environment, boolean b, boolean b1) {
        getWrappedObject().clearAttributes();
        CharTermAttribute charTermAttribute = getWrappedObject().addAttribute(CharTermAttribute.class);

        return ForeachIterator.of(environment, () -> {
            try {
                getWrappedObject().reset();
            } catch (IOException e) {
                environment.__throwThrowable(e);
                return EmptyIterator.getInstance();
            }

            return new Iterator() {
                @Override
                public boolean hasNext() {
                    try {
                        return getWrappedObject().incrementToken();
                    } catch (IOException e) {
                        environment.__throwThrowable(e);
                        return false;
                    }
                }

                @Override
                public Object next() {
                    return StringMemory.valueOf(charTermAttribute.toString());
                }
            };
        });
    }

    @Override
    public ForeachIterator getNewIterator(Environment environment) {
        return getNewIterator(environment, false, false);
    }
}
