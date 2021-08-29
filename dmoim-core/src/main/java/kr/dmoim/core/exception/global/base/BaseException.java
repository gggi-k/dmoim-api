package kr.dmoim.core.exception.global.base;

import kr.dmoim.core.exception.code.ErrorCode;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseException extends RuntimeException {

    private static final long serialVersionUID = -7904488785802004863L;

    protected BaseException(String message) {
        super(message);
    }

    public abstract ErrorCode getExceptionCode();
}
