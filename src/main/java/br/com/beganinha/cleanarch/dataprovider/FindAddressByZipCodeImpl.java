package br.com.beganinha.cleanarch.dataprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.domain.Address;
import br.com.beganinha.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import br.com.beganinha.cleanarch.dataprovider.client.mapper.AddressResponseMapper;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {
//
	@Autowired
	private FindAddressByZipCodeClient findAddressByZipCodeClient;
	
	@Autowired
	private AddressResponseMapper addressResponseMapper;
	
	@Override
	public Address find(String zipCode) {
		var addressResponse = findAddressByZipCodeClient.find(zipCode);
		return addressResponseMapper.toAddress(addressResponse);
	}

}
