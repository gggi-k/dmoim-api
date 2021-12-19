package kr.dmoim.core.bind.resolver;

import kr.dmoim.core.bind.annotation.ClientIp;
import org.springframework.core.MethodParameter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.reactive.BindingContext;
import org.springframework.web.reactive.result.method.HandlerMethodArgumentResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class ClientIpArgumentResolver implements HandlerMethodArgumentResolver {

    private static final String UNKNOWN = "unknown";
    private static final String[] clientIpHeaders = {
        "X-Forwarded-For", "Proxy-Client-IP", "WL-Proxy-Client-IP",
        "HTTP_CLIENT_IP", "HTTP_X_FORWARDED_FOR"
    };

    @Override
    public boolean supportsParameter(MethodParameter parameter) {
        return parameter.hasParameterAnnotation(ClientIp.class) || parameter.nested().hasParameterAnnotation(ClientIp.class);
    }

    @Override
    public Mono<Object> resolveArgument(MethodParameter parameter, BindingContext bindingContext, ServerWebExchange exchange) {
        return Mono.just(getClientIp(exchange));
    }


    private String getClientIp (ServerWebExchange exchange) {
        String clientIp = null;

        for (String ipheader : clientIpHeaders) {
            final String ip = exchange.getAttribute(ipheader);
            if(!StringUtils.hasText(clientIp) || UNKNOWN.equalsIgnoreCase(clientIp)) {
                clientIp = ip;
            }
        }

        if(!StringUtils.hasText(clientIp) || UNKNOWN.equalsIgnoreCase(clientIp)) {
            clientIp = exchange.getRequest().getRemoteAddress().getHostName();
        }

        return clientIp;
    }
}
