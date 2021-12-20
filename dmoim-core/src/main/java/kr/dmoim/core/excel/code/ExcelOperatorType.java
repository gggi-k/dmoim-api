package kr.dmoim.core.excel.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.poi.ss.usermodel.DataValidationConstraint;

@Getter
@AllArgsConstructor
public enum ExcelOperatorType {

    NONE(null),
    BETWEEN(DataValidationConstraint.OperatorType.BETWEEN),
    NOT_BETWEEN(DataValidationConstraint.OperatorType.NOT_BETWEEN),
    EQUAL(DataValidationConstraint.OperatorType.EQUAL),
    NOT_EQUAL(DataValidationConstraint.OperatorType.NOT_EQUAL),
    GREATER_THAN(DataValidationConstraint.OperatorType.GREATER_THAN),
    LESS_THAN(DataValidationConstraint.OperatorType.LESS_THAN),
    GREATER_OR_EQUAL(DataValidationConstraint.OperatorType.GREATER_OR_EQUAL),
    LESS_OR_EQUAL(DataValidationConstraint.OperatorType.LESS_OR_EQUAL);

    private final Integer value;
}
