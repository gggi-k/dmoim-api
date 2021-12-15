package kr.dmoim.domain.user.repository;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.stereotype.Repository;

@Log4j2
@RequiredArgsConstructor
@Repository
public class UserRepositoryImpl {

    private final R2dbcEntityTemplate r2dbcEntityTemplate;

}
