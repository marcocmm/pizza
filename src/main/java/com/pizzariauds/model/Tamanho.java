package com.pizzariauds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Tamanho {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id_tamanho;

    private String descricao;

    private Integer tempo;
    
    private Integer valor;

    public Integer getId_tamanho() {
        return id_tamanho;
    }

    public void setId_tamanho(Integer id_tamanho) {
        this.id_tamanho = id_tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }



}
