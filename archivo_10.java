package principal;

import java.util.Scanner;

public class MostrandoTexto {
    public static void main(String args[]){
        String nombre;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        
        System.out.print("Hola " + nombre + ". ¿Cómo estás?");
    }
}