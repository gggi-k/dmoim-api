package kr.dmoim.core.exception.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.server.ResponseStatusException;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    ENTITY_NOT_FOUND("해당 엔티티가 존재하지 않습니다");

    private final String message;
}
