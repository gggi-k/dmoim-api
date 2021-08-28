package kr.dmoim.api.user.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.dmoim.api.user.application.service.UserApplicationService;
import kr.dmoim.api.user.application.dto.UserRequest;
import kr.dmoim.domain.user.domain.entity.User;
import kr.dmoim.domain.user.domain.service.UserDomainService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@Tag(name = "사용자", description = "(조회, 등록, 수정, 중복확인)")
public class UserController {

    private final UserApplicationService userApplicationService;
    private final UserDomainService userDomainService;

    private final MessageSourceAccessor messageSourceAccessor;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "사용자목록 조회")
    public boolean findAll () {
        return true;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "사용자 조회")
    public Mono<User> findById (@PathVariable final Long userId) {
        return userApplicationService.findById(userId);
    }

    @RequestMapping(value = "/duplicate/{email}", method = RequestMethod.HEAD)
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "사용자 이메일 중복확인",
        responses = {
            @ApiResponse(responseCode = "200", description = "중복된 이메일이 존재하지않습니다"),
            @ApiResponse(responseCode = "409", description = "중복된 이메일 존재합니다")
        }
    )
    public void isDuplicateByUserId (@Parameter(description = "이메일")
                                     @PathVariable final String email) {
        userDomainService.isDuplicateByEmail(email);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "사용자 생성")
    public boolean create (@RequestBody @Valid UserRequest userRequest, BindingResult result) {
        return userApplicationService.create(userRequest);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(summary = "사용자 수정")
    public Long updateById (@Parameter(description = "유저아이디")
                              @PathVariable final Long userId) {
        return userId;
    }


    @PatchMapping("/{userId}/password")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "사용자 비밀번호 변경")
    public void changePassword(@Parameter(description = "유저아이디")
                                 @PathVariable Long userId) {
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(summary = "사용자 삭제")
    public void removeById (@Parameter(description = "유저아이디")
                              @PathVariable final Long userId) {
    }
}
