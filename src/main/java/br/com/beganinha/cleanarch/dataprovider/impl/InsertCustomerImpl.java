package br.com.beganinha.cleanarch.dataprovider.impl;

import br.com.beganinha.cleanarch.core.dataprovider.InsertCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.beganinha.cleanarch.dataprovider.repository.entity.CustomerEntity;
import br.com.beganinha.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;


    @Override
    public void insert(Customer customer) {
        CustomerEntity customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);

    }
}
