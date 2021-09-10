package kr.dmoim.api.user.application.dto;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tags;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@NoArgsConstructor(staticName = "create")
@Getter
@Setter
@Accessors(chain = true)
@ToString
public class UserRequest {

    @NotBlank(groups = UserValid.Create.class)
    @Email
    @Schema
    private String email;

    @NotBlank
    @Size(groups = UserValid.Create.class)
    @Schema
    private String nickName;

    @NotBlank
    @Size(groups = UserValid.Create.class)
    @Pattern(regexp = "")
    @Schema
    private String password;

    @NotNull(groups = UserValid.Update.class)
    @Schema
    private Long version;
}
