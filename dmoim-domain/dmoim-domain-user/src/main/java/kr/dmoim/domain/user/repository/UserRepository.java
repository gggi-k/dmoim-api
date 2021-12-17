package kr.dmoim.domain.user.repository;

import kr.dmoim.core.domain.vo.Email;
import kr.dmoim.core.domain.vo.Password;
import kr.dmoim.domain.user.domain.entity.UserEntity;
import org.springframework.data.r2dbc.repository.Modifying;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<UserEntity, Long> {

    Mono<Boolean> existsByEmail(Email email);

    Mono<UserEntity> findByUserIdAndDeletedFalse(Long userId);

    @Modifying
    @Query("UPDATE userEntity SET password = :password WHERE userId = :userId")
    Mono<Boolean> changePasswordByUserId(Password password, Long userId);

    @Modifying
    @Query("UPDATE userEntity SET deleted = true WHERE userId = :userId")
    Mono<Boolean> deleteByUserId(Long userId);

}
