package kr.dmoim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableR2dbcAuditing
@EnableR2dbcRepositories
@EnableWebFlux
public class DmoimUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmoimUserServiceApplication.class, args);
    }
}
