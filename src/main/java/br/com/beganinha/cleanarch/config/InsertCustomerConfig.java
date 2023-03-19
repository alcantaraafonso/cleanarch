package br.com.beganinha.cleanarch.config;

import br.com.beganinha.cleanarch.core.usacase.impl.InsertCustomerUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.FindAddressByZipCodeImpl;
import br.com.beganinha.cleanarch.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(
            FindAddressByZipCodeImpl findAddressByZipCode,
            InsertCustomerImpl insertCustomer
   ) {
        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}
