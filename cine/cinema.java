package cine;

import java.util.Scanner;

public class cinema {

    public static void main(String[] args) {
        //
        
        Scanner entrada = new Scanner(System.in);
        int aux = 0;
        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = aux++;
            }
        }

        String[][] matrizstring = new String[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizstring[i][j] = "DISP";

            if(matrizstring[0][1] == "RSV"){

            }
            }
        }

        int poltronaentrada;
        int[] posicoes = new int[2];
        int controlemenu; 
        // variavel para realizar outra opção ou sair do programa(utilizada no while)
        do {

            int opcaomenu; // opção do menu que entra pro switch case
            System.out.print("|-----------------------------|\n");
            System.out.print("| Opção 1 - Comprar           |\n");
            System.out.print("| Opção 2 - Reservar          |\n");
            System.out.print("| Opção 3 - Cancelar Reserva  |\n");
            System.out.print("| Opção 4 - Emitir Relatório  |\n");
            System.out.print("| Opção 5 - Sair              |\n");
            System.out.print("|-----------------------------|\n");
            opcaomenu = entrada.nextInt();

            switch (opcaomenu) {
                case 1:
                    System.out.print("\nOpção comprar selecionada: \n" + opcaomenu + "\n");
                    poltronaentrada = funçãoentradanumeropoltrona.name(matrizstring);
                    posicoes = funçaoacharposição.acharposicao(matriz, poltronaentrada);
                    matrizstring = funçãocompra.Comprar(posicoes, matrizstring, poltronaentrada);
                    break;

                case 2:
                    System.out.print("\nOpção reservar selecionada \n" + opcaomenu + "\n");
                    poltronaentrada = funçãoentradanumeropoltrona.name(matrizstring);
                    posicoes = funçaoacharposição.acharposicao(matriz, poltronaentrada);
                    matrizstring = funçãoreservar.reservar(posicoes, matrizstring, poltronaentrada);
                    

                    break;

                case 3:
                    System.out.print("\nOpção cancelar reserva selecionada:  " + opcaomenu + "\n ");
                    System.out.print("Insira o número da poltrona que deseja cancelar: \n");
                    int poltronacancelada = funçãoentradanumeropoltrona.name(matrizstring);

                    break;

                case 4:
                
                default:
                    System.out.print("\nOpção Inválida!");
                    break;
            }

            if (opcaomenu == 5) {
                System.out.print("\nAté logo!");
                break;
            }
            
            System.out.println("1-Realizar outra operação. \n2-Cancelar execução");
            controlemenu = entrada.nextInt();
            if (controlemenu == 2) {
                System.out.println("\nAté logo!");
            }
        } while (controlemenu == 1);
    }
}