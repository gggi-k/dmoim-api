package kr.dmoim.core.domain.vo;

import lombok.Value;

import javax.validation.constraints.Pattern;

@Value
public class Password {

    @Pattern(regexp = "")
    private final String value;
}
