package poo.ej_2_SistemaDeVotación;

public class Votante {
    String idVotante;
    boolean yaVoto;

    public Votante(String idVotante) {
        this.idVotante = idVotante;
        this.yaVoto = false;
    }


    //getter
    public String obtenerIDVotante(){ return idVotante; };
    public boolean obtYcorrVoto(){ return yaVoto; };

}
