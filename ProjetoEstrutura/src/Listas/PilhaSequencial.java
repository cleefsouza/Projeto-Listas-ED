/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author cleefsouza
 */

public class PilhaSequencial {

    // Atributos da pilha
    String elementos[] = new String[100];
    int topo = - 1;

    public boolean estaVazia() { // Verifica se a pilha esta vazia
        return (topo == - 1);
    }

    public boolean estaCheia() { // Verifica se a pilha esta cheia
        return (topo == elementos.length - 1);
    }

    public int qtdElementos() { // Retorna o tamanho da lista
        return (topo + 1);
    }

    public String elementoTopo() { // Retorna o elemento que está no topo
        if (estaVazia()) {
            return null;
        } else {
            return elementos[topo];
        }
    }

    public boolean push(String valor) { // Inserir um elemento no topo da pilha
        if (estaCheia()) {
            return false;
        } else {
            topo++;
            elementos[topo] = valor;
            return true;
        }
    }

    public String pop() { // Remove um elemento da lista
        if (estaVazia()) {
            return null;
        } else {
            String valor = elementos[topo];
            elementos[topo] = null;
            topo--;
            return valor;
        }
    }

    public void exibirElementos() { // Exibir elementos da pilha
        if (estaVazia()) {
            System.out.println("Não a nada empilhado aqui ...");
        } else {
            for (int i = 0; i <= topo; i++) {
                System.out.println("Elemento " + (i + 1) + ": " + elementos[i]);
            }
        }
    }
}
