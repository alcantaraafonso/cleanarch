package br.com.beganinha.cleanarch.entrypoint.controller.mapper;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.entrypoint.controller.request.CustomerRequest;
import br.com.beganinha.cleanarch.entrypoint.controller.response.CustomerResponse;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "address", ignore = true)
    @Mapping(target = "validCpf", ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

    List<CustomerResponse> toCustomerResponseList(List<Customer> customers);

}
