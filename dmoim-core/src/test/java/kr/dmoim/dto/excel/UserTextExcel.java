package kr.dmoim.dto.excel;

import kr.dmoim.core.excel.annotation.ExcelCell;
import kr.dmoim.core.excel.annotation.ExcelSheet;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
@ExcelSheet(sheetName = "사용자 목록")
public class UserTextExcel {

    @ExcelCell(headerName = "사용자 아이디")
    private final Long userId;

    @ExcelCell(headerName = "이메일")
    private final String email;

    @ExcelCell(headerName = "닉네임")
    private final String nickName;

    @ExcelCell(headerName = "등록일시")
    private final LocalDateTime createdAt;

    @ExcelCell(headerName = "수정일시")
    private final LocalDateTime updatedAt;
}
