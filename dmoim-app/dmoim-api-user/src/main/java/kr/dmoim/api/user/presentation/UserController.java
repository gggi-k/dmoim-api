package kr.dmoim.api.user.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.dmoim.api.user.application.UserApplicationService;
import kr.dmoim.domain.user.domain.entity.User;
import kr.dmoim.domain.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@Tag(name = "사용자 API 목록")
public class UserController {

    private final UserApplicationService userApplicationService;

    private final MessageSourceAccessor messageSourceAccessor;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(description = "사용자목록 조회")
    public boolean findAll () {
        return true;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(description = "사용자 조회")
    public Mono<User> findById (@PathVariable final Long userId) {
        return userApplicationService.findById(userId);
    }

    @RequestMapping(value = "/duplicate/{userId}", method = RequestMethod.HEAD)
    @Operation(description = "사용자아이디 중복확인")
    public void isDuplicateByUserId (@PathVariable String userId) {

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "사용자 생성")
    public boolean create (@RequestBody @Valid UserRequest userRequest, BindingResult result) {
        return userApplicationService.create(userRequest);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "사용자 수정")
    public String updateById (@PathVariable final String userId) {
        return userId;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(description = "사용자 삭제")
    public String removeById (@PathVariable final String userId) {
        return userId;
    }
}
