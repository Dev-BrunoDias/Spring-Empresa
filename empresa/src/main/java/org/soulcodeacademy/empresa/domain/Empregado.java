package org.soulcodeacademy.empresa.domain;

import javax.persistence.*;

@Entity
public class Empregado {
    @Id //Agora ele sabe q o campo é de chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //estrategia p gerar um valor
    private Integer idEmpregado; //chave primaria

    @Column(length = 120, nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private Double salario;

    @OneToOne //Mostro a relacao entre minhas duas classes (Empregado-Endereco) 1:1
    @JoinColumn(name = "id_endereco", nullable = false)// renomeia a coluna da FK
    private Endereco endereco;

    public Empregado() {} //utilizado pelo spring quando fazemos uma query

    public Empregado(Integer idEmpregado, String nome, String email, Double salario) {
        this.idEmpregado = idEmpregado;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public Integer getIdEmpregado() {
        return idEmpregado;
    }

    public void setIdEmpregado(Integer idEmpregado) {
        this.idEmpregado = idEmpregado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}