package org.soulcodeacademy.empresa.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Projeto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdProjeto;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double orcamento;

    @Column(nullable = false, length = 200)
    private String descricao;

    public Projeto() {}

    public Projeto(Integer idProjeto, String nome, Double orcamento, String descricao) {
        IdProjeto = idProjeto;
        this.nome = nome;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public Integer getIdProjeto() {
        return IdProjeto;
    }

    public void setIdProjeto(Integer idProjeto) {
        IdProjeto = idProjeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Double orcamento) {
        this.orcamento = orcamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Compara se estão no mesmo local da memória
        if (o == null || getClass() != o.getClass()) return false; // Se o é nulo ou a classe dos dois for difernete, então são diferentes
        Projeto projeto = (Projeto) o; // Tenta converter o objeto genérico para Projeto
        // Se o ID dos objetos fdorem iguais os objetos são iguais
        return IdProjeto.equals(projeto.IdProjeto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IdProjeto);
    }
}
