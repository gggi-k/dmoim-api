package kr.dmoim.core.domain.code.config;

import lombok.extern.log4j.Log4j2;
import org.reflections.Reflections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Log4j2
@Configuration
public class DomainCodeConfig {

    @Bean
    public Reflections reflections() {
        return new Reflections("kr.dmoim");
    }

}
