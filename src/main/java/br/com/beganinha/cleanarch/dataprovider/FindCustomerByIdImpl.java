package br.com.beganinha.cleanarch.dataprovider;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beganinha.cleanarch.core.dataprovider.FindCustomerById;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.beganinha.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;

@Component
public class FindCustomerByIdImpl implements FindCustomerById {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired 
	private CustomerEntityMapper customerEntityMapper;

	@Override
	public Optional<Customer> find(String id) {
		var customerEntity = customerRepository.findById(id);
		return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
	}

}
