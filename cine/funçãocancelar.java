package cine;

public class funçãocancelar {

    public static String contagempoltronascancelas;

    public static String[][] cancelarcompra(int polIJ[], String POLTRONA[][], int pt) {
        int contagempoltronascancelas=0;
        int canceladas=0;
        if (POLTRONA[polIJ[0]][polIJ[1]] == "RSV") {
            POLTRONA[polIJ[0]][polIJ[1]] = "DISP";
            contagempoltronascancelas = contagempoltronascancelas+1;
            canceladas= canceladas+1; 
        }
        if (POLTRONA[polIJ[0]][polIJ[1]] == "VND") {
            System.out.println("Não foi possivel realizar a operação\nA poltrona esta vendida");
        } else {
            System.out.println("Não foi possivel realizar a operação\nA poltrona esta disponivel para reserva");
            
        }

        return POLTRONA;
    }
}
