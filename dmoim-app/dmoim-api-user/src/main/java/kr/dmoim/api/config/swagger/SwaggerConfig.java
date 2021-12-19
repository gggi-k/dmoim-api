package kr.dmoim.api.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(
    info = @Info(title = "Dmoim API DOCS", description = "개발자 커뮤니티 API 문서", version = "v1.0", contact = @Contact(name = "dmoim", url = "dmoim.kr")),
    servers = {
        @Server(url = "https://localhost:9000", description = "local"),
        @Server(url = "https://localhost", description = "prod"),
    },
    security = @SecurityRequirement(name = "BearerToken")
)
@SecuritySchemes({
    @SecurityScheme(type = SecuritySchemeType.HTTP, name = "BearerToken", scheme = "bearer", bearerFormat = "JWT", description = "Bearer 인증")
})
public class SwaggerConfig {

}
