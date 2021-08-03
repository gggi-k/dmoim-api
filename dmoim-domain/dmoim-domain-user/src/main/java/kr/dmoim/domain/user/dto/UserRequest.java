package kr.dmoim.domain.user.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
public class UserRequest {

    @NotBlank
    @Size
    private String nickName;

    @NotBlank
    @Size
    @Pattern(regexp = "")
    private String password;
}
