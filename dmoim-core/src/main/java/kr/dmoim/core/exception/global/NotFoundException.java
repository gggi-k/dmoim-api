package kr.dmoim.core.exception.global;

import kr.dmoim.core.exception.code.ErrorCode;
import kr.dmoim.core.exception.global.base.BaseException;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class NotFoundException extends BaseException {

    private static final long serialVersionUID = -7105189678489695490L;

    public NotFoundException(String message) {
        super(message);
    }

    @Override
    public ErrorCode getExceptionCode() {
        return ErrorCode.NOT_FOUND_RESOURCE;
    }
}
