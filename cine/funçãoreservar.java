package cine;

//função para a poltrona receber RSV em caso de reserva.
//if para caso a opção de entrada ja ter sido comprada ou reservada anteriormente
public class funçãoreservar {

    public static String[][] reservar(int polIJ[], String POLTRONA[][], int pt) {
        int contagempoltronasreservadas=0;
        if (POLTRONA[polIJ[0]][polIJ[1]] != "DISP") {
            System.out.println("Opção invalida\nPoltrona já comprada/reservada\n");

        } else {
            POLTRONA[polIJ[0]][polIJ[1]] = "RSV";
            System.out.println("Poltrona >>> " + pt + " <<< reservada");
            contagempoltronasreservadas= contagempoltronasreservadas+1;
        }
        return POLTRONA;
    }
}
