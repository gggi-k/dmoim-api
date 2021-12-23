package kr.dmoim.core.exception.global;

import kr.dmoim.core.exception.code.ErrorCode;
import kr.dmoim.core.exception.global.base.BaseException;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
@NoArgsConstructor
public class DuplicateException extends BaseException {

    private static final long serialVersionUID = 2561415309670738111L;

    public DuplicateException(String message) {
        super(message);
    }

    @Override
    public ErrorCode getExceptionCode() {
        return ErrorCode.DUPLICATE_RESOURCE;
    }
}
