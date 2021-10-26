package kr.dmoim.api.user.application.service;

import kr.dmoim.api.user.application.dto.UserRequest;
import kr.dmoim.api.user.application.dto.UserResponse;
import kr.dmoim.core.exception.global.DuplicateException;
import kr.dmoim.domain.user.domain.entity.UserEntity;
import kr.dmoim.domain.user.domain.service.UserDomainService;
import kr.dmoim.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Log4j2
@RequiredArgsConstructor
@Service
public class UserApplicationService {

    private final UserDomainService userDomainService;
    private final UserRepository userRepository;

    public Flux<UserResponse> findAll() {
        return userRepository.findAll().map(UserResponse::fromEntity);
    }

    public Mono<UserResponse> findById(final Long id) {
        return userRepository.findById(id)
                .map(UserResponse::fromEntity);
    }

    public Mono<UserResponse> create(UserRequest userRequest) {

        if(userDomainService.isDuplicateByEmail(userRequest.getEmail())) throw new DuplicateException("중복된 정보가 존재합니다");

        return userRepository.save(UserEntity
                .builder()
                    .email(userRequest.getEmail())
                    .password(userRequest.getPassword())
                    .nickName(userRequest.getNickName())
                    .deleted(false)
                .build())
                .map(UserResponse::fromEntity);
    }
}
