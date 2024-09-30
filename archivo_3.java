package calculos_simples;

import java.util.Scanner;

public class CalculosSimplesEjercicio {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);
        double valor1, valor2, valor3, promedio;
        
        System.out.print("Ingresa el valor 1: ");
        valor1 = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Ingresa el valor 2: ");
        valor2 = entrada.nextDouble();
        entrada.nextLine();
        
        System.out.print("Ingresa el valor 3: ");
        valor3 = entrada.nextDouble();
        entrada.nextLine();
        
        promedio = (valor1 + valor2 + valor3) / 3;
        
        System.out.println("PROMEDIO = " + promedio);
    }
    
}
