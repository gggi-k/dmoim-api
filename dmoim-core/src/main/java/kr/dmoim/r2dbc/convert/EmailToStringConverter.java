package kr.dmoim.r2dbc.convert;

import kr.dmoim.core.domain.vo.Email;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

public class EmailToStringConverter {

    @ReadingConverter
    public static class EmailReadConverter implements Converter<String, Email> {

        @Override
        public Email convert(String source) {
            return Email.valueOf(source);
        }
    }

    @WritingConverter
    public static class EmailWriteConverter implements Converter<Email, String> {

        @Override
        public String convert(Email email) {
            return email.getValue();
        }
    }

}
