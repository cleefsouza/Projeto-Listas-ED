/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Modelo.Elemento;

/**
 *
 * @author cleefsouza
 */

public class PilhaEncadeada {

    // Atributos da pilha encadeada
    int n = 0;
    Elemento topo = null;

    public boolean estaVazia() { // Verifica se a pilha esta vazia
        return (topo == null);
    }

    public int qtdElementos() { // Retorna a quantidade de elementos
        return n;
    }

    public String getTopo() { // Retorna o elemento no topo da pilha
        if (estaVazia()) {
            return null;
        } else {
            return topo.getDado();
        }
    }

    public void push(String dado) { // Inseri um novo elemento ao topo da pilha
        Elemento novo = new Elemento();
        novo.setDado(dado);
        novo.setProximo(topo);
        topo = novo;
        n++;
    }

    public String pop() { // Retira um elemento do topo da pilha
        if (estaVazia()) {
            return null;
        } else {
            String valor = topo.getDado();
            topo = topo.getProximo();
            n--;
            return valor;
        }
    }
    
    public void exibirElementos(){ // Exibir os elementos da lista
        if(estaVazia()){
            System.exit(0);
        }else{
            Elemento auxiliar = topo;
            for (int i = 0; i < n; i++) {
                System.out.println("Elemento "+(i+1)+": "+auxiliar.getDado());
                auxiliar = auxiliar.getProximo();
            }
        }
    }
}
