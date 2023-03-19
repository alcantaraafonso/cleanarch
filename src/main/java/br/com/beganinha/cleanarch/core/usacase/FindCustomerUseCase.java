package br.com.beganinha.cleanarch.core.usacase;

import br.com.beganinha.cleanarch.core.domain.Customer;

public interface FindCustomerUseCase {
    Customer findById(String id);
}
