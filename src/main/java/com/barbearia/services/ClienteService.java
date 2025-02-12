package com.barbearia.services;

import com.barbearia.domain.Cliente;
import com.barbearia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public void salvarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public Cliente buscarClientePorId(Long id) {
        return clienteRepository.getOne(id);
    }

    public List<Cliente> buscarClientes() {
        return clienteRepository.findAll();
    }

    public void excluirCliente(Cliente cliente) {
        clienteRepository.delete(cliente);
    }

    public void alterarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
