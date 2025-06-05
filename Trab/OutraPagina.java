package Trab;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OutraPagina {

    JFrame frame2 = new JFrame();

    OutraPagina(ArrayList<PinturaEsculturaModel> dados) {
        int yPos = 10; // Posição inicial Y

        for (var dados2 : dados) { // Itera sobre cada obra na lista
            JLabel label2 = new JLabel();
            frame2.add(label2);
            label2.setForeground(new Color(0, 0, 0));// setar a cor da fonte
            label2.setFont(new Font("Impact", Font.PLAIN, 20));// setar a fonte o tipo e o tamanho
            label2.setBounds(10, yPos, 400, 100); // Ajuste da posição Y
            var text = "<html>" + dados2.artista + "<br>" + dados2.titulo + "<br>" + dados2.ano + "<br>" + dados2.tecnica + "</html>";
            label2.setText(text);

            // Lógica para atribuir a imagem correta com base no título da obra
            ImageIcon image3;
            // O título no modelo PinturaEsculturaModel vem formatado (Ex: "Título: Mona Lisa")
            // Vamos pegar o título cru para comparação
            String tituloObraCru = dados2.titulo.replace("Título: ", "").trim(); // Remove "Título: " e espaços

            if (tituloObraCru.equalsIgnoreCase("Mona Lisa")) {
                image3 = new ImageIcon("imagens/Mona.png");
            } else if (tituloObraCru.equalsIgnoreCase("David")) {
                image3 = new ImageIcon("imagens/David.png");
            } else {
                // Caso não encontre uma imagem específica, use uma imagem padrão ou nenhuma
                image3 = null; // Ou new ImageIcon("imagens/default.png");
            }

            if (image3 != null) {
                label2.setIcon(image3);
            }


            yPos += 120; // Incremento na posição Y para o próximo elemento
        }

        frame2.setResizable(false);
        frame2.setSize(420, 500);
        frame2.setLayout(null); // Define o layout como nulo para poder usar o setBounds diretamente
        frame2.setVisible(true);
    }

}