package kr.dmoim.domain.vo;

import lombok.Value;

@Value
public class Email {

    @javax.validation.constraints.Email
    private final String value;
}
