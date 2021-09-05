package kr.dmoim.core.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.server.ResponseStatusException;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    NOT_FOUND_RESOURCE("해당 리소스가 존재하지 않습니다"),
    DUPLICATE_RESOURCE("해당 리소스가 중복됩니다"),
    BAD_REQUEST("잘못된 요청입니다"),
    UNKNOWN("알수없는 오류가 발생했습니다");

    private final String message;
}
