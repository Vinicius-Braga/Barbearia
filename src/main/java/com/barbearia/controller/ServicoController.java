package com.barbearia.controller;

import com.barbearia.domain.Servico;
import com.barbearia.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicos")
public class ServicoController {

    @Autowired
    ServicoService servicoService;

    @PostMapping
    public void salvarServico(@RequestBody Servico servico) {
        servicoService.salvarServico(servico);
    }

    @GetMapping
    public List<Servico> buscarServicos() {
        return servicoService.buscarServicos();
    }

    @GetMapping("/{id}")
    public void buscarServico(@PathVariable Long id) {
        servicoService.buscarServicoPorId(id);
    }

    @DeleteMapping
    public void excluirServico(@RequestBody Servico servico) {
        servicoService.excluirServico(servico);
    }

    @PutMapping
    public void atualizarServico(@RequestBody Servico servico) {
        servicoService.alterarServico(servico);
    }
}
