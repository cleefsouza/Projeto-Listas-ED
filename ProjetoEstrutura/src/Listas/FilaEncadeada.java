/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import Modelo.No;

/**
 *
 * @author cleefsouza
 */

public class FilaEncadeada {

    No inicio, fim;
    int tamanho = 0;

    // verifica se a fila esta vazia
    public boolean estaVazia() {
        return (tamanho == 0);
    }

    // inseri um elemento na fila
    public void inserir(String dado) {
        No novo = new No();
        novo.setDado(dado);

        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProximo(novo);
            fim = novo;
        }
        tamanho++;
        System.out.println("Inserido com sucesso...");
    }

    // remove um elemento da fila
    public String remover() {
        if (estaVazia()) {
            return null;
        } else {
            String valor = inicio.getDado();
            if (tamanho == 1) {
                inicio = null;
                tamanho = 0;
            } else {
                inicio = inicio.getProximo();
                tamanho--;
            }
            System.out.println("Removido com sucesso...");
            return valor;
        }

    }

    // exibi todos os elementos da fila
    public void exibirFila() {
        No aux = inicio;
        if (estaVazia()) {
            System.out.println("Fila Vazia!");
            return;
        } else {
            System.out.println("Exibindo fila encadeada...");
            for (int i = 0; i < tamanho; i++) {
                System.out.println("Posição: " + (i) + " " + aux.getDado());
                aux = aux.getProximo();
            }
        }
    }

    // esvazia a fila
    public void esvaziarFila() {
        inicio = fim = null;
        tamanho = 0;
    }
}
