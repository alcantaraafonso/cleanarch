package br.com.beganinha.cleanarch.core.dataprovider;

import br.com.beganinha.cleanarch.core.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface FindCustomer {

    Optional<Customer> findById(String id);

    List<Customer> findAll();
}
