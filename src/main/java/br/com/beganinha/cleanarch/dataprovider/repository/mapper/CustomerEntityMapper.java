package br.com.beganinha.cleanarch.dataprovider.repository.mapper;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.entity.CustomerEntity;

import java.util.List;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);

    List<Customer> toCustomersList(List<CustomerEntity> customerEntities);

}
