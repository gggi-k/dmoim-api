package kr.dmoim.core.excel.aspect;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ExcelDownload {

    String DEFAULT_PASSWORD = "dmoim-excel-password";

    String workbookName();

    String password() default DEFAULT_PASSWORD;
}
