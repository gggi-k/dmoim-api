package kr.dmoim.core.bind.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Documented
public @interface ClientIp {
}
