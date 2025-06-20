package Trab;

import java.io.Serializable;

// Classe de obra do tipo Pintura, estendendo a classe Obra
public class Pintura extends Obra implements Serializable {
    private String tecnica;

    public Pintura(String titulo, String artista, int ano, String tecnica) {// Construtor para inicializar os atributos da pintura
        super(titulo, artista, ano);
        this.tecnica = tecnica;
    }

    public PinturaEsculturaModel exibirInformacoes() {// Método para exibir informações da pintura, implementando o método abstrato da classe Obra
        var tit = "Título: " + getTitulo();  // <-- MUDAR AQUI: Adicione o acento no 'i' de "Título"
        var art = "Artista: " + getArtista();  // Obtém o nome do artista da pintura
        var ano = "Ano: " + getAno();  // Obtém o ano de criação da pintura
        var tec = "Técnica: " + tecnica;  // Obtém a técnica específica da pintura

        return new PinturaEsculturaModel(tit, art, ano, tec); // Retorna um modelo contendo as informações da pintura
    }
}