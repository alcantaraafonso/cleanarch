package br.com.beganinha.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beganinha.cleanarch.core.dataprovider.InsertCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.beganinha.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;

@Component
public class InsertCustomerImpl implements InsertCustomer {

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired 
	private CustomerEntityMapper customerEntityMapper;
	
	/**
	 * Salvar um novo cliente
	 */
	@Override
	public void insert(Customer customer) {
		var customerEntity = customerEntityMapper.toCustomerEntity(customer);
		
		customerRepository.save(customerEntity);
		
	}

}
