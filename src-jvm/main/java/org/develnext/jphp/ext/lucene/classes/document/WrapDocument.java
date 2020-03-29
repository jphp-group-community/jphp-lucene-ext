package org.develnext.jphp.ext.lucene.classes.document;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.develnext.jphp.ext.lucene.LuceneExtension;
import php.runtime.annotation.Reflection;
import php.runtime.annotation.Reflection.Signature;
import php.runtime.env.Environment;
import php.runtime.lang.BaseWrapper;
import php.runtime.reflection.ClassEntity;

@Reflection.Name("Document")
@Reflection.Namespace(LuceneExtension.NS + "\\document")
public class WrapDocument extends BaseWrapper<Document> {
    public WrapDocument(Environment env, Document wrappedObject) {
        super(env, wrappedObject);
    }

    public WrapDocument(Environment env, ClassEntity clazz) {
        super(env, clazz);
    }

    @Signature
    public void add(Field field) {
        getWrappedObject().add(field);
    }
}
