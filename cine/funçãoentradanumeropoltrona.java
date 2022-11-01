package cine;

import java.util.Scanner;
//funçao para pedir o número da poltrona
public class funçãoentradanumeropoltrona {
            
public static int name(String matriz[][]) {  
    Scanner entrada = new Scanner (System.in); 
   //Váriavel poltrona é que guarda o numero da poltrona 
    int poltrona;
    //Exibe o numero da poltrona
    int aux = 1;
  
    // exibe todas as poltronas, compradas reservadas e disponiveis
      for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                System.out.print("["+ +aux++ + " - " + ((matriz[i][j])) + " ] ");
                //System.out.print(" ["+ String.format("%02d",poltronas) +"] ");
        
            }
            System.out.println();
        }

    System.out.println("_____________________________");
    System.out.println("Informe o número da poltrona: ");
    poltrona=entrada.nextInt();
    

    return poltrona;
}
}
