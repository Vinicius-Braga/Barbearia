package com.barbearia.controller;

import com.barbearia.domain.agendamento.Agendamento;
import com.barbearia.services.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamento")
public class AgendamentoController {

    @Autowired
    AgendamentoService agendamentoService;

    @PostMapping
    public void salvarAgendamento(@RequestBody Agendamento agendamento) {
        agendamentoService.salvarAgendamento(agendamento);
    }

    @GetMapping
    public List<Agendamento> listarAgendamento() {
        return agendamentoService.buscarAgendamentos();
    }

    @GetMapping("/{id}")
    public void buscarAgendamentoPorId(@PathVariable Long id) {
        agendamentoService.buscarAgendamentoPorId(id);
    }

    @DeleteMapping
    public void excluirAgendamento(@PathVariable Agendamento agendamento) {
        agendamentoService.excluirAgendamento(agendamento);
    }

    @PutMapping
    public void atualizarAgendamento(@RequestBody Agendamento agendamento) {
        agendamentoService.alterarAgendamento(agendamento);
    }
}
