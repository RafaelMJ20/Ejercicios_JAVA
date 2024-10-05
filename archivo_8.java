package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        final double PI = 3.14;
        final String OPCION_1 = "1";
        final String OPCION_2 = "2";
        final String OPCION_3 = "3";
        final String OPCION_0 = "0";
        String opcion;
        double largo, ancho, radio, area, perimetro, base, altura;
        
        
        System.out.print("Elige una opción: \n\n"
                + "1) Rectangulo\n"
                + "2) Circunferencia\n"
                + "3) Triangulo\n"
                + "0) Salir\n\n"
                + ">> "
        );
        
        opcion = entrada.nextLine();
        
        if(opcion.equals("1") || opcion.equals("a") || opcion.equals("A")){
            System.out.print("LARGO >> ");
            largo = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("ANCHO >> ");
            ancho = entrada.nextDouble();
            area = largo * ancho;
            perimetro = largo * 2 + ancho * 2;
            System.out.println("AREA: " + area + " PERIMETRO: " + perimetro);
        }else if(opcion.equals("2") || opcion.equals("b") || opcion.equals("B")){
            System.out.print("RADIO >> ");
            radio = entrada.nextDouble();
            entrada.nextLine();
            area = radio * radio * PI;
            perimetro = radio*2*PI;
            System.out.println("AREA: " + area + " PERIMETRO: " + perimetro);
        }else if(opcion.equals("3") || opcion.equals("c") || opcion.equals("C")){
            System.out.print("BASE >> ");
            base = entrada.nextDouble();
            entrada.nextLine();
            System.out.print("ALTURA >> ");
            altura = entrada.nextDouble();
            entrada.nextLine();
            area = (base * altura) / 2;
            System.out.println("AREA: " + area); 
        }else if(opcion.equals("0") || opcion.equals("s") || opcion.equals("S")){
            System.out.print("Presione ENTER para salir...");
            entrada.nextLine(); 
        }else{
            System.out.println("ERROR: No has ingresado una opción válida.");
        }
        
        /*switch (opcion) {
            case OPCION_1:
                System.out.print("LARGO >> ");
                largo = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("ANCHO >> ");
                ancho = entrada.nextDouble();
                area = largo * ancho;
                perimetro = largo * 2 + ancho * 2;
                System.out.println("AREA: " + area + " PERIMETRO: " + perimetro);
                break;
            case OPCION_2:
                System.out.print("RADIO >> ");
                radio = entrada.nextDouble();
                entrada.nextLine();
                area = radio * radio * PI;
                perimetro = radio*2*PI;
                System.out.println("AREA: " + area + " PERIMETRO: " + perimetro);
                break;
            case OPCION_3:
                System.out.print("BASE >> ");
                base = entrada.nextDouble();
                entrada.nextLine();
                System.out.print("ALTURA >> ");
                altura = entrada.nextDouble();
                entrada.nextLine();
                area = (base * altura) / 2;
                System.out.println("AREA: " + area);
                break;
            case OPCION_0:
                System.out.print("Presione ENTER para salir...");
                entrada.nextLine(); 
                break;
            default:
                System.out.println("ERROR: No has ingresado una opción válida.");
                break;
        }*/
    }
}
