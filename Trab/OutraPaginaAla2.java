package Trab;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OutraPaginaAla2 {

    JFrame frame2 = new JFrame(); // Declaração do JFrame para esta página

    // Construtor que recebe os dados das obras para exibir
    OutraPaginaAla2(ArrayList<PinturaEsculturaModel> dados){
        int yPos = 10; // Posição Y inicial para os componentes na tela

        // Loop para iterar sobre a lista de dados (obras) e criar um JLabel para cada uma
        for (var dados2 : dados) {
            JLabel label2 = new JLabel(); // Cria um novo JLabel para exibir as informações da obra
            frame2.add(label2); // Adiciona o JLabel ao JFrame
            label2.setForeground(new Color(0,0,0)); // Define a cor da fonte
            label2.setFont(new Font("Impact",Font.PLAIN,20)); // Define a fonte e tamanho
            // Define a posição e o tamanho do JLabel (ajuste conforme necessário)
            label2.setBounds(10,yPos,1000, 100);

            // Formata as informações da obra em HTML para o JLabel
            var text = "<html>" + dados2.artista + "<br>" + dados2.titulo + "<br>" + dados2.ano + "<br>" + dados2.tecnica + "</html>";
            label2.setText(text);

            // Lógica para atribuir a imagem correta com base no título da obra
            ImageIcon image3;
            // Extrai o título puro, removendo "Título: " ou "Titulo: " e espaços extras
            String tituloObraCru = dados2.titulo.replace("Título: ", "").replace("Titulo: ", "").trim();

            if (tituloObraCru.equalsIgnoreCase("A Noite Estrelada")) {
                image3 = new ImageIcon("imagens/Estrelada.png");
            } else if (tituloObraCru.equalsIgnoreCase("A Pietà")) {
                // VOCÊ PODE PRECISAR MUDAR 'Pieta.png' para o nome EXATO do seu arquivo de imagem da Pietà
                image3 = new ImageIcon("imagens/Pieta.png"); // <-- VERIFIQUE O NOME DESTE ARQUIVO NA SUA PASTA IMAGENS!
            } else {
                // Caso não encontre uma imagem específica, usa uma imagem padrão ou nenhuma
                image3 = null; // Ou new ImageIcon("imagens/default.png");
            }

            if (image3 != null) {
                label2.setIcon(image3);
            }

            yPos += 120; // Incrementa a posição Y para o próximo JLabel, criando um espaçamento
        }

        frame2.setResizable(false); // Impede que o usuário redimensione a janela
        frame2.setSize(420,500); // Define o tamanho da janela
        frame2.setLayout(null); // Define o layout como nulo para posicionamento manual com setBounds
        frame2.setVisible(true); // Torna a janela visível
    }
}