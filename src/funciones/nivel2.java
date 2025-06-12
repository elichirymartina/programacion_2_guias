package funciones;

import java.util.Scanner;

public class nivel2 {

    public boolean esPar(int numero, Scanner scanner){
        System.out.println("Ingresá un número:");
        numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Es par");
        }else {
            System.out.println("Es impar");
        }
        return (numero % 2 == 0);
    }

    public double calcularCuadrado(double numero, Scanner scanner){

        System.out.println("Ingrese un número");
        numero = scanner.nextDouble();
        double cuadrado = numero * numero;
        System.out.println("El cuadrado del número es: " + cuadrado);
        return cuadrado;
    }

    public int pedirNumero(Scanner scanner) {
        System.out.print("Dame un número: ");
        return scanner.nextInt();
    }

    public int factorial(int numero) {
        int fact = 1;

        if (numero == 0 || numero == 1) {
            fact = 1;
        } else {
            fact = numero * factorial(numero - 1);
        }

        return fact;
    }


}
