package kr.dmoim.domain.user.repository;

import kr.dmoim.domain.user.domain.entity.UserEntity;
import kr.dmoim.core.domain.vo.Email;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends R2dbcRepository<UserEntity, Long> {

    Mono<Boolean> existsByEmail(Email email);
}
