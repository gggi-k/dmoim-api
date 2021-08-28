package kr.dmoim.domain.user.domain.service;

import kr.dmoim.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@RequiredArgsConstructor
@Component
public class UserDomainService {

    private final UserRepository userRepository;

    public void isDuplicateByEmail(final String email) {
        userRepository.existsByEmail(email);
    }
}
