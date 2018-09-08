/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author cleefsouza
 */

public class No {
    private String dado;
    private No proximo;

    /**
     * @return the dado
     */
    public String getDado() {
        return dado;
    }

    /**
     * @param dado the dado to set
     */
    public void setDado(String dado) {
        this.dado = dado;
    }

    /**
     * @return the proximo
     */
    public No getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
