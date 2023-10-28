package br.com.beganinha.cleanarch.core.usacase;

import java.util.List;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface FindCustomerUseCase {
    Customer findById(String id);

    List<Customer> findAll();
}
