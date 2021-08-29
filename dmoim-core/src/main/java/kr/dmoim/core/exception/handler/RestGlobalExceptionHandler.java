package kr.dmoim.core.exception.handler;

import kr.dmoim.core.exception.code.ExceptionCode;
import kr.dmoim.core.exception.dto.ExceptionResponse;
import kr.dmoim.core.exception.global.DuplicateException;
import kr.dmoim.core.exception.global.base.BaseException;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Log4j2
@RestControllerAdvice
public class RestGlobalExceptionHandler {

    @ExceptionHandler(DuplicateException.class)
    public ResponseEntity<ExceptionResponse> handleDuplicateException(DuplicateException e) {
        return new ResponseEntity(ExceptionResponse
                .builder()
                .code(e.getExceptionCode())
                .message(e.getMessage())
                .status(HttpStatus.CONFLICT)
                .build(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(BaseException.class)
    public ResponseEntity<ExceptionResponse> handleBaseException(BaseException e) {
        return new ResponseEntity(ExceptionResponse
                .builder()
                .code(e.getExceptionCode())
                .message(e.getMessage())
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> handleException(Exception e, HttpStatus status) {
        return new ResponseEntity(ExceptionResponse
                .builder()
                .code(ExceptionCode.UNKNOWN)
                .message(e.getMessage())
                .status(status)
                .build(), status);
    }
}
