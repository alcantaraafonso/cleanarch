package br.com.beganinha.cleanarch.dataprovider.client.mapper;

import br.com.beganinha.cleanarch.core.domain.Address;
import br.com.beganinha.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
