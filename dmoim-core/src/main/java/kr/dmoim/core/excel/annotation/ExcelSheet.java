package kr.dmoim.core.excel.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelSheet {

    String sheetName();

    int startBodyRow() default 1;
}
