package kr.dmoim.core.exception.handler;

import kr.dmoim.core.exception.code.ErrorCode;
import kr.dmoim.core.exception.dto.ErrorResponse;
import kr.dmoim.core.exception.global.DuplicateException;
import kr.dmoim.core.exception.global.NotFoundException;
import kr.dmoim.core.exception.global.base.BaseException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class RestGlobalExceptionHandler {
/*
    @ExceptionHandler(DuplicateException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ErrorResponse handleDuplicateException(DuplicateException e) {
        return ErrorResponse.of(e.getExceptionCode(), e.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handleNotFoundException(NotFoundException e) {
        return ErrorResponse.of(e.getExceptionCode(), e.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BaseException.class)
    public ErrorResponse handleBaseException(BaseException e) {
        return ErrorResponse.of(e.getExceptionCode(), e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return ErrorResponse.of(ErrorCode.BAD_REQUEST, e.getMessage(), HttpStatus.BAD_REQUEST)
                .setErrors(e.getFieldErrors());
    }

    @ExceptionHandler(Exception.class)
    public ErrorResponse handleException(Exception e) {
        return ErrorResponse.of(ErrorCode.UNKNOWN, e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }*/
}
