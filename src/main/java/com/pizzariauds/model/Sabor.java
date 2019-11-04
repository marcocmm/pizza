/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzariauds.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author root
 */
@Entity // This tells Hibernate to make a table out of this class
public class Sabor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_sabor;

    private String descricao;

    private Integer tempo;


    public Integer getId_sabor() {
        return id_sabor;
    }

    public void setId_sabor(Integer id_sabor) {
        this.id_sabor = id_sabor;
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

}
