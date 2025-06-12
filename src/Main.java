import funciones.nivel1;
import funciones.nivel2;
import poo.ej_1_GestionDePedidos.ItemPedido;
import poo.ej_1_GestionDePedidos.Pedido;
import poo.ej_1_GestionDePedidos.Producto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //estoy de vacaciones, no avancé casi nada pero llegué a hacer el repo :)

    /*
    crud con login
    ¿qué datos vamos a requerir del grupo de personas?
    vamos a compartir el código
    todos tenemos inicio de sesión
    */

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Wenas wenas");

        /*
        poo.ejerciciosForWhileDoWhile.ejercicio1();
        poo.ejerciciosForWhileDoWhile.ejercicio2();
        poo.ejerciciosForWhileDoWhile.ejercicio3();
        poo.ejerciciosForWhileDoWhile.ejercicio4();
        poo.ejerciciosForWhileDoWhile.ejercicio5();
        poo.ejerciciosForWhileDoWhile.ejercicio6();
        poo.ejerciciosForWhileDoWhile.ejercicio7();
        poo.ejerciciosForWhileDoWhile.ejercicio8();
        poo.ejerciciosForWhileDoWhile.ejercicio9();
        poo.ejerciciosMixtos.ejercicio10();
         */

        Producto papel = new Producto("resma hojas a4", 2500, 15);
        Producto marcador = new Producto("marcador de pizarra negro", 300, 6);
        Producto lapicera = new Producto("set lapiceras x5", 1200, 2);

        ItemPedido item1 = new ItemPedido(lapicera, 3);
        ItemPedido item2 = new ItemPedido(papel, 5);

        Pedido pedido = new Pedido("ARS003");

        pedido.agregarItem(item1);
        pedido.agregarItem(item2);

        Scanner scanner = new Scanner(System.in);
        pedido.validarDisponibilidad(item1, scanner);

        item1.calcularSubtotal();
        System.out.println("el subtotal de " + lapicera.obtenerNombre() + " es de $" + item1.calcularSubtotal());
        item2.calcularSubtotal();
        System.out.println("el subtotal de " + papel.obtenerNombre() + " es de $" + item2.calcularSubtotal());

        pedido.calcularTotal();
        System.out.println("El total del pedido es de: $" + pedido.calcularTotal());

        pedido.procesarPedido();

        /*
        Eleccion eleccion = new Eleccion();


        eleccion.candidatos.add(new Candidato("Kim Seokjin", "Coreanos Peronistas"));
        eleccion.candidatos.add(new Candidato("Romina Estrella", "Lucero de sus Ojos"));
        eleccion.candidatos.add(new Candidato("Raúl Castro", "Loras y Tutucas"));
        eleccion.candidatos.add(new Candidato("Esperancita Ramos", "Verde Esperanza"));


        ArrayList<Votante> listaDeVotantes = new ArrayList<>();
        listaDeVotantes.add(new Votante("v001"));
        listaDeVotantes.add(new Votante("v002"));
        listaDeVotantes.add(new Votante("v003"));
        listaDeVotantes.add(new Votante("v004"));


        eleccion.votantes.addAll(listaDeVotantes);



        for (Votante votante : eleccion.votantes) {
            eleccion.corroborarID(votante, scanner);
            eleccion.emitirVoto(votante, scanner);
        }


        eleccion.contadorVotos();
        */

        nivel1 ejercicios = new nivel1();

        /*
        ejercicios.mostrarSaludo();
        ejercicios.saludoPersonalizado(scanner);
        ejercicios.area(scanner);
        ejercicios.convertirAMayusculas(scanner);
        ejercicios.mostrarmenu();
         */

        nivel2 lvl2 = new nivel2();

        /*
        int numero2 = 0;
        lvl2.esPar(numero2, scanner);
        lvl2.calcularCuadrado(numero2, scanner);
        */


        int numero = 0;
        int numero2 = lvl2.pedirNumero(scanner);
        int resultado = lvl2.factorial(numero2);
        System.out.println("el factorial del número es " + resultado);


    }
}