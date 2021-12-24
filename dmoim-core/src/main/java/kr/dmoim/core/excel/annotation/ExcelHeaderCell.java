package kr.dmoim.core.excel.annotation;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(ExcelHeaderCell.List.class)
@Documented
public @interface ExcelHeaderCell {

    String headerName();

    ExcelCellStyle style() default @ExcelCellStyle;

    @Target(ElementType.FIELD)
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {

        ExcelHeaderCell[] value() default {};
    }
}
