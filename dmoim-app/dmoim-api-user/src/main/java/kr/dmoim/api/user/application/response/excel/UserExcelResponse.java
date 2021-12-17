package kr.dmoim.api.user.application.response.excel;

import kr.dmoim.core.excel.annotation.ExcelCell;
import kr.dmoim.core.excel.annotation.ExcelSheet;
import kr.dmoim.domain.user.domain.entity.UserEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@ToString
@Builder(access = AccessLevel.PRIVATE)
@ExcelSheet(sheetName = "사용자 목록")
public class UserExcelResponse {

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

    public static UserExcelResponse fromEntity(UserEntity userEntity) {
        return UserExcelResponse.builder()
                .userId(userEntity.getUserId())
                .email(userEntity.getEmail().getValue())
                .nickName(userEntity.getNickName())
                .createdAt(userEntity.getCreatedAt())
                .updatedAt(userEntity.getUpdatedAt())
                .build();
    }

    public static List<UserExcelResponse> fromEntityList(List<UserEntity> userEntityList) {
        return userEntityList.stream().map(UserExcelResponse::fromEntity).collect(Collectors.toList());
    }
}

