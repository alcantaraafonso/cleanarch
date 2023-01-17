package br.com.beganinha.cleanarch.core.usecase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.dataprovider.UpdateCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usecase.FindCustomerByIdUseCase;
import br.com.beganinha.cleanarch.core.usecase.UpdateCustomerUseCase;

public class UpdateCustomerUseCaseImpl implements UpdateCustomerUseCase {

	private final UpdateCustomer updateCustomer;
	
	private final FindCustomerByIdUseCase findCustomerByIdUseCase;
	
	private final FindAddressByZipCode findAddressByZipCode;
	
	public UpdateCustomerUseCaseImpl(UpdateCustomer updateCustomer, FindCustomerByIdUseCase findCustomerByIdUseCase,
			FindAddressByZipCode findAddressByZipCode) {
		super();
		this.updateCustomer = updateCustomer;
		this.findCustomerByIdUseCase = findCustomerByIdUseCase;
		this.findAddressByZipCode = findAddressByZipCode;
	}
	
	@Override
	public void update(Customer customer, String ZipCode) {
		findCustomerByIdUseCase.find(customer.getId());
		
		var address = findAddressByZipCode.find(ZipCode);
		customer.setAddress(address);
		
		updateCustomer.update(customer);
	}

}
