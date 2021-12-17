package kr.dmoim.domain.user.domain.service;

import kr.dmoim.domain.user.repository.UserRepository;
import kr.dmoim.core.domain.vo.Email;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Log4j2
@RequiredArgsConstructor
@Component
public class UserDomainService {

    private final UserRepository userRepository;

    public Mono<Boolean> isDuplicateByEmail(final Email email) {
        return userRepository.existsByEmail(email);
    }
}
