/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzariauds.model;

import java.util.List;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author root
 */
@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pizza;

    @OneToOne
    private Sabor sabor;

    @OneToOne
    private Tamanho tamanho;

    @ElementCollection(targetClass = Integer.class)
    private List<Integer> extras;

    private Integer tempoTotal;

    private Integer valorTotal;

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public List<Integer> getExtras() {
        return extras;
    }

    public void setExtras(List<Integer> extras) {
        this.extras = extras;
    }

    public Integer getId_pizza() {
        return id_pizza;
    }

    public void setId_pizza(Integer id_pizza) {
        this.id_pizza = id_pizza;
    }

    public Integer getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(Integer tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public Integer getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Integer valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void addValor(Integer valor) {
        this.valorTotal += valor;
    }

    public void addTempo(Integer tempo) {
        this.tempoTotal += tempo;
    }

}
