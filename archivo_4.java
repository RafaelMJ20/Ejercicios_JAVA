package main;

import java.util.Scanner;

public class DivisionEntera {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSeisCifras;
        int c1, c2, c3, c4, c5, c6;
        int suma;
        
        //457898
        numeroSeisCifras = entrada.nextInt();
        entrada.nextLine();
        
        c1 = numeroSeisCifras % 10;
        c2 = (numeroSeisCifras/10) % 10;
        c3 = (numeroSeisCifras/100) % 10;
        c4 = (numeroSeisCifras/1000) % 10;
        c5 = (numeroSeisCifras/10000) % 10;
        c6 = (numeroSeisCifras/100000) % 10;
        suma = c1 + c2 + c3 + c4 + c5 + c6;
        
        System.out.println("Suma de cifras: " + suma);
        
    }
    
}
