package kr.dmoim.core.excel.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ExcelBodyCell {

    ExcelCellStyle style() default @ExcelCellStyle;

    ExcelCellValid valid() default @ExcelCellValid;
}
