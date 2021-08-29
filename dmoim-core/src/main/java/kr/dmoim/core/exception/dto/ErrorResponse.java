package kr.dmoim.core.exception.dto;

import kr.dmoim.core.exception.code.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@ToString
@RequiredArgsConstructor(staticName = "of")
public class ErrorResponse {

    private final LocalDateTime timestamp = LocalDateTime.now();
    private final ErrorCode code;
    private final String message;
    private final HttpStatus status;

    @Setter
    @Accessors(chain = true)
    private List<FieldError> errors;

    public int getStatus () {
        return this.status.value();
    }
}
