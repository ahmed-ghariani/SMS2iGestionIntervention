package com.sms2i.gestionIntervention;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.CommonsRequestLoggingFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class GestionInterventionApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(GestionInterventionApplication.class, args);
	}


	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedMethods("*");
	}
	@Bean
	public CommonsRequestLoggingFilter logFilter() {
		CommonsRequestLoggingFilter filter
				= new CommonsRequestLoggingFilter();
		filter.setIncludeQueryString(true);
		filter.setIncludePayload(true);
		filter.setMaxPayloadLength(10000);
		filter.setIncludeHeaders(false);
		filter.setAfterMessagePrefix("REQUEST DATA : ");
		return filter;
	}

}

