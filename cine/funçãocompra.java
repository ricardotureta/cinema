package cine;

//função para a poltrona receber VND em caso de compra
//if para caso a opção de entrada ja ter sido comprada ou reservada
public class funçãocompra {
    
    
    public static String[][] Comprar(int polIJ[], String POLTRONA[][], int pt) {

        int contagempoltronascompradas=0;
        if (POLTRONA[polIJ[0]][polIJ[1]] != "DISP") {
            System.out.println("Opção invalida,\nPoltrona já comprada/reservada\n");
            contagempoltronascompradas = contagempoltronascompradas+1;
        } else {
            POLTRONA[polIJ[0]][polIJ[1]] = "VND";
            System.out.println("Poltrona >>> " + pt + " <<< comprada");

        }

        return POLTRONA;
        
    }
}
