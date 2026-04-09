//hacer un menu con 2 opciones
//1. TRANSFORMAR DE CELCIUS A FARHENHEIT
//2. CALCUILAR EL VALOR DE REAL + IVA DE UN PRODUCTO

import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("MENU PRINCIPAL");
            System.out.println("OPCION 1 - TRANSFORMAR DE CELCIUS A FARHENHEIT");
            System.out.println("OPCION 2 - CALCUILAR EL VALOR DE REAL + IVA DE UN PRODUCTO");
            System.out.println("OPCION 3 - SALIR");
            System.out.println("INGRESE UNA OPCION");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("INGRESE LA TEMPERATURA EN CELCIUS");
                    double celsius = sc.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("LA TEMPERATURA EN FARHENHEIT ES: " + fahrenheit);
                    break;
            }
        } while (opcion != 3);
    }
}
