package kr.dmoim.r2dbc.audit;

import org.springframework.data.convert.CustomConversions;
import org.springframework.data.domain.ReactiveAuditorAware;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;
import org.springframework.data.r2dbc.convert.R2dbcConverter;
import org.springframework.data.r2dbc.convert.R2dbcCustomConversions;
import reactor.core.publisher.Mono;

@EnableR2dbcAuditing
public class SecurityReactiveAuditorAware implements ReactiveAuditorAware {

    @Override
    public Mono getCurrentAuditor() {
        return Mono.empty();

    }
}
