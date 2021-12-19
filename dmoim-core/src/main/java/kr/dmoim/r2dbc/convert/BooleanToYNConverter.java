package kr.dmoim.r2dbc.convert;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;
import org.springframework.data.convert.WritingConverter;

public class BooleanToYNConverter {

    private static final String TRUE = "Y", FALSE = "N";

    @ReadingConverter
    public static class YNReadConverter implements Converter<String, Boolean> {

        @Override
        public Boolean convert(String source) {
            return TRUE.equalsIgnoreCase(source);
        }
    }

    @WritingConverter
    public static class YNWriteConverter implements Converter<Boolean, String> {

        @Override
        public String convert(Boolean source) {
            return source.booleanValue() ? TRUE : FALSE;
        }
    }

}
