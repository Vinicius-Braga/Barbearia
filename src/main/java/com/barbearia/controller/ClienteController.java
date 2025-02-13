package com.barbearia.controller;

import com.barbearia.domain.Cliente;
import com.barbearia.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void salvarCliente(Cliente cliente) {
        clienteService.salvarCliente(cliente);
    }

    @GetMapping("/{id}")
    public void buscarClientePorID(@PathVariable Long id) {
        clienteService.buscarClientePorId(id);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.buscarClientes();
    }

    @PutMapping
    public void atualizarCliente(Cliente cliente) {
        clienteService.salvarCliente(cliente);
    }

    @DeleteMapping
    public void excluirCliente(Cliente cliente) {
        clienteService.excluirCliente(cliente);
    }
}
