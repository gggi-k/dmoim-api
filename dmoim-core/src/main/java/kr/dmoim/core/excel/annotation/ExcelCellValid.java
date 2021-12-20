package kr.dmoim.core.excel.annotation;

import kr.dmoim.core.excel.code.ExcelErrorStyle;
import kr.dmoim.core.excel.code.ExcelOperatorType;
import kr.dmoim.core.excel.code.ExcelValidationType;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Documented
public @interface ExcelCellValid {

    ExcelValidationType validationType() default ExcelValidationType.ANY;

    ExcelOperatorType operatorType() default ExcelOperatorType.BETWEEN;

    ExcelErrorStyle errorStyle() default ExcelErrorStyle.STOP;

    String formula1() default "";

    String formula2() default "";

    String promptTitle() default "";

    String promptMessage() default "";

    String errorTitle() default "";

    String errorMessage() default "";

}
