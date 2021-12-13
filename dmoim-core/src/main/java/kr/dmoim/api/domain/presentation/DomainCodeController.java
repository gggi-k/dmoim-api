package kr.dmoim.api.domain.presentation;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/domain")
public class DomainCodeController {

    @GetMapping("/codes")
    public String findDomainCodes() {
        return null;
    }
}
