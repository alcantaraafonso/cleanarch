package br.com.beganinha.cleanarch.core.usecase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindCustomerById;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {

	private final FindCustomerById findCustomerById;
	

	public FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
		super();
		this.findCustomerById = findCustomerById;
	}



	@Override
	public Customer find(String id) {
		return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
	}
	
	

}
