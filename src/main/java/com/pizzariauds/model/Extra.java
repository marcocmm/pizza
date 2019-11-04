package com.pizzariauds.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity // This tells Hibernate to make a table out of this class
public class Extra implements Serializable  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_extra;

    private String descricao;

    private Integer tempo;

    private Integer valor;

    public Integer getId_extra() {
        return id_extra;
    }

    public void setId_extra(Integer id_extra) {
        this.id_extra = id_extra;
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
