package com.cttdy.generic.formatter.decrypt;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
public @interface DecryptFormat {
    Class<? extends Decryption> value() default OriginalDecryption.class;
}
