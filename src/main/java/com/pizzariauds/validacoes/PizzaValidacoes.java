/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pizzariauds.validacoes;

import com.pizzariauds.model.Pizza;

/**
 *
 * @author root
 */
public class PizzaValidacoes {

    public static boolean valida(Pizza pizza) {
        try {
            if (pizza.getSabor() == null) {
                return false;
            } else if (pizza.getSabor().getId_sabor() == null || pizza.getSabor().getDescricao().equals("")) {
                return false;
            }
            if (pizza.getTamanho() == null) {
                return false;
            } else if (pizza.getTamanho().getId_tamanho() == null || pizza.getTamanho().getDescricao().equals("") || pizza.getTamanho().getValor() <= 0 || pizza.getTamanho().getTempo() <= 0) {
                return false;
            }
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

}
