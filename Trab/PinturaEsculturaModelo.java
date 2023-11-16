package Trab;

import java.io.Serializable;

// Classe de um modelo para exibir informações de Pintura ou Escultura
public class PinturaEsculturaModel implements Serializable {

    public String artista;// Atributos públicos para armazenar informações sobre uma obra
    public String ano;
    public String titulo;
    public String tecnica;


    public PinturaEsculturaModel(String titulo, String artista, String ano, String tecnica) {// Construtor para inicializar os atributos com os parâmetros fornecidos
        this.titulo = titulo;  // Inicializa o título da obra
        this.artista = artista;  // Inicializa o nome do artista
        this.ano = ano;  // Inicializa o ano de criação
        this.tecnica = tecnica;  // Inicializa a técnica (aplicável apenas a pinturas)
    }
}

