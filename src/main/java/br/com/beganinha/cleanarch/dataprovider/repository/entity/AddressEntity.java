package br.com.beganinha.cleanarch.dataprovider.repository.entity;

import lombok.Data;

//É um VO
@Data
public class AddressEntity {

    private String street;

    private String city;

    private String state;
}
