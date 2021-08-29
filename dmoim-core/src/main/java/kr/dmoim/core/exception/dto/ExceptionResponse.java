package kr.dmoim.core.exception.dto;

import kr.dmoim.core.exception.code.ExceptionCode;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Getter
@ToString
@Builder
public class ExceptionResponse {

    private final LocalDateTime timestamp = LocalDateTime.now();
    private final ExceptionCode code;
    private final String message;
    private final HttpStatus status;

}
