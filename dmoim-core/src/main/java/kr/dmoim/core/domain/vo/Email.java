package kr.dmoim.core.domain.vo;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value(staticConstructor = "valueOf")
public class Email {

    @NotBlank
    @JsonValue
    String value;

    public String getId() {
        return this.value;
    }

    public String getDomain() {
        return this.value;
    }
}
