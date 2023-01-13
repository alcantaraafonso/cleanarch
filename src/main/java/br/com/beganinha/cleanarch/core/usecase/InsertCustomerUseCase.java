package br.com.beganinha.cleanarch.core.usecase;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

	public void insert(Customer customer, String zipCode);
}
