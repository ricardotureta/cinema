package cine;

public class funçaoacharposição {
    // converter posição int em i e j, posições na matriz
    public static int[] acharposicao(int matriz[][], int posicao) {
        int[] posicaoij = new int[2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (matriz[i][j] == posicao - 1) {
                    posicaoij[0] = i;
                    posicaoij[1] = j;
                }

            }

        }
        return posicaoij;
    }
}