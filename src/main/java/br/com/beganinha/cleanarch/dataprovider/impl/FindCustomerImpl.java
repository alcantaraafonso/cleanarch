package br.com.beganinha.cleanarch.dataprovider.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindCustomer;
import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.CustomerRepository;
import br.com.beganinha.cleanarch.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class FindCustomerImpl implements FindCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> findById(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

    @Override
    public List<Customer> findAll() {
        var customerEntities = customerRepository.findAll();
        return customerEntityMapper.toCustomersList(customerEntities);
    }
}
