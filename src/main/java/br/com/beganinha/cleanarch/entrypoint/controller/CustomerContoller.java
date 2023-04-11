package br.com.beganinha.cleanarch.entrypoint.controller;

import br.com.beganinha.cleanarch.core.domain.Customer;
import br.com.beganinha.cleanarch.core.usacase.FindCustomerUseCase;
import br.com.beganinha.cleanarch.core.usacase.InsertCustomerUseCase;
import br.com.beganinha.cleanarch.entrypoint.controller.mapper.CustomerMapper;
import br.com.beganinha.cleanarch.entrypoint.controller.request.CustomerRequest;
import br.com.beganinha.cleanarch.entrypoint.controller.response.CustomerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/customers")
public class CustomerContoller {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private FindCustomerUseCase findCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> getById(@PathVariable("id") String id) {
        Customer customer = findCustomerUseCase.findById(id);
        CustomerResponse customerResponse = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok().body(customerResponse);
    }
}
