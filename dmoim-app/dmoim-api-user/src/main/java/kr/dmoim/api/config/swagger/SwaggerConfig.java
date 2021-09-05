package kr.dmoim.api.config.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;


@Configuration
@OpenAPIDefinition(info = @Info(title = "Dmoim API DOCS", description = "개발자 커뮤니티 API 문서", version = "v1.0", contact = @Contact(name = "dmoim", url = "dmoim.kr")))
public class SwaggerConfig {

}
