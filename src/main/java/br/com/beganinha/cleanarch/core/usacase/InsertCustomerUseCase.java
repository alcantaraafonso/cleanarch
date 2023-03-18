package br.com.beganinha.cleanarch.core.usacase;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}
