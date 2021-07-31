package kr.dmoim.user.presentation.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class UserRequest {

    @NotBlank
    private String nickName;
}
