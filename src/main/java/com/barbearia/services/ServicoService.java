package com.barbearia.services;

import com.barbearia.domain.Servico;
import com.barbearia.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public Servico salvarServico(Servico servico) {
        return servicoRepository.save(servico);
    }

    public Servico buscarServicoPorId(Long id) {
        return servicoRepository.getOne(id);
    }

    public List<Servico> buscarServicos() {
        return servicoRepository.findAll();
    }

    public void excluirServico(Long id) {
        servicoRepository.deleteById(id);
    }

    public void alterarServico(Servico servico) {
        servicoRepository.save(servico);
    }
}
