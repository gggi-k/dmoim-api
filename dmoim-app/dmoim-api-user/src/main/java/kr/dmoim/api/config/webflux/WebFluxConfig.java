package kr.dmoim.api.config.webflux;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.MediaType;
import org.springframework.http.codec.ServerCodecConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.accept.RequestedContentTypeResolverBuilder;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {

    @Bean
    CorsWebFilter corsWebFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.addAllowedOrigin("http://localhost:8600");

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsWebFilter(source);

    }

    @Override
    public void configureContentTypeResolver(RequestedContentTypeResolverBuilder builder) {
        builder.fixedResolver(MediaType.APPLICATION_NDJSON);
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        WebFluxConfigurer.super.addFormatters(registry);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        WebFluxConfigurer.super.addCorsMappings(registry);
    }

    @Override
    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
        WebFluxConfigurer.super.configureHttpMessageCodecs(configurer);
    }
}
