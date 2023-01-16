package br.com.beganinha.cleanarch.core.usecase;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface UpdateCustomerUseCase {

	void update(Customer customer, String ZipCode);
	
}
