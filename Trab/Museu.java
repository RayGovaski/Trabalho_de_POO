package Trab;

import java.util.ArrayList;
import java.io.Serializable;

// Classe  museu contendo alas que, contêm obras de arte
public class Museu implements Serializable {

    private ArrayList<AlasMuseu> alas;// Lista de alas no museu, cada ala contém obras


    public Museu() {  // Construtor que inicializa a lista de alas
        alas = new ArrayList<>();
    }


    public void criarAla(String nome) { // Método para criar uma nova ala no museu
        AlasMuseu ala = new AlasMuseu(nome);// Cria uma nova instância de AlasMuseu com o nome fornecido
        alas.add(ala);// Adiciona a nova ala à lista de alas do museu
    }


    public void adicionarObra(String nomeAla, Obra obra) { // Método para adicionar uma obra a uma ala específica do museu
        for (AlasMuseu ala : alas) {
            if (ala.getNome().equals(nomeAla)) { // Verifica se a ala atual tem o nome correspondente ao fornecido
                ala.adicionarObra(obra);// Adiciona a obra à ala encontrada
                return;
            }
        }
        System.out.println("Ala não encontrada.");
    }


    public void removerObra(String nomeAla, Obra obra) {// Método para remover uma obra de uma ala específica do museu
        for (AlasMuseu ala : alas) {
            if (ala.getNome().equals(nomeAla)) {// Verifica se a ala atual tem o nome correspondente ao fornecido
                ala.removerObra(obra); // Remove a obra da ala encontrada
                return;
            }
        }
        System.out.println("Ala não encontrada.");
    }


    public ArrayList<PinturaEsculturaModel> exibirObrasAla(String nomeAla) {// Método para exibir as obras de uma ala específica do museu
        for (AlasMuseu ala : alas) {
            if (ala.getNome().equals(nomeAla)) {// Verifica se a ala atual tem o nome correspondente ao fornecido

                var obras = ala.exibirObras();// Obtém e retorna as informações das obras na ala encontrada
                return obras;
            }
        }
        System.out.println("Ala não encontrada.");
        return null;
    }
}