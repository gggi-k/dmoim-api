package kr.dmoim.api.user.application.service;

import kr.dmoim.api.user.application.dto.UserRequest;
import kr.dmoim.domain.user.domain.entity.User;
import kr.dmoim.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserApplicationService {

    private final UserRepository userRepository;

    public Mono<User> findById(final Long id) {
        if(true) throw new RuntimeException("ddd");
        return userRepository.findById(id);
    }

    public boolean create(UserRequest userRequest) {

        userRepository.save(User
                .builder()
                .nickName(userRequest.getNickName())
                .build());
        return false;
    }
}
