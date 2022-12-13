package com.example.nikhil.configuration;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class ProductConfiguration  extends WebMvcConfigurerAdapter{

	  @Bean
	  public MessageSource  messageSource() {
		  ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		  source.setBasename("bessages");
		  return source;
	  }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/images/");
	}
	
	@Bean("validator")
	public LocalValidatorFactoryBean validator() {
		LocalValidatorFactoryBean bean=new LocalValidatorFactoryBean();
		bean.setValidationMessageSource(messageSource());
		return bean;
	}

	@Override
	public Validator getValidator() {
		return validator();
	}
	
	
	
	
	  
	  
	 
}
