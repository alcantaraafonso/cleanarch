package br.com.beganinha.cleanarch.dataprovider.client.mapper;

import org.mapstruct.Mapper;

import br.com.beganinha.cleanarch.core.domain.Address;
import br.com.beganinha.cleanarch.dataprovider.client.response.AddressResponse;

/**
 * O Mapstruct gera a implementação dessa interface, cujo objetivo é transformar um 
 * AddressResponse em Address
 * @author alcan
 *
 */
@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

	public Address toAddress(AddressResponse addressResponse);
	
}
