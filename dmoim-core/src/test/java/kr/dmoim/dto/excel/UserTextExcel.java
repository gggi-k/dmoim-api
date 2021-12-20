package kr.dmoim.dto.excel;

import kr.dmoim.core.excel.annotation.ExcelHeaderCell;
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

    @ExcelHeaderCell(headerName = "사용자 아이디")
    private final Long userId;

    @ExcelHeaderCell(headerName = "이메일")
    private final String email;

    @ExcelHeaderCell(headerName = "닉네임")
    private final String nickName;

    @ExcelHeaderCell(headerName = "등록일시")
    private final LocalDateTime createdAt;

    @ExcelHeaderCell(headerName = "수정일시")
    private final LocalDateTime updatedAt;
}
