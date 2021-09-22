package kr.dmoim.oauth2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.OAuth2AuthorizationServerConfiguration;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@Import(OAuth2AuthorizationServerConfiguration.class)
public class AuthorizationConfig {

    /*@Bean
    public RegisteredClientRepository registeredClientRepository() {
        RegisteredClient.withId()
                .build();
    }*/

    @Bean
    @Order(Ordered.HIGHEST_PRECEDENCE)
    public SecurityFilterChain authServerSecurityFilterChain(HttpSecurity httpSecurity) throws Exception {
        OAuth2AuthorizationServerConfiguration.applyDefaultSecurity(httpSecurity);
        return httpSecurity.formLogin(Customizer.withDefaults()).build();
    }
}
