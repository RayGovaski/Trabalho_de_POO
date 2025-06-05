package Trab;
import java.io.Serializable;

public class Escultura extends Obra implements Serializable {

    private String tecnica;

    public Escultura(String titulo, String artista, int ano, String tecnica) {// Construtor que recebe informações básicas e a técnica da escultura
        super(titulo, artista, ano);
        this.tecnica = tecnica;
    }

    public PinturaEsculturaModel exibirInformacoes() {
        var tit = "Título: " + getTitulo();
        var art = "Artista: " + getArtista();
        var ano = "Ano: " + getAno();
        var tec = "Técnica: " + tecnica;

        return new PinturaEsculturaModel(tit, art, ano, tec);
    }
}
