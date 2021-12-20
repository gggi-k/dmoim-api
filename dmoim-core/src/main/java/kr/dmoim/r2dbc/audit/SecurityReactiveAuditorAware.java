package kr.dmoim.r2dbc.audit;

import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
@EnableR2dbcAuditing
public class SecurityReactiveAuditorAware implements ReactiveAuditorAware {

    @Override
    public Mono<Long> getCurrentAuditor() {
        return Mono.just(1L);
    }
}
