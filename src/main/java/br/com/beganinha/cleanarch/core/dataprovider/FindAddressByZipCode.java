package br.com.beganinha.cleanarch.core.dataprovider;

import br.com.beganinha.cleanarch.core.domain.Address;

public interface FindAddressByZipCode {
    Address find(final String zipCode);
}
