package com.arthur.apiCTEP.entities;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(
                name = "Disciplina.recuperaDisciplinasDeUmCurso",
                query = "select d from Disciplina d where d.curso.id=?1 order by d.nome"
        ),
        @NamedQuery(
                name = "Disciplina.recuperaDisciplinas",
                query = "select d from Disciplina d order by d.nome"
        )
})

@Entity
@Table(name = "DISCIPLINA")
public class Disciplina {
    private Integer id;
    private String nome;
    private Curso curso;

    @Id
    @Column(name = "ID")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "NOME")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Disciplina() {
    }

    public Disciplina(String nome, Curso curso) {
        this.nome = nome;
        this.curso = curso;
    }

    // ********* M�todos para Associa��es *********
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CURSO_ID")
    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}