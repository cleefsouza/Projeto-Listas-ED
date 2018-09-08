/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Listas.*;
import java.util.Scanner;

/**
 *
 * @author cleefsouza
 */

public class Menu {

    Scanner ent = new Scanner(System.in);
    PilhaSequencial pSeq;
    PilhaEncadeada pEnc;
    FilaSequencial fSeq;
    FilaEncadeada fEnc;

    // Menu ListaSequencial
    public void MenuPilhaSequencial() {
        int opc = 0;
        while (opc != 6) {
            System.out.print("-------------- Menu Pilha Sequencial\n"
                    + "1 - Criar Pilha\n"
                    + "2 - PUSH\n"
                    + "3 - POP\n"
                    + "4 - Exibir Pilha\n"
                    + "5 - Exibir TOPO\n"
                    + "6 - Retornar\n"
                    + ">>> ");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    this.pSeq = new PilhaSequencial();
                    System.out.println(">>> Pilha criada com sucesso !!!");
                    break;
                case 2:
                    System.out.print("Digite um valor: ");
                    pSeq.push(ent.next());
                    break;
                case 3:
                    System.out.println("Elemento " + this.pSeq.pop() + " removido com sucesso !!!");
                    break;
                case 4:
                    try {
                        this.pSeq.exibirElementos();
                    } catch (Exception e) {
                        System.out.println(">>> Crie a pilha primeiro ...\n"
                                + ">>> Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(pSeq.elementoTopo() + " esta no topo da pilha !!!");
                    break;
                case 6:
                    System.out.println(">>> Retornando ao menu anterior ...");
                    break;
                default:
                    System.out.println(">>> Opção Inválida !!!");
                    break;
            }
        }
    }

    // Menu ListaEncadeada
    public void MenuPilhaEncadeada() {

        int opc = 0;
        while (opc != 6) {
            System.out.print("-------------- Menu Pilha Encadeada\n"
                    + "1 - Criar Pilha\n"
                    + "2 - PUSH\n"
                    + "3 - POP\n"
                    + "4 - Exibir Pilha\n"
                    + "5 - Exibir TOPO\n"
                    + "6 - Retornar\n"
                    + ">>> ");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    this.pEnc = new PilhaEncadeada();
                    System.out.println(">>> Pilha criada com sucesso !!!");
                    break;
                case 2:
                    Elemento elemento = new Elemento();
                    System.out.print("Digite um nome: ");
                    elemento.setDado(ent.next());
                    this.pEnc.push(elemento.getDado());
                    break;
                case 3:
                    System.out.println("Elemento " + this.pEnc.pop() + " removido com sucesso !!!");
                    break;
                case 4:
                    try {
                        this.pEnc.exibirElementos();
                    } catch (Exception e) {
                        System.out.println(">>> Crie a pilha primeiro ...\n"
                                + ">>> Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(pEnc.getTopo() + " esta no topo da pilha !!!");
                    break;
                case 6:
                    System.out.println(">>> Retornando ao menu anterior ...");
                    break;
                default:
                    System.out.println(">>> Opção Inválida !!!");
                    break;
            }
        }
    }

    // Menu FilaSequencial
    public void MenuFilaSequencial() {

        int opc = 0;
        while (opc != 5) {
            System.out.print("-------------- Menu Fila Sequencial\n"
                    + "1 - Criar Filha\n"
                    + "2 - Inserir\n"
                    + "3 - Remover\n"
                    + "4 - Exibir Fila\n"
                    + "5 - Retornar\n"
                    + ">>> ");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    this.fSeq = new FilaSequencial();
                    System.out.println(">>> Fila criada com sucesso !!!");
                    break;
                case 2:
                    System.out.print("Digite seu nome: ");
                    this.fSeq.inserir(ent.next());
                    System.out.println("Elemento inserido com sucesso !!!");
                    break;
                case 3:
                    System.out.println("Elemento " + this.fSeq.remover() + " removido com sucesso !!!");
                    break;
                case 4:
                    try {
                        this.fSeq.exibirFila();
                    } catch (Exception e) {
                        System.out.println(">>> Crie a fila primeiro ...\n"
                                + ">>> Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(">>> Retornando ao menu anterior ...");
                    break;
                default:
                    System.out.println(">>> Opção Inválida !!!");
                    break;
            }
        }
    }

    // Menu FilaSequencial
    public void MenuFilaEncadeada() {

        int opc = 0;
        while (opc != 5) {
            System.out.print("-------------- Menu Fila Encadeada\n"
                    + "1 - Criar Filha\n"
                    + "2 - Inserir\n"
                    + "3 - Remover\n"
                    + "4 - Exibir Fila\n"
                    + "5 - Retornar\n"
                    + ">>> ");
            opc = ent.nextInt();
            switch (opc) {
                case 1:
                    this.fEnc = new FilaEncadeada();
                    System.out.println(">>> Fila criada com sucesso !!!");
                    break;
                case 2:
                    System.out.print("Digite seu nome: ");
                    this.fEnc.inserir(ent.next());
                    System.out.println("Elemento inserido com sucesso !!!");
                    break;
                case 3:
                    System.out.println("Elemento " + this.fEnc.remover() + " removido com sucesso !!!");
                    break;
                case 4:
                    try {
                        this.fEnc.exibirFila();
                    } catch (Exception e) {
                        System.out.println(">>> Crie a fila primeiro ...\n"
                                + ">>> Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println(">>> Retornando ao menu anterior ...");
                    break;
                default:
                    System.out.println(">>> Opção Inválida !!!");
                    break;
            }
        }
    }
}
