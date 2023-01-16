package br.com.beganinha.cleanarch.core.usecase.impl;

import br.com.beganinha.cleanarch.core.dataprovider.DeleteCustomerById;
import br.com.beganinha.cleanarch.core.usecase.DeleteCustomerByIdUseCase;
import br.com.beganinha.cleanarch.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {
	
	private DeleteCustomerById deleteCustomerById;
	
	private FindCustomerByIdUseCase findCustomerByIdUseCase;

	public DeleteCustomerByIdUseCaseImpl(DeleteCustomerById deleteCustomerById, 
			FindCustomerByIdUseCase findCustomerByIdUseCase) {
		super();
		this.deleteCustomerById = deleteCustomerById;
		this.findCustomerByIdUseCase = findCustomerByIdUseCase;
	}

	@Override
	public void delele(String id) {
		findCustomerByIdUseCase.find(id);
		
		deleteCustomerById.delete(id);

	}

}
