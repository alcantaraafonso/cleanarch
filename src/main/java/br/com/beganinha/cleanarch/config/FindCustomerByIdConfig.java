package br.com.beganinha.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beganinha.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.FindCustomerByIdImpl;

@Configuration
public class FindCustomerByIdConfig {

	@Bean
	public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById) {
		return new FindCustomerByIdUseCaseImpl(findCustomerById);
	}
	
}
