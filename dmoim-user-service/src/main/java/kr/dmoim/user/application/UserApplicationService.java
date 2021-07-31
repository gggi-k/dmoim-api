package kr.dmoim.user.application;

import kr.dmoim.user.domain.entity.User;
import kr.dmoim.user.repository.UserRepository;
import kr.dmoim.user.presentation.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserApplicationService {

    private final UserRepository userRepository;

    public boolean createUser(UserRequest userRequest) {

        userRepository.save(User
                .builder()
                .nickName(userRequest.getNickName())
                .build());
        return false;
    }
}
