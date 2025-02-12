package com.barbearia.services;

import com.barbearia.domain.agendamento.Agendamento;
import com.barbearia.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public Agendamento salvarAgendamento(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }

    public Agendamento buscarAgendamentoPorId(Long id) {
        return agendamentoRepository.getOne(Math.toIntExact(id));
    }

    public List<Agendamento> buscarAgendamentos() {
        return agendamentoRepository.findAll();
    }

    public void excluirAgendamento(Agendamento agendamento) {
        agendamentoRepository.delete(agendamento);
    }

    public void alterarAgendamento(Agendamento agendamento) {
        agendamentoRepository.save(agendamento);
    }
}
