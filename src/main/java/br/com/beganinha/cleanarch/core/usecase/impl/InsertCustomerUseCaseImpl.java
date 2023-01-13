package br.com.beganinha.cleanarch.core.usecase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.dataprovider.InsertCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

	//Não usa-se o @Autowired do spring pois o CORE deve ser livre de frameworks.
	private final FindAddressByZipCode findAddressByZipCode;
	
	private final InsertCustomer insertCustomer;
	
	public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode, InsertCustomer insertCustomer) {
		this.findAddressByZipCode = findAddressByZipCode;
		this.insertCustomer = insertCustomer;
	}
	
	
	@Override
	public void insert(Customer customer, String zipCode) {
		var address = findAddressByZipCode.find(zipCode);
		
		customer.setAddress(address);
		
		insertCustomer.insert(customer);
	}
	
	

}
