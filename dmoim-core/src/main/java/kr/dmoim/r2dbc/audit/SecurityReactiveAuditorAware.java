package kr.dmoim.r2dbc.audit;

import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import reactor.core.publisher.Mono;

@EnableR2dbcAuditing
public class SecurityReactiveAuditorAware implements ReactiveAuditorAware {

    @Override
    public Mono getCurrentAuditor() {
        return Mono.empty();
    }
}
