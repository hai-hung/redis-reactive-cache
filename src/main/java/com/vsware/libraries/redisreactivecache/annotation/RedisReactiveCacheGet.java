package com.vsware.libraries.redisreactivecache.annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedisReactiveCacheGet {
    String collection() default "";
    String key() default "";
    boolean useArgsHash() default false;
}
