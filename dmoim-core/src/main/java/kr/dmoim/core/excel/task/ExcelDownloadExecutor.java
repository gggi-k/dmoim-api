package kr.dmoim.core.excel.task;

import lombok.extern.log4j.Log4j2;
import org.apache.poi.ss.formula.functions.T;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@Log4j2
@Component
public class ExcelDownloadExecutor {

    public void excelDownload(List<T> excelDtoList) throws IOException {

        SXSSFWorkbook wb = new SXSSFWorkbook();
        Sheet sheet = wb.createSheet(WorkbookUtil.createSafeSheetName("테스트"));
        Header header = sheet.getHeader();
        header.setCenter("센터용");

        FileOutputStream outputStream = new FileOutputStream("test.xlsx");
        wb.write(outputStream);
        outputStream.close();
        wb.dispose();
    }
}
