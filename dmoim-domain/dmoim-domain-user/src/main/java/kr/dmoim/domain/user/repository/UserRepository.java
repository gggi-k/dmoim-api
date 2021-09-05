package kr.dmoim.domain.user.repository;

import kr.dmoim.domain.user.domain.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.Optional;

@Repository
public interface UserRepository extends R2dbcRepository<User, Long> {

    Mono<Boolean> existsByEmail(String email);
}
