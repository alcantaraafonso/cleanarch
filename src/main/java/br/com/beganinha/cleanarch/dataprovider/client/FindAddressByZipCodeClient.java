package br.com.beganinha.cleanarch.dataprovider.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.beganinha.cleanarch.dataprovider.client.response.AddressResponse;

@FeignClient(name = "FindAddressByZipCodeClient", url = "${beganinha.client.addres.url}")
public interface FindAddressByZipCodeClient {

	@GetMapping("/{zipCode}")
	AddressResponse find(@PathVariable(name = "zipCode") String zipCode);
	
}
