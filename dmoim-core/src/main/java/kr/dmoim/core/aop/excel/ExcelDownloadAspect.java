package kr.dmoim.core.aop.excel;

import kr.dmoim.core.excel.task.ExcelDownloadExecutor;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Log4j2
@RequiredArgsConstructor
@Aspect
@Component
public class ExcelDownloadAspect {

    private final ExcelDownloadExecutor excelDownloadExecutor;

    @AfterReturning(value = "@annotation(kr.dmoim.core.aop.excel.ExcelDownload)")
    public void excelDownloadAfterReturn(JoinPoint joinpoint) throws IOException {
        excelDownloadExecutor.excelDownload(null);
    }
}
