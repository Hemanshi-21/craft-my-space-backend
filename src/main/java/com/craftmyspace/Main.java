package com.craftmyspace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }

    @Bean
    public WebMvcConfigurer configurer(){
        return new WebMvcConfigurer() {
            @Override
            public void configurePathMatch(PathMatchConfigurer configurer) {
                WebMvcConfigurer.super.configurePathMatch(configurer);
            }

            @Override
            public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
                WebMvcConfigurer.super.configureContentNegotiation(configurer);
            }

            @Override
            public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
                WebMvcConfigurer.super.configureAsyncSupport(configurer);
            }

            @Override
            public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
                WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
            }

            @Override
            public void addFormatters(FormatterRegistry registry) {
                WebMvcConfigurer.super.addFormatters(registry);
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                WebMvcConfigurer.super.addInterceptors(registry);
            }

            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                WebMvcConfigurer.super.addResourceHandlers(registry);
            }

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost", "http://localhost9090", "http://localhost:3000");
            }

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                WebMvcConfigurer.super.addViewControllers(registry);
            }

            @Override
            public void configureViewResolvers(ViewResolverRegistry registry) {
                WebMvcConfigurer.super.configureViewResolvers(registry);
            }

            @Override
            public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
                WebMvcConfigurer.super.addArgumentResolvers(resolvers);
            }

            @Override
            public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> handlers) {
                WebMvcConfigurer.super.addReturnValueHandlers(handlers);
            }

            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                WebMvcConfigurer.super.configureMessageConverters(converters);
            }

            @Override
            public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
                WebMvcConfigurer.super.extendMessageConverters(converters);
            }

            @Override
            public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
                WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
            }

            @Override
            public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
                WebMvcConfigurer.super.extendHandlerExceptionResolvers(resolvers);
            }

            @Override
            public Validator getValidator() {
                return WebMvcConfigurer.super.getValidator();
            }

            @Override
            public MessageCodesResolver getMessageCodesResolver() {
                return WebMvcConfigurer.super.getMessageCodesResolver();
            }

            @Override
            public int hashCode() {
                return super.hashCode();
            }

            @Override
            public boolean equals(Object obj) {
                return super.equals(obj);
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return super.toString();
            }

            @Override
            protected void finalize() throws Throwable {
                super.finalize();
            }
        };
    }
}
