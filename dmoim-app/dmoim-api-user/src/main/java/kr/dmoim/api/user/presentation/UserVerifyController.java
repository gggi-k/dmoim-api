package kr.dmoim.api.user.presentation;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/users-verify")
@Tag(name = "사용자 확인", description = "(아이디, 비밀번호 찾기)")
public class UserVerifyController {

    @PostMapping("/email")
    @Operation(summary = "이메일 인증")
    public void verifyEmail() {

    }
}
