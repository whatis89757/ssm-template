package com.cttdy.generic.formatter.decrypt;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DecryptFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<DecryptFormat> {
    private static final Set<Class<?>> FIELD_TYPES;

    static {
        Set<Class<?>> fieldTypes = new HashSet<>(4);
        fieldTypes.add(String.class);
        FIELD_TYPES = Collections.unmodifiableSet(fieldTypes);
    }

    @Override
    public Set<Class<?>> getFieldTypes() {
        return FIELD_TYPES;
    }

    @Override
    public Printer<?> getPrinter(DecryptFormat annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    @Override
    public Parser<?> getParser(DecryptFormat annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    protected Formatter<String> getFormatter(DecryptFormat annotation, Class<?> fieldType) {
        DecryptFormatter formatter = new DecryptFormatter();
        Class<? extends Decryption> decryptorClass = annotation.value();
        formatter.setDecryptorType(decryptorClass);
        return formatter;
    }
}
