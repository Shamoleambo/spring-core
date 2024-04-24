package com.tdgcode.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tdgcode.springcoredemo.common.Coach;
import com.tdgcode.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach();
	}

}
