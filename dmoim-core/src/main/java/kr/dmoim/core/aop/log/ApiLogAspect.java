package kr.dmoim.core.aop.log;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Log4j2
@RequiredArgsConstructor
@Component
public class ApiLogAspect {

    @Pointcut("@annotation(ApiLog)")
    public void pointcutApiLog() {}

    @AfterReturning(pointcut = "pointcutApiLog()", returning = "result")
    public void afterReturningApiLog(JoinPoint joinPoint, Object result) {

    }

    @AfterThrowing(pointcut = "pointcutApiLog()", throwing = "exception")
    public void afterThrowingApiLog(JoinPoint joinPoint, Exception exception) {

    }
}
