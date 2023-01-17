package br.com.beganinha.cleanarch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.beganinha.cleanarch.core.usecase.impl.InsertCustomerUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.beganinha.cleanarch.dataprovider.InsertCustomerImpl;
import br.com.beganinha.cleanarch.dataprovider.SendCpfForValidationImpl;

/**
 * O Bean amarra a implementação do Use Case, que implementa a interface do Use Case,
 * com a implementação do Dataprovider, que implementa a interface do core.dataprovider
 * 
 * @author alcan
 *
 */
@Configuration
public class InsertCustomerConfig {
	
	@Bean
	public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
			InsertCustomerImpl insertCustomer, SendCpfForValidationImpl sendCpfForValidationImpl) {
		return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidationImpl);
	}
	
}
