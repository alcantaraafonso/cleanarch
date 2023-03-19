package br.com.beganinha.cleanarch.core.usacase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usacase.FindCustomerUseCase;

public class FindCustomerUseCaseImpl implements FindCustomerUseCase {

    private FindCustomer findCustomer;

    public FindCustomerUseCaseImpl(FindCustomer findCustomer) {
        this.findCustomer = findCustomer;
    }

    @Override
    public Customer findById(String id) {
        return findCustomer.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
