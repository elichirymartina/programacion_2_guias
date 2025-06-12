package funciones;
import java.util.Scanner;

public class nivel1 {

    public void mostrarSaludo(){
        System.out.println("Hola wachín");
    }


    public void saludoPersonalizado(Scanner scanner){
        String nombre = "";
        scanner.nextLine();
        System.out.println("¿Cuál es tu nombre?");
        nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");
    }


    public void area(Scanner scanner){
        double base = 0;
        double altura = 0;
        System.out.println("Ingrese la base");
        base = scanner.nextDouble();
        System.out.println("Ingrese la altura");
        altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("el área de la figura es: " + area);
    }

    public String convertirAMayusculas(Scanner scanner) {
        String texto = scanner.nextLine();
        System.out.println("Ingrese el texto: ");
        texto = scanner.nextLine();
        texto = texto.toUpperCase();
        System.out.println("Texto en mayúscula: " + texto);
        return texto;
    }

    public void mostrarmenu(){
        System.out.println("Este es mi menú: ");
        System.out.println("Opción 1: ir al cine");
        System.out.println("Opción 2: ver una serie ");
        System.out.println("Opción 3: ver una peli en casa y lamentarte por no ir al cine ");
        System.out.println("Opción 4: tomar un cine y transmitir series ");
    }
}
