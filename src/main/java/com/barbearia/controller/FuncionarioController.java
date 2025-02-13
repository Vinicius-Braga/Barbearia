package com.barbearia.controller;

import com.barbearia.domain.Funcionario;
import com.barbearia.repository.FuncionarioRepository;
import com.barbearia.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    @Autowired
    FuncionarioService funcionarioService;

    @PostMapping
    public void salvarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.salvarFuncionario(funcionario);
    }

    @GetMapping
    public List<Funcionario> listarFuncionario() {
        return funcionarioService.buscarFuncionarios();
    }

    @GetMapping("/{id}")
    public void buscarFuncionario(@PathVariable Long id) {
        funcionarioService.buscarFuncionarioPorId(id);
    }

    @DeleteMapping
    public void excluirFuncionario(Funcionario funcionario) {
        funcionarioService.excluirFuncionario(funcionario);
    }

    @PutMapping
    public void atualizarFuncionario(@RequestBody Funcionario funcionario) {
        funcionarioService.alterarFuncionario(funcionario);
    }
}
