package kr.dmoim.api.config.webflux;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;

@Configuration
@EnableWebFlux
public class WebFluxConfig implements WebFluxConfigurer {

     /*@Override
    public void addFormatters(FormatterRegistry registry) {
         registry.
        WebFluxConfigurer.super.addFormatters(registry);
    }*/

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8600")
                .allowedHeaders(
                    HttpHeaders.ACCESS_CONTROL_ALLOW_HEADERS,
                    HttpHeaders.ACCESS_CONTROL_ALLOW_CREDENTIALS,
                    HttpHeaders.ACCESS_CONTROL_ALLOW_METHODS,
                    HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN
                )
                .allowedMethods(
                    "DELETE"
                )
                .allowCredentials(true);
    }

    /*@Override
    public void configureHttpMessageCodecs(ServerCodecConfigurer configurer) {
        WebFluxConfigurer.super.configureHttpMessageCodecs(configurer);
    }*/
}
