package br.com.beganinha.cleanarch.core.dataprovider;

import java.util.Optional;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface FindCustomerById {

	//Posso ou nao ter um Customer
	Optional<Customer> find(final String id);
}
