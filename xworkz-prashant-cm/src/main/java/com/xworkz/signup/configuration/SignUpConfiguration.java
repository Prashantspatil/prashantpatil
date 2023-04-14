package com.xworkz.signup.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import lombok.extern.slf4j.Slf4j;

@Configuration
@ComponentScan("com.xworkz.signup")
@Slf4j
public class SignUpConfiguration {

	@Bean
	public ViewResolver viewResolver() {
		log.info("running viewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}
	

	@Bean
	public LocalContainerEntityManagerFactoryBean bean() {
		log.info("running bean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.signup.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
	}

	@Bean
	public PasswordEncoder encoder() {
		log.info("running encoder");
		return new BCryptPasswordEncoder();
	}
	
	public DataSource dataSource() {
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/nagappa");
		driverManagerDataSource.setPassword("Xworkzodc@123");
		driverManagerDataSource.setUsername("root");
		return driverManagerDataSource;
	}

}
