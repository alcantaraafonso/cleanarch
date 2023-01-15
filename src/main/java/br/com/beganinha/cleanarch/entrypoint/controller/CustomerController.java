package br.com.beganinha.cleanarch.entrypoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.beganinha.cleanarch.core.usecase.FindCustomerByIdUseCase;
import br.com.beganinha.cleanarch.core.usecase.InsertCustomerUseCase;
import br.com.beganinha.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import br.com.beganinha.cleanarch.entrypoint.controller.request.CustomerRequest;
import br.com.beganinha.cleanarch.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private InsertCustomerUseCase insertCustomerUseCase;
	
	@Autowired 
	private CustomerMapper customerMapper;
	
	@Autowired
	private FindCustomerByIdUseCase findCustomerByIdUseCase;

	@PostMapping
	public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
		
		var customer = customerMapper.toCustomer(customerRequest);
		
		insertCustomerUseCase.insert(customer, customerRequest.getZipCode());
		
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<CustomerResponse> findById(@PathVariable String id) {
		var customer = findCustomerByIdUseCase.find(id);
		
		var customerResponse = customerMapper.toCustomerResponse(customer);
		
		return ResponseEntity.ok().body(customerResponse);
	}
	
}
