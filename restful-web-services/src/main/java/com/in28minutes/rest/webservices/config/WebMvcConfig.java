package com.in28minutes.rest.webservices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	registry.addResourceHandler("/**")
//		.addResourceLocations("classpath:/static/");
//	registry.addResourceHandler("swagger-ui.html")
//		.addResourceLocations("classpath:/META-INF/resources/");
//	registry.addResourceHandler("/webjars/**")
//		.addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowCredentials(true)
                .allowedHeaders("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("Authorization", "Cache-Control", "Content-Type")
                .maxAge(3600);
    }

}
