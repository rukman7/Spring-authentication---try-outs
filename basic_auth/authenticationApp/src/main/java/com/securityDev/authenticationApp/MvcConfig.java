package com.securityDev.authenticationApp;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author rannadurai
 * Aug 08, 2020
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer
{
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello").setViewName("hello_world");
        registry.addViewController("/login").setViewName("login");
    }

}
