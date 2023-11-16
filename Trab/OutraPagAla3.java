package Trab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class OutraPaginaAla3 {



    JFrame frame2 = new JFrame();


    OutraPaginaAla3(ArrayList<PinturaEsculturaModel> dados){
        int yPos = 10;

        for (var dados2 : dados) {
            JLabel label2 = new JLabel();
            frame2.add(label2);
            label2.setForeground(new Color(0,0,0));// setar a cor da fonte
            label2.setFont(new Font("Impact",Font.PLAIN,20));//setar a fonte o tipo e o tamanho
            label2.setBounds(0,yPos,1000, 100);
            var text = "<html>" + dados2.artista + "<br>" + dados2.titulo + "<br>" + dados2.ano + "<br>" + dados2.tecnica + "</html>";
            label2.setText(text);

            ImageIcon image3 = new ImageIcon("C:\\Users\\rayyy\\OneDrive\\Área de Trabalho\\proj2\\imagens\\Pensador.png");
            label2.setIcon(image3);

            yPos += 120;
        }


        frame2.setResizable(false);
        frame2.setSize(420,500);
        frame2.setLayout(null);
        frame2.setVisible(true);
    }

}
