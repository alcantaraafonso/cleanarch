package br.com.beganinha.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beganinha.cleanarch.core.dataprovider.DeleteCustomerById;
import br.com.beganinha.cleanarch.dataprovider.repository.CustomerRepository;

@Component
public class DeleteCustomerByIdImpl implements DeleteCustomerById {
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void delete(String id) {
		customerRepository.deleteById(id);

	}

}
