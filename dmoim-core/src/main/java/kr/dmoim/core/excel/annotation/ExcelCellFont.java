package kr.dmoim.core.excel.annotation;

import kr.dmoim.core.excel.code.ExcelColor;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface ExcelCellFont {

    ExcelColor color() default ExcelColor.BLACK;

    boolean bold() default false;
}
