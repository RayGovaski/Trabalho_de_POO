package Trab;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criação da classe Museu
        Museu museu = new Museu();
        // Criação de uma ala no museu  "Ala A"
        museu.criarAla("Ala A");

        // Criação de uma pintura e adiciona à "Ala A"
        Obra pinturaAlaA = new Pintura("Mona Lisa", "Leonardo da Vinci", 1503, "Óleo sobre tela");
        museu.adicionarObra("Ala A", pinturaAlaA);

        // Criação de uma escultura e adiciona à "Ala A"
        Obra esculturaAlaA = new Escultura("David", "Michelangelo", 1504, "Mármore");
        museu.adicionarObra("Ala A", esculturaAlaA);

        // Criação de outra escultura e adiciona à "Ala A"
        Obra esculturaAlaA2 = new Escultura("Davidd", "Michelangeloo", 15044, "Mármoree");
        museu.adicionarObra("Ala A", esculturaAlaA2);

        // Remove a escultura da "Ala A"
        museu.removerObra("Ala A", esculturaAlaA2);

        // Criação da ala "Ala B"
        museu.criarAla("Ala B");

        // Criação de uma pintura e adiciona à "Ala B"
        Obra pinturaAlaB = new Pintura("A Noite Estrelada", "Vincent van Gogh", 1941, "Óleo sobre tela");
        museu.adicionarObra("Ala B", pinturaAlaB);

        // Criação de uma escultura e adiciona à "Ala B"
        Obra esculturaAlaB = new Escultura("A Pietà", "Michelangelo", 1499, "composição piramidal");
        museu.adicionarObra("Ala B", esculturaAlaB);

        // Criação da ala "Ala C"
        museu.criarAla("Ala C");

        // Criação de uma pintura e adiciona à "Ala C"
        Obra pinturaAlaC = new Pintura("Abaporu", "Tarsila do Amaral", 1928, "Óleo sobre tela");
        museu.adicionarObra("Ala C", pinturaAlaC);

        // Criação de uma escultura e adiciona à "Ala C"
        Obra esculturaAlaC = new Escultura("O Pensador", "Auguste Rodin", 1904, "Bronze");
        museu.adicionarObra("Ala C", esculturaAlaC);


        var inf = museu.exibirObrasAla("Ala A");// Exibição das obras na "Ala A"
        System.out.println(inf);
        for (var infor : inf) {//onde armazena as informações para serem puxadas no flame
            System.out.println(infor.ano + infor.tecnica + infor.titulo + infor.artista);
        }


        var inf2 = museu.exibirObrasAla("Ala B");// Exibição das obras na "Ala B"
        System.out.println(inf2);
        for (var infor2 : inf2) {//onde armazena as informações para serem puxadas no flame
            System.out.println(infor2.ano + infor2.tecnica + infor2.titulo + infor2.artista);
        }


        var inf3 = museu.exibirObrasAla("Ala C"); // Exibição das obras na "Ala C"
        System.out.println(inf3);
        for (var infor3 : inf3) { //onde armazena as informações para serem puxadas no flame
            System.out.println(infor3.ano + infor3.tecnica + infor3.titulo + infor3.artista);
        }


        MyFrame myFrame = new MyFrame(inf, inf2, inf3); // Criação da classe MyFrame

        try {

            salvarMuseu(museu);// Salvar o museu em um arquivo
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {// Carregar o museu de um arquivo
            Museu museuCarregado = carregarMuseu();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static void salvarMuseu(Museu museu) throws IOException { // Método para salvar o museu em um arquivo
        try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("museu_data.ser"))) {
            os.writeObject(museu);
        }
    }


    public static Museu carregarMuseu() throws IOException, ClassNotFoundException {// Método para carregar o museu de um arquivo
        try (ObjectInputStream is = new ObjectInputStream(new FileInputStream("museu_data.ser"))) {
            return (Museu) is.readObject();
        }
    }
}
