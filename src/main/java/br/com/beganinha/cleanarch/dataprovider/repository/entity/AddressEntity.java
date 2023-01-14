package br.com.beganinha.cleanarch.dataprovider.repository.entity;

import lombok.Data;

@Data //O lombok cria todos os getters e setters
public class AddressEntity {
	
	private String street;
	
	private String city;
	
	private String state;

}
