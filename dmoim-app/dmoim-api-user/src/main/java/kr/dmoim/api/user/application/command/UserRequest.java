package kr.dmoim.api.user.application.command;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.media.Schema;
import kr.dmoim.api.user.application.response.UserResponse;
import kr.dmoim.api.user.presentation.valid.UserValid;
import kr.dmoim.api.user.presentation.view.UserView;
import kr.dmoim.core.domain.vo.Email;
import kr.dmoim.core.domain.vo.Password;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.ConvertGroup;

@NoArgsConstructor(staticName = "create")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class UserRequest {


    @NotNull(groups = UserValid.Update.class)
    @JsonView(UserValid.Update.class)
    @Schema(description = "사용자 아이디", example = "test")
    private Long userId;

    @ConvertGroup(to = UserValid.Create.class)
    @Valid
    @JsonView(UserValid.Create.class)
    @Schema(type = "String", description = "이메일", example = "test@dmoim.com")
    private Email email;

    @NotBlank(groups = {UserValid.Create.class, UserValid.Update.class})
    @Size(groups = {UserValid.Create.class, UserValid.Update.class}, min = 3, max = 20)
    @JsonView({UserValid.Create.class, UserValid.Update.class})
    @Schema(description = "닉네임", example = "테스트네임")
    private String nickName;

    @ConvertGroup(to = UserValid.Create.class)
    @Valid
    @JsonView(UserValid.Create.class)
    @Schema(type = "String", description = "설명", example = "test12345")
    private Password password;

    @NotNull(groups = UserValid.Update.class)
    @JsonView(UserValid.Update.class)
    @Schema(description = "버전")
    private Long version;
}
