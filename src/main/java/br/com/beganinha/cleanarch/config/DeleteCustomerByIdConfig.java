package br.com.beganinha.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beganinha.cleanarch.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import br.com.beganinha.cleanarch.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.DeleteCustomerByIdImpl;

@Configuration
public class DeleteCustomerByIdConfig {

	@Bean
	public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(DeleteCustomerByIdImpl deleteCustomerById,
			FindCustomerByIdUseCaseImpl findCustomerByIdUseCase) {
		
		return new DeleteCustomerByIdUseCaseImpl(deleteCustomerById, findCustomerByIdUseCase);
		
	}
	
}
