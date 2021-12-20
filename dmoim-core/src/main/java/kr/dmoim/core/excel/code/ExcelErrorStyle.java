package kr.dmoim.core.excel.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.poi.ss.usermodel.DataValidation;

@AllArgsConstructor
@Getter
public enum ExcelErrorStyle {

    STOP(DataValidation.ErrorStyle.STOP),
    WARNING(DataValidation.ErrorStyle.WARNING),
    INFO(DataValidation.ErrorStyle.INFO);

    private final Integer value;
}
