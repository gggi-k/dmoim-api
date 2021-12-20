package kr.dmoim.core.excel.annotation;

import kr.dmoim.core.excel.code.ExcelColor;
import kr.dmoim.core.excel.code.ExcelDataFormat;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.ANNOTATION_TYPE)
@Documented
public @interface ExcelCellStyle {

    HorizontalAlignment align() default HorizontalAlignment.CENTER;

    ExcelColor foreground() default ExcelColor.NONE;

    FillPatternType foregroundPattern() default FillPatternType.NO_FILL;

    ExcelDataFormat dataFormat() default ExcelDataFormat.TEXT;
}
