package br.com.beganinha.cleanarch.core.usacase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.dataprovider.InsertCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usacase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

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
