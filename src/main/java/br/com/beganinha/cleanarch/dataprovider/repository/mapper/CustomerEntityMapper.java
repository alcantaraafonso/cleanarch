package br.com.beganinha.cleanarch.dataprovider.repository.mapper;

import org.mapstruct.Mapper;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.dataprovider.repository.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {
	
	CustomerEntity toCustomerEntity(Customer customer);
	
	Customer toCustomer(CustomerEntity customerEntity);

}
