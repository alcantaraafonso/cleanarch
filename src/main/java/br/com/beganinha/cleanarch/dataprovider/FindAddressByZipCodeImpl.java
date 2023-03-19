package br.com.beganinha.cleanarch.dataprovider;

import br.com.beganinha.cleanarch.core.dataprovider.FindAddressByZipCode;
import br.com.beganinha.cleanarch.core.domain.Address;
import br.com.beganinha.cleanarch.dataprovider.client.response.AddressResponse;
import br.com.beganinha.cleanarch.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    //TODO criar a interfaace FindAddressByZipCodeClient para ser o client da API que
    //busca Address

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {

        //TODO Usar a interface que bate no client da API que busca o endereço a partir do ZipCode

        AddressResponse addressResponse = response();

        Address address = addressResponseMapper.toAddress(addressResponse);

        return null;
    }

    private AddressResponse response() {
        return AddressResponse.builder()
                .street("Rua Teste")
                .city("São Paulo")
                .state("São Paulo")
                .build();
    }
}
