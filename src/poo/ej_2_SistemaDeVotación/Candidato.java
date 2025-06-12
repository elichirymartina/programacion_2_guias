package poo.ej_2_SistemaDeVotación;

public class Candidato {

    String nombre;
    String partido;
    int votos = 0;

    public Candidato(String nombre, String partido) {
        this.nombre = nombre;
        this.partido = partido;
        this.votos = 0;
    }

    //getter

    public String obtenerNombreCandidato(){ return nombre; };
    public String obtenerPartido(){ return partido; };
    public int votos(){ return votos; };
}
