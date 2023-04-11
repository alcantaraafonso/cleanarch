package br.com.beganinha.cleanarch.dataprovider.impl;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.domain.Address;
import br.com.beganinha.cleanarch.dataprovider.client.FindAddressByZipCodeClient;
import br.com.beganinha.cleanarch.dataprovider.client.response.AddressResponse;
import br.com.beganinha.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {

        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);

        Address address = addressResponseMapper.toAddress(addressResponse);

        return address;
    }

//    private AddressResponse response() {
//        return AddressResponse.builder()
//                .street("Rua Teste")
//                .city("São Paulo")
//                .state("São Paulo")
//                .build();
//    }
}
