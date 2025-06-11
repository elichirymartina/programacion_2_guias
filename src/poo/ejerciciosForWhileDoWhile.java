package poo;

import java.util.Scanner;


public class ejerciciosForWhileDoWhile {

    public static void ejercicio1() {

        System.out.println("Contar del 1 al 10: ");

        //for número 1
        for (int i = 0; i <= 10; i++) {
            System.out.println("Número " + i);
        }
    }

    public static void ejercicio2(){

        System.out.println("Números pares:");
        //for número 2
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Número " + i);
            }
        }
    }

    public static void ejercicio3(){
        int sumatoria = 0;

        System.out.println("Sumatoria de números: ");

        //for número 3
        for (int i = 1; i <= 100; i++) {
            sumatoria += i;
        }

        System.out.println(sumatoria);
    }

    public static void ejercicio4(){

        System.out.println("Cuenta Regresiva: ");
        int numero=5;
        //while 1
        while(numero>0){
            System.out.println(numero + "...");
            numero -= 1;
        }
        System.out.println("Despegueeeeeee!!!!!!!!");

    }

    public static void ejercicio5(){

        Scanner scanner = new Scanner(System.in);
        int random = (int)(Math.random() * (40 - 1 + 1)) + 1;
        int respuesta = 0;
        int contador = 0;

        System.out.println("¿En qué número del 1 al 40 estoy pensando? ");

        //while 2
        while(respuesta != random){
            respuesta = scanner.nextInt();
            System.out.println("Ese no es, volvé a intentarlo: ");
            contador++;
        }
        System.out.println("Felicidades! Ganaste el juego en " + contador + " intentos");
        System.out.println("El número en el que pensé era: " + random);
    }

    public static void ejercicio6(){
        Scanner scanner = new Scanner(System.in);
        String clave = "MilanesasConPure777";
        String intento = "";

        System.out.println("Ingrese su contraseña: ");
        intento = scanner.nextLine();

        while(!intento.equals(clave)){

            System.out.println("Contraseña incorrecta. Intente nuevamente: ");
            intento = scanner.nextLine();

        }
        System.out.println("Bienvenido al sistema.");

    }

    public static void ejercicio7(){
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do{
        System.out.println("Hola bebé");
        System.out.println("1.Sé que contigo no sirve la labia");
        System.out.println("2.Creo que ya es hora de que dejes de estar sola");
        System.out.println("3. Cómo tu te llamas?");
        System.out.println("4. No olvidaré llamarte");
        System.out.println("Preziona 5 pa salir siono raza");
        opcion = scanner.nextInt();
        }while (opcion!=5);
    }

    public static void ejercicio8(){
        int numero1 = 0;
        Scanner scanner = new Scanner(System.in);

        do{
          System.out.println("Ingrese un número POSITIVO");
          numero1 = scanner.nextInt();

        }while(numero1<=0);

        System.out.println("Al fin! Graaaaacias");
    }

    public static void ejercicio9(){

        boolean cantar = true;
        Scanner scanner = new Scanner(System.in);

        int[] contar = {1, 2, 3};

        do {
            int i = 0;
            do {
                System.out.println(contar[i] + " 🎶");
                i++;
                try {
                    Thread.sleep(500); // Simula ritmo musical
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            } while (i < contar.length);

            System.out.println("Let's goooo 😆");
            System.out.print("¿Querés que lo cante de nuevo? (true/false): ");
            cantar = scanner.nextBoolean();

        } while (cantar);

        System.out.println("¡Fin del recital! 🎤");
    }


    }


