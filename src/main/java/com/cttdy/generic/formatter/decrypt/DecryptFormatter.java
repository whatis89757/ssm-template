package com.cttdy.generic.formatter.decrypt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class DecryptFormatter implements Formatter<String> {
    private static final Log log = LogFactory.getLog(DecryptFormatter.class);
    private Class<? extends Decryption> decryptorClass;

    public Class<? extends Decryption> getDecryptorType() {
        return decryptorClass;
    }

    public void setDecryptorType(Class<? extends Decryption> decryptorClass) {
        this.decryptorClass = decryptorClass;
    }

    @Override
    public String parse(String text, Locale locale) throws ParseException {
        try {
            Decryption decryption = decryptorClass.newInstance();
            return decryption.decrypt(text);
        } catch (NullPointerException e) {
            log.warn("Decryption cannot be null.", e);
        } catch (InstantiationException e) {
            log.warn("An object of class " + decryptorClass.getName() + " cannot be instantiated. Make sure that " +
                    "it includes an implicit or explicit no-arg constructor.", e);
        } catch (IllegalAccessException e) {
            log.warn("The class " + decryptorClass.getName() + " or its no-arg constructor are inaccessible.", e);
        }
        return text;
    }

    @Override
    public String print(String object, Locale locale) {
        return object;
    }
}
