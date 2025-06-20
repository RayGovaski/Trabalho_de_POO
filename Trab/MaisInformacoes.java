package Trab;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaisInformacoes {
    JFrame frame = new JFrame();

    public void displayInfo() { // Método para exibir informações
        frame.setResizable(false);
        frame.setSize(420, 500);

        JLabel labelMonatxt = new JLabel();
        labelMonatxt.setBounds(10, 10, 380, 200);
        labelMonatxt.setHorizontalAlignment(JLabel.CENTER);
        labelMonatxt.setVerticalAlignment(JLabel.CENTER);

        frame.add(labelMonatxt); // Adiciona o JLabel ao conteúdo do JFrame

        // Caminho do arquivo de texto padronizado para 'proj'
        String filePath = "imagens/InformacoesAdicionais.txt";
        String dadosArquivo = readFile(filePath); // Chama o método 'readFile' para obter o conteúdo do arquivo
        labelMonatxt.setText("<html>" + dadosArquivo + "</html>"); // Define o texto do JLabel com formatação HTML

        frame.setVisible(true);
    }

    public static String readFile(String filePath) { // Método para ler o conteúdo de um arquivo
        StringBuilder fileContent = new StringBuilder(); // Criação de uma instância da classe StringBuilder para armazenar o conteúdo do arquivo
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) { // Bloco try
            String line; // Declaração da variável para armazenar cada linha lida do arquivo
            while ((line = br.readLine()) != null) { // Loop para ler cada linha do arquivo
                fileContent.append(line).append("<br>"); // Adiciona a linha com uma quebra de HTML
            }
        } catch (IOException e) {
            e.printStackTrace(); // Imprime a exceção em caso de erro de leitura do arquivo
        }
        return fileContent.toString(); // Converte o conteúdo do arquivo para uma string e retorna
    }
}