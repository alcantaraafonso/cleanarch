package br.com.beganinha.cleanarch.entrypoint.consumer.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.entrypoint.consumer.message.CustomerMessage;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

	@Mapping(target = "address", ignore = true)//target é o atributo que se deseja ignorar
	Customer toCustomer(CustomerMessage customerMessage);
}
