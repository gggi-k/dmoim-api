package kr.dmoim.core.exception.handler;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.server.ResponseStatusException;

@Log4j2
@RestControllerAdvice
public class RestGlobalExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public RuntimeException runtimeException(RuntimeException e) {
        log.debug("확인용");
        return e;
    }
}
