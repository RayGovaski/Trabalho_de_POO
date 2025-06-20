package Trab;

import java.util.ArrayList;
import java.io.Serializable;

public class AlasMuseu implements Serializable {
    private String nome;

    private ArrayList<Obra> obras;

    public AlasMuseu(String nome) {// Construtor que recebe o nome da ala ao criar
        this.nome = nome;
        this.obras = new ArrayList<Obra>();
    }


    public String getNome() {// Método para obter o nome da ala
        return nome;
    }

    public void adicionarObra(Obra obra) {// Método para adicionar uma obra à ala
        obras.add(obra);
    }

    public void removerObra(Obra obra) { // Método para remover uma obra da ala
        obras.remove(obra);
    }


    public ArrayList<PinturaEsculturaModel> exibirObras() {// Método para exibir as informações das obras presentes na ala

        var informacoesList = new ArrayList<PinturaEsculturaModel>();// Lista para armazenar as informações de cada obra
        for (Obra obra : obras) { //
            var informacoes = obra.exibirInformacoes();// Obtém as informações específicas da obra (pode ser uma pintura ou escultura)
            informacoesList.add(informacoes); // Adiciona as informações à lista
        }
        return informacoesList;// Retorna a lista de informações das obras na ala
    }
}