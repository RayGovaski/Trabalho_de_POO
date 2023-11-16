package Trab;

import java.io.Serializable;

// Classe abstrata  obra de arte genérica no museu
public abstract class Obra implements Serializable {

    private String titulo;// Atributos que definem os detalhes básicos de uma obra
    private String artista;
    private int ano;


    public Obra(String titulo, String artista, int ano) {// Construtor com atributos básicos de uma obra
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
    }

    public String getTitulo() {// Método para obter o título da obra
        return titulo;
    }
    public String getArtista() { // Método para obter o nome do artista da obra
        return artista;
    }

    public int getAno() {// Método para obter o ano de criação da obra
        return ano;
    }


    public abstract PinturaEsculturaModel exibirInformacoes();// Método abstrato que deve ser implementado por subclasses para exibir informações específicas da obra
}
