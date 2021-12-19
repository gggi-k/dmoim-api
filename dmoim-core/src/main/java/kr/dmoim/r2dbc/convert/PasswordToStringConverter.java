package kr.dmoim.r2dbc.convert;

import kr.dmoim.core.domain.vo.Password;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

public class PasswordToStringConverter {

    @ReadingConverter
    public static class PasswordReadConverter implements Converter<String, Password> {

        @Override
        public Password convert(String source) {
            return Password.valueOf(source);
        }
    }

    @WritingConverter
    public static class PasswordWriteConverter implements Converter<Password, String> {

        @Override
        public String convert(Password password) {
            return password.getValue();
        }
    }

}
