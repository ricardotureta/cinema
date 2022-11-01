package cine;

public class funçãomostrarsala {
    // função para mostrar as poltronas compradas e reservadas
    public static void mostrar(String matriz[][], int poltronaentrada) {
        int aux = 1;
        //System.out.println("Poltrona " + poltronaentrada + " selecionada");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print(" ["+ +aux++ + " - " + ((matriz[i][j])) + " ] ");
                // System.out.printf("[%2i - %4s] ", aux++, matriz[i][j]);
            }
            System.out.println();
        }

    }

}
