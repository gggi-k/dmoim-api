package kr.dmoim.api.user.application.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import kr.dmoim.core.domain.vo.Email;
import kr.dmoim.core.domain.vo.Password;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@NoArgsConstructor(staticName = "create")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class UserRequest {

    @NotBlank(groups = UserValid.Create.class)
    @Schema
    private Email email;

    @NotBlank
    @Size(groups = UserValid.Create.class)
    @Schema
    private String nickName;

    @NotBlank
    @Size(groups = UserValid.Create.class)
    @Schema
    private Password password;

    @NotNull(groups = UserValid.Update.class)
    @Schema
    private Long version;
}
