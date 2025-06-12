package poo.ej_2_SistemaDeVotación;
import java.util.ArrayList;
import java.util.Scanner;

public class Eleccion {
    public ArrayList<Candidato> candidatos;
    public ArrayList<Votante> votantes;

    public Eleccion() {
        this.candidatos = new ArrayList<>();
        this.votantes = new ArrayList<>();
    }

    public void corroborarID(Votante votante, Scanner scanner){

        System.out.println("por favor, confirma tu ID");
        String idIngresado = scanner.nextLine();
        do{
            System.out.println("El ID que ingresó todavía debe esperar su turno o ya votó o no está registrado");
            System.out.println("Ingrese un ID válido: ");
            idIngresado = scanner.nextLine();

        }while (!votante.obtenerIDVotante().equals(idIngresado));

    }

    public void emitirVoto(Votante votante, Scanner scanner) {
        if (votante.yaVoto) {
            System.out.println("Ya votaste gato, rajá de acá");
            return;
        }

        System.out.println("Bienvenido!");

        int respuesta = -1;
        do{
            System.out.println("A continuación la lista de candidatos:");
            for (int i = 0; i < candidatos.size(); i++) {
            Candidato c = candidatos.get(i);
            System.out.println((i + 1) + ". " + c.obtenerNombreCandidato() + " - " + c.obtenerPartido());
            }

            System.out.print("Ingresá el número del candidato que elegís: ");
            try {
                respuesta = Integer.parseInt(scanner.nextLine()) - 1; // resto 1 para que coincida con el índice del ArrayList
            } catch (NumberFormatException e) {
                respuesta = -1;
            }

        }while(respuesta<0 || respuesta>=candidatos.size());

        Candidato elegido = candidatos.get(respuesta);
        elegido.votos++;
        votante.yaVoto = true;
        System.out.println("Voto registrado para " + elegido.obtenerNombreCandidato());
    }

    public void contadorVotos(){

        Candidato ganador = candidatos.get(0); //declaramos al inicio para comparar despues

        int i = 0;

        while (i < candidatos.size()) {
            Candidato actual = candidatos.get(i);

            if (actual.votos() > ganador.votos()) {
                ganador = actual;
            }

            i++;
        }

        System.out.println("El ganador es: " + ganador.obtenerNombreCandidato()
                + " del partido " + ganador.obtenerPartido()
                + " con " + ganador.votos() + " votos.");

    }

}
