package com.aapog.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class StaticWebContentConfig extends WebMvcConfigurerAdapter {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		if (!registry.hasMappingForPattern("/static/assets/**")) {
		     registry.addResourceHandler("/static/assets/**").addResourceLocations("classpath:/assets/");
		  }
    }
	
}
