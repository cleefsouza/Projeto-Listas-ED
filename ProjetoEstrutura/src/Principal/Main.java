/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Modelo.Menu;
import java.util.Scanner;

/**
 *
 * @author cleefsouza
 */

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Menu menu = new Menu();
        int opc = 1;
        while (opc != 0) {
            System.out.print("---------------------------------------\n"
                    + "------------- FIFO && LIFO ------------\n"
                    + "---------------------------------------\n"
                    + "1 - Pilha Sequencial\n"
                    + "2 - Pilha Encadeada\n"
                    + "3 - Fila Sequencial\n"
                    + "4 - Fila Encadeada\n"
                    + "0 - Encerrar\n"
                    + ">>> ");
            opc = ent.nextInt();

            switch (opc) {
                case 1:
                    menu.MenuPilhaSequencial();
                    break;
                case 2:
                    menu.MenuPilhaEncadeada();
                    break;
                case 3:
                    menu.MenuFilaSequencial();
                    break;
                case 4:
                    menu.MenuFilaEncadeada();
                    break;
                case 0:
                    System.out.println(">>> Encerrando ...");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
