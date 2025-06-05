package Trab;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder; // Este import pode ser removido se EmptyBorder não for usado

public class OutraPaginaAla3 {

    JFrame frame2 = new JFrame();

    OutraPaginaAla3(ArrayList<PinturaEsculturaModel> dados){
        int yPos = 10;

        for (var dados2 : dados) { // Itera sobre cada obra na lista
            JLabel label2 = new JLabel();
            frame2.add(label2);
            label2.setForeground(new Color(0,0,0));// setar a cor da fonte
            label2.setFont(new Font("Impact",Font.PLAIN,20));//setar a fonte o tipo e o tamanho
            label2.setBounds(0,yPos,1000, 100);
            var text = "<html>" + dados2.artista + "<br>" + dados2.titulo + "<br>" + dados2.ano + "<br>" + dados2.tecnica + "</html>";
            label2.setText(text);

            // Lógica para atribuir a imagem correta com base no título da obra
            ImageIcon image3;
            // Extrai o título puro, removendo "Título: " ou "Titulo: " e espaços extras
            String tituloObraCru = dados2.titulo.replace("Título: ", "").replace("Titulo: ", "").trim();

            if (tituloObraCru.equalsIgnoreCase("Abaporu")) {
                // VOCÊ PODE PRECISAR MUDAR 'Abaporu.png' para o nome EXATO do seu arquivo de imagem do Abaporu
                image3 = new ImageIcon("imagens/Abaporu.png"); // <-- VERIFIQUE O NOME DESTE ARQUIVO NA SUA PASTA IMAGENS!
            } else if (tituloObraCru.equalsIgnoreCase("O Pensador")) {
                image3 = new ImageIcon("imagens/Pensador.png");
            } else {
                // Caso não encontre uma imagem específica, usa uma imagem padrão ou nenhuma
                image3 = null; // Ou new ImageIcon("imagens/default.png");
            }

            if (image3 != null) {
                label2.setIcon(image3);
            }

            yPos += 120;
        }

        frame2.setResizable(false);
        frame2.setSize(420,500);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }
}