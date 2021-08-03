package kr.dmoim.domain.cofing;

import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@EnableR2dbcRepositories(basePackages = "kr.dmoim.domain.user")
public class R2dbcConfig {
}
