package kr.dmoim.core.excel.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExcelDataFormat {

    TEXT("@"),
    INTEGER("0"),
    DECIMAL("0.00"),
    CURRENCY("#,##0"),
    DATE("yyyy-mm-dd;@");

    private final String value;
}
