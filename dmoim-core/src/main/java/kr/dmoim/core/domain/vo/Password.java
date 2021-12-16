package kr.dmoim.core.domain.vo;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Value(staticConstructor = "valueOf")
public class Password {

    @NotBlank
    @Size(min = 4, max = 20)
    private final String value;
}
