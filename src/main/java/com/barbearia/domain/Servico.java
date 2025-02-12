package com.barbearia.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Servico")
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servico;

    private String nome_servico;
    private String descricao;
    private BigDecimal preco;

    public Long getId_servico() {
        return id_servico;
    }

    public void setId_servico(Long id_servico) {
        this.id_servico = id_servico;
    }

    public String getNome_servico() {
        return nome_servico;
    }

    public void setNome_servico(String nome_servico) {
        this.nome_servico = nome_servico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
