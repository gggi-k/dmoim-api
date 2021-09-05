package kr.dmoim;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class DmoimUserApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DmoimUserApiApplication.class, args);
    }
}
