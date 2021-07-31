package kr.dmoim.user.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.dmoim.user.application.UserApplicationService;
import kr.dmoim.user.presentation.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
@Tag(name = "사용자")
public class UserController {

    private final UserApplicationService userApplicationService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    @Operation(description = "사용자목록 조회")
    public boolean findUserAll () {
        return true;
    }

    @GetMapping("/{userId}")
    @ResponseStatus(HttpStatus.OK)
    @Operation(description = "사용자 조회")
    public String findUserById (@PathVariable final String userId) {
        return userId;
    }

    @RequestMapping(value = "/duplicate/{userId}", method = RequestMethod.HEAD)
    @Operation(description = "사용자아이디 중복확인")
    public void isDuplicateByUserId (@PathVariable String userId) {

    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "사용자 생성")
    public boolean createUser (@RequestBody @Valid UserRequest userRequest) {
        return userApplicationService.createUser(userRequest);
    }

    @PutMapping("/{userId}")
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(description = "사용자 수정")
    public String updateUserById (@PathVariable final String userId) {
        return userId;
    }

    @DeleteMapping("/{userId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(description = "사용자 삭제")
    public String removeUserById (@PathVariable final String userId) {
        return userId;
    }
}
