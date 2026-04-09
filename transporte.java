
import java.util.Scanner;

//1.Mediante la edad calcular el precio del boleto de avion
//Precio del boleto edad (<18 50%, >=65 75%)
//2.Calcular el valor del transporte terreste por km
//(<=100 $5, <=200 $7.5, >=200 $10)

public class transporte {
    public static void main(String[] args) {
    int option;
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("MENU PRINCIPAL");
        System.out.println("OPCION 1 - CALCULAR EL PRECIO DEL BOLETO DE AVION");
        System.out.println("OPCION 2 - CALCULAR EL VALOR DEL TRANSPORTE TERRESTRE POR KM");
        System.out.println("OPCION 3 - SALIR");
        System.out.println("INGRESE UNA OPCION");
        option = sc.nextInt();
        switch (option) {
                case 2:
                System.out.println("INGRESE LA DISTANCIA EN KM");
                double distancia = sc.nextDouble();
                double precio;
                if (distancia <= 100) {
                    precio =distancia * 5;
                } else if (distancia <=200) {
                    precio = distancia * 7.5;
                } else {
                    precio = distancia * 10;
                }
                System.out.println("EL VALOR DEL TRANSPORTE TERRESTRE ES: " + precio);
                break;
            } 
        }while (option != 3);
    }
}