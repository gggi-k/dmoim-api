package kr.dmoim.core.excel.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelCell {

    String headerName();

    ExcelCellStyle headerCellStyle() default @ExcelCellStyle;
}
