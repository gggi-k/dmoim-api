package kr.dmoim.core.domain.code.annotation;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
public @interface DomainGroupCode {

    String groupCode() default "";

    String groupName();

    String description() default "";
}
