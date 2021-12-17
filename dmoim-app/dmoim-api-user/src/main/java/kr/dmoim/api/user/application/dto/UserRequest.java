package kr.dmoim.api.user.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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

    public interface Create {}
    public interface Update {}

    @NotNull(groups = Update.class)
    @Schema(description = "사용자 아이디", example = "test")
    private Long userId;

    @ConvertGroup(to = Create.class)
    @Valid
    @Schema(type = "String", description = "이메일", example = "test@dmoim.com")
    private Email email;

    @NotBlank(groups = {Create.class, Update.class})
    @Size(groups = Create.class, min = 3, max = 20)
    @Schema(description = "닉네임", example = "테스트네임")
    private String nickName;

    @ConvertGroup(to = Create.class)
    @Valid
    @Schema(type = "String", description = "설명", example = "test12345")
    private Password password;

    @NotNull(groups = Update.class)
    @Schema(description = "버전")
    private Long version;
}
