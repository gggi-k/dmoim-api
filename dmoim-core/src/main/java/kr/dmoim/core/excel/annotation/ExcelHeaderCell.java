package kr.dmoim.core.excel.annotation;

import java.lang.annotation.*;

@Repeatable(ExcelHeaderCellContainer.class)
public @interface ExcelHeaderCell {

    String headerName();

    ExcelCellStyle headerCellStyle() default @ExcelCellStyle;
}
