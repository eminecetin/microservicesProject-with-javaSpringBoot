package com.microservice.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes().route("product-service-route",r ->
                r.path("/product-service/**")
                        .filters(f -> f.rewritePath("/product-service/(?<segment>.*)","/${segment}"))
                        .uri("lb://product-service"))
                .build();
    }
}
