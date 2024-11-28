package io.lafs.dev.jsonplaceholder.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignAuthorizationInterceptor implements RequestInterceptor {


    private static final Logger logger = LoggerFactory.getLogger(FeignAuthorizationInterceptor.class);

    @Override
    public void apply(RequestTemplate requestTemplate) {
        String token = "Bearer xxxxxxxxxxxx_XXXXXXXXXXXXXXXXX";
        logger.info("Adicionando cabeçalho Authorization com token: {}", token);
        requestTemplate.header("Authorization", token);
        logger.info("Requisição com cabeçalhos: {}", requestTemplate.headers());
    }
}
