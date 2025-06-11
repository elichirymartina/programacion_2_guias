package poo;

public class ejerciciosMixtos {

    public static void ejercicio10() {
        for (int num = 1; num <= 5; num++) {
            System.out.println("Tabla del " + num + ":");
            for (int mul = 1; mul <= 10; mul++) {
                int resultado = num * mul;
                System.out.println(num + " x " + mul + " = " + resultado);
            }
            System.out.println(); // línea en blanco entre tablas
        }
    }




}
