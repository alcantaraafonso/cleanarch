package br.com.beganinha.cleanarch.entrypoint.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.entrypoint.controller.request.CustomerRequest;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	@Mapping(target = "id", ignore = true)
	@Mapping(target = "address", ignore = true)
	@Mapping(target = "isValidCpf", ignore = true)
	Customer toCustomer(CustomerRequest customerRequest);

}
