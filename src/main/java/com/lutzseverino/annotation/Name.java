package com.lutzseverino.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Repeatable(Names.class)
public @interface Name {
    String value();
}
