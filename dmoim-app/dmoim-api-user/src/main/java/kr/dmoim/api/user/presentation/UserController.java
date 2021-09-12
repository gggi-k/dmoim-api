package kr.dmoim.api.user.presentation;

import com.fasterxml.jackson.annotation.JsonView;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.dmoim.api.user.application.dto.UserRequest;
import kr.dmoim.api.user.application.dto.UserResponse;
import kr.dmoim.api.user.application.dto.UserValid;
import kr.dmoim.api.user.application.dto.UserViews;
import kr.dmoim.api.user.application.service.UserApplicationService;
import kr.dmoim.core.exception.global.DuplicateException;
import kr.dmoim.domain.user.domain.service.UserDomainService;
import kr.dmoim.domain.vo.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users")
@Tag(name = "사용자", description = "(조회, 등록, 수정, 중복확인)")
public class UserController {

    private final UserApplicationService userApplicationService;
    private final UserDomainService userDomainService;
    private final MessageSourceAccessor messageSourceAccessor;

    @GetMapping
    @Operation(summary = "사용자목록 조회")
    public Flux<UserResponse> findAll () {
        return userApplicationService.findAll();
    }

    @GetMapping("/{userId}")
    @JsonView(UserViews.List.class)
    @Operation(summary = "사용자 조회")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "데이터가 존재합니다"),
        @ApiResponse(responseCode = "404", description = "데이터가 존재하지않습니다", content = @Content)
    })
    public UserResponse findById (@PathVariable final Long userId) {
        return UserResponse.builder().build();
        /*return userApplicationService.findById(userId);*/
    }

    @RequestMapping(value = "/duplicate/email/{email}", method = RequestMethod.HEAD)
    @Operation(summary = "사용자 이메일 중복확인")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "중복된 이메일이 존재하지않습니다"),
        @ApiResponse(responseCode = "409", description = "중복된 이메일 존재합니다")
    })
    public void isDuplicateByUserId (@Parameter(description = "이메일") @PathVariable final Email email) {
        if(userDomainService.isDuplicateByEmail(email)) throw new DuplicateException("중복된 이메일 존재합니다");
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "사용자 생성")
    public Mono<UserResponse> create (@RequestBody @Validated(UserValid.Create.class) UserRequest userRequest) {
        return userApplicationService.create(userRequest);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "사용자 수정")
    public Long updateById (@Parameter(description = "사용자 아이디") @PathVariable final Long userId,
                            @RequestBody @Validated(UserValid.Update.class) UserRequest userRequest) {
        return userId;
    }


    @PatchMapping("/{userId}/password")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "사용자 비밀번호 변경")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "비밀번호가 변경되었습니다"),
        @ApiResponse(responseCode = "404", description = "존재하지않는 사용자입니다")
    })
    public void changePassword(@Parameter(description = "사용자 아이디") @PathVariable Long userId) {
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "사용자 삭제")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "사용자가 삭제되었습니다"),
        @ApiResponse(responseCode = "404", description = "존재하지않는 사용자입니다")
    })
    public void removeById (@Parameter(description = "사용자 아이디") @PathVariable final Long userId) {
    }
}
