package br.com.beganinha.cleanarch.dataprovider.repository.entity;

import br.com.beganinha.cleanarch.core.domain.Address;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "customer")
public class CustomerEntity {

    @Id
    private String id;

    private String name;

    private String cpf;

    private AddressEntity address;

    private Boolean isValidCpf;
}
