package kr.dmoim.core.excel.code;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public enum ExcelColor {

    NONE(null, "기본"),
    BLACK(Color.BLACK, "검정");

    private final Color color;
    private final String name;
}
