package kr.dmoim.core.excel.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.poi.ss.usermodel.DataValidationConstraint;

@AllArgsConstructor
@Getter
public enum ExcelValidationType {

    ANY(DataValidationConstraint.ValidationType.ANY),
    INTEGER(DataValidationConstraint.ValidationType.INTEGER),
    DECIMAL(DataValidationConstraint.ValidationType.DECIMAL),
    LIST(DataValidationConstraint.ValidationType.LIST),
    DATE(DataValidationConstraint.ValidationType.DATE),
    TIME(DataValidationConstraint.ValidationType.TIME),
    TEXT_LENGTH(DataValidationConstraint.ValidationType.TEXT_LENGTH),
    FORMULA(DataValidationConstraint.ValidationType.FORMULA),
    YES_NO(null);

    private final Integer value;
}
