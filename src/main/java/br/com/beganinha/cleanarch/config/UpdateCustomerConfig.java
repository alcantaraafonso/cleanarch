package br.com.beganinha.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beganinha.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.beganinha.cleanarch.core.usecase.impl.UpdateCustomerUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.beganinha.cleanarch.dataprovider.UpdateCustomerImpl;

@Configuration
public class UpdateCustomerConfig {

	@Bean
	public UpdateCustomerUseCaseImpl updateCustomerUseCase(UpdateCustomerImpl updateCustomer,
			FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
			FindAddressByZipCodeImpl findAddressByZipCode) {
		
		return new UpdateCustomerUseCaseImpl(updateCustomer,
				findCustomerByIdUseCase, 
				findAddressByZipCode);
		
	}
}