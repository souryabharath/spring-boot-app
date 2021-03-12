package com.sample.app.spring;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class ApplicationConfiguration {
	
	@Bean
	public MappingJackson2HttpMessageConverter converter() {
		final MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(new ObjectMapper());
		return converter;
	}
	
//	@Bean
//	public DataSource dataSource() {
//	    final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//
//	    dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//	    dataSource.setUsername("sourya");
//	    dataSource.setPassword("pass123");
//	    dataSource.setUrl("jdbc:mysql://localhost:9040/user_details?createDatabaseIfNotExist=true"); 
//	    
//	    return dataSource;
//	}
	
}
