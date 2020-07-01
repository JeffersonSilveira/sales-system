package io.github.jeffersonsilveira.service;

import io.github.jeffersonsilveira.model.Cliente;
import io.github.jeffersonsilveira.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;

    }

    public void salvarCliente(Cliente cliente) {
        validarCliente(cliente);
        this.repository.persistir(cliente);

    }

    public void validarCliente(Cliente cliente) {
        //Aplica a válidação


    }
}
