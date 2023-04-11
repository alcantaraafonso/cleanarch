package br.com.beganinha.cleanarch.config;

import br.com.beganinha.cleanarch.core.usacase.impl.FindCustomerUseCaseImpl;
import br.com.beganinha.cleanarch.dataprovider.impl.FindCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerUseCaseImpl findCustomerUseCase(
            FindCustomerImpl findCustomer
    ) {
        return new FindCustomerUseCaseImpl(findCustomer);
    }
}
