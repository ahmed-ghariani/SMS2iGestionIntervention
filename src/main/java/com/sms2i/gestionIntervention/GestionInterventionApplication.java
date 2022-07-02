package com.sms2i.gestionIntervention;

import com.sms2i.gestionIntervention.idConverter.LigneBonSRIdConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class GestionInterventionApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(GestionInterventionApplication.class, args);
	}


	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new LigneBonSRIdConverter());
	}

}

