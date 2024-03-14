package com.example;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationRouteLocator {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("user_route", r -> r.path("/user/**")
                        .uri("http://localhost:8080"))
                .route("product_route", r -> r.path("/product/**")
                        .uri("http://localhost:8081"))
                .route("shop_route", r -> r.path("/shop/**")
                        .uri("http://localhost:8082"))
                .build();
    }
}
