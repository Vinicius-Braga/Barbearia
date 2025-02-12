package com.barbearia.services;

import com.barbearia.domain.Funcionario;
import com.barbearia.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionariosService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;


    public void salvarFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }

    public Funcionario buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.getOne(id);
    }

    public List<Funcionario> buscarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public void excluirFuncionario(Funcionario funcionario) {
        funcionarioRepository.delete(funcionario);
    }

    public void alterarFuncionario(Funcionario funcionario) {
        funcionarioRepository.save(funcionario);
    }
}
