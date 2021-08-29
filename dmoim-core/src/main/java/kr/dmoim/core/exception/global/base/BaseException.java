package kr.dmoim.core.exception.global.base;

import kr.dmoim.core.exception.code.ExceptionCode;

public abstract class BaseException extends RuntimeException {

    public abstract ExceptionCode getExceptionCode();
}
