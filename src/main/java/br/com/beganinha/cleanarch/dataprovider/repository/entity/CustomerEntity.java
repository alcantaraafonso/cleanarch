package br.com.beganinha.cleanarch.dataprovider.repository.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data //O lombok cria todos os getters e setters
@Document(collection = "customers")
public class CustomerEntity {
	
	@Id
	private String id;
	
	private String name;
	
	private AddressEntity addressEntity;
	
	private String cpf;
	
	private Boolean isValidCpf;
}
