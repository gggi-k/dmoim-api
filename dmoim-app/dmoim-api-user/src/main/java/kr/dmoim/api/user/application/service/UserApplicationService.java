package kr.dmoim.api.user.application.service;

import kr.dmoim.api.user.application.command.UserRequest;
import kr.dmoim.api.user.application.response.UserResponse;
import kr.dmoim.core.exception.global.DuplicateException;
import kr.dmoim.core.exception.global.NotFoundException;
import kr.dmoim.domain.user.domain.entity.UserEntity;
import kr.dmoim.domain.user.domain.service.UserDomainService;
import kr.dmoim.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Objects;

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

    public Mono<UserResponse> create(final UserRequest userRequest) {

        if(userDomainService.isDuplicateByEmail(userRequest.getEmail()).block()) throw new DuplicateException("중복된 이메일이 존재합니다");

        return userRepository.save(UserEntity
                .builder()
                    .email(userRequest.getEmail())
                    .password(userRequest.getPassword())
                    .nickName(userRequest.getNickName())
                    .deleted(false)
                .build())
                .map(UserResponse::fromEntity);
    }
    public Mono<UserResponse> update(final UserRequest userRequest) {

        final UserEntity userEntity = userRepository.findByUserIdAndDeletedFalse(userRequest.getUserId())
                .blockOptional()
                .orElseThrow(() -> new NotFoundException("유저 정보가 없습니다"));

        if(!Objects.equals(userEntity.getEmail(), userRequest.getEmail()) && userDomainService.isDuplicateByEmail(userRequest.getEmail()).block()) {
            throw new DuplicateException("중복된 이메일이 존재합니다");
        }

        return userRepository.save(UserEntity
                .builder()
                    .email(userRequest.getEmail())
                    .nickName(userRequest.getNickName())
                .build())
                .map(UserResponse::fromEntity);
    }

    public Mono<Boolean> changePassword(final UserRequest userRequest) {

        userRepository.existsById(userRequest.getUserId())
                .blockOptional()
                .orElseThrow(() -> new NotFoundException("유저 정보가 없습니다"));

        return userRepository.changePasswordByUserId(userRequest.getPassword(), userRequest.getUserId());
    }

    public Mono<Boolean> deleteById(final Long userId) {
        return userRepository.deleteByUserId(userId);
    }
}
