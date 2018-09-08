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

public class FilaSequencial {

    String contatos[] = new String[100];
    int tamanho = -1;

    // verifica se a fila esta vazia
    public boolean estaVazia() {
        return (tamanho == -1);
    }

    // verifica se a fila esta cheia
    public boolean estaCheia() {
        return (tamanho == contatos.length - 1);
    }

    // inseri um elemento na fila
    public boolean inserir(String contato) {
        if (estaCheia()) {
            return false;
        } else {
            tamanho++;
            contatos[tamanho] = contato;
            return true;
        }
    }

    // remove um elemento da fila
    public String remover() {
        if (estaVazia()) {
            return null;
        } else {
            String valor = contatos[0];
            contatos[0] = null;
            for (int i = 0; i < tamanho; i++) {
                contatos[i] = contatos[i + 1];
            }
            contatos[tamanho] = null;
            tamanho--;
            return valor;
        }
    }

    // exibi todos os elementos da fila
    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("Fila Vazia!");
            return;
        } else {
            for (int i = 0; i < tamanho + 1; i++) {
                System.out.println("Posição: " + (i + 1) + " " + contatos[i]);
            }
        }
    }

    // esvazia a fila
    public void esvaziarFila() {
        contatos = new String[100];
        tamanho = -1;
    }
}
