package kr.dmoim.core.exception.global;

import kr.dmoim.core.exception.code.ExceptionCode;
import kr.dmoim.core.exception.global.base.BaseException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DuplicateException extends BaseException {

    @Override
    public ExceptionCode getExceptionCode() {
        return ExceptionCode.DUPLICATE_RESOURCE;
    }
}
