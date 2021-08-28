package kr.dmoim.api.user.application.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
public class UserRequest {

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Size
    private String nickName;

    @NotBlank
    @Size
    @Pattern(regexp = "")
    private String password;
}
