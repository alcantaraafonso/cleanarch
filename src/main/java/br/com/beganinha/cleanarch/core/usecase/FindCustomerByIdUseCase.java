package br.com.beganinha.cleanarch.core.usecase;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface FindCustomerByIdUseCase {
	
	Customer find(final String id);

}
