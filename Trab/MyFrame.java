package Trab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame implements ActionListener {

    JButton button;
    JButton button2;
    JButton button3;
    JButton button4;

    private ArrayList<PinturaEsculturaModel> dados;
    private ArrayList<PinturaEsculturaModel> inf2;
    private ArrayList<PinturaEsculturaModel> inf3;


    MyFrame(ArrayList<PinturaEsculturaModel> dados, ArrayList<PinturaEsculturaModel> inf2, ArrayList<PinturaEsculturaModel> inf3){

        this.dados = dados;
        this.inf2 = inf2;
        this.inf3 = inf3;

        button4 = new JButton("Mais informaçoes!");
        button4.setBounds(90, 410, 200, 30);
        button4.setFont(new Font("Impact",Font.PLAIN,15));//setar a fonte
        button4.setBackground(Color.WHITE);//cor do botao
        button4.setBorder(BorderFactory.createEtchedBorder());//borda do botao
        button4.setFocusable(false);
        button4.addActionListener(e -> {//a ac]ao puxaxdo pelo ActionListener
            new MaisInformacoes().displayInfo();
        });

        button = new JButton();
        button.setBounds(90,80,200,50);//seta o tamnho e o lugar
        button.setText("Clique Aqui!");//texto dentro
        button.setFocusable(false);
        button.addActionListener(this);//colocar a função
        button.setFont(new Font("Impact",Font.PLAIN,15));//setar a fonte
        button.setBackground(Color.WHITE);//cor do botao
        button.setBorder(BorderFactory.createEtchedBorder());//borda do botao


        button2 = new JButton();
        button2.setBounds(90,200,200,50);//seta o tamnho e o lugar
        button2.setText("Clique Aqui!");//texto dentro
        button2.setFocusable(false);
        button2.addActionListener(this);//colocar a função
        button2.setFont(new Font("Impact",Font.PLAIN,15));//setar a fonte
        button2.setBackground(Color.WHITE);//cor do botao
        button2.setBorder(BorderFactory.createEtchedBorder());//borda do botao


        button3 = new JButton();
        button3.setBounds(90,320,200,50);//seta o tamnho e o lugar
        button3.setText("Clique Aqui!");//texto dentro
        button3.setFocusable(false);
        button3.addActionListener(this);//colocar a função
        button3.setFont(new Font("Impact",Font.PLAIN,15));//setar a fonte
        button3.setBackground(Color.WHITE);//cor do botao
        button3.setBorder(BorderFactory.createEtchedBorder());//borda do botao

        ImageIcon imageala3 = new ImageIcon("imagens/Ala3.png");

        JLabel labelAla3 = new JLabel();
        labelAla3.setText("ALA  3"); // setar um texto
        labelAla3.setIcon(imageala3); // adiciona a imagem
        labelAla3.setHorizontalTextPosition(JLabel.LEFT);// alinha o texto
        labelAla3.setVerticalTextPosition(JLabel.CENTER);
        labelAla3.setForeground(new Color(0,0,0));// setar a cor da fonte
        labelAla3.setFont(new Font("Impact",Font.PLAIN,25));//setar a fonte o tipo e o tamanho
        labelAla3.setIconTextGap(25);//distaciamento da imagem e a label
        labelAla3.setHorizontalAlignment(JLabel.CENTER);
        labelAla3.setVerticalAlignment(JLabel.TOP);
        labelAla3.setBounds(90,265, 200,50);




        ImageIcon imageala2 = new ImageIcon("imagens/Ala2.png");

        JLabel labelAla2 = new JLabel();
        labelAla2.setText("ALA  2"); // setar um texto
        labelAla2.setIcon(imageala2); // adiciona a imagem
        labelAla2.setHorizontalTextPosition(JLabel.LEFT);// alinha o texto
        labelAla2.setVerticalTextPosition(JLabel.CENTER);
        labelAla2.setForeground(new Color(0,0,0));// setar a cor da fonte
        labelAla2.setFont(new Font("Impact",Font.PLAIN,25));//setar a fonte o tipo e o tamanho
        labelAla2.setIconTextGap(25);//distaciamento da imagem e a label
        labelAla2.setHorizontalAlignment(JLabel.CENTER);
        labelAla2.setVerticalAlignment(JLabel.TOP);
        labelAla2.setBounds(90,145, 200,50);


        ImageIcon image2 = new ImageIcon("imagens/Ala1.png");


        JLabel label = new JLabel();
        label.setText("ALA  1"); // setar um texto
        label.setIcon(image2); // adiciona a imagem
        label.setHorizontalTextPosition(JLabel.LEFT);// alinha o texto
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(new Color(0,0,0));// setar a cor da fonte
        label.setFont(new Font("Impact",Font.PLAIN,25));//setar a fonte o tipo e o tamanho
        label.setIconTextGap(25);//distaciamento da imagem e a label
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setBounds(90,25, 200,50);



        this.setSize(420,500);//altura e largura do this
        this.setVisible(true);//deixa o this visivel
        this.setTitle("Museu"); //titulo do this

        this.setResizable(false); //NÃ£o deixa mudar o tamanho do this
        this.add(label); // adiciona a label
        this.add(labelAla2);
        this.add(labelAla3);
        this.add(button);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.setLayout(null);

        ImageIcon image = new ImageIcon("C:\\Users\\rayyy\\OneDrive\\Área de Trabalho\\proj\\imagens\\logo.png"); // cria o icon da pagina
        this.setIconImage(image.getImage());// muda o icon da pagina
        this.getContentPane().setBackground(new Color(204,204,204));//muda a cor do background


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            OutraPagina outraPagina = new OutraPagina(dados);
        } else if (e.getSource()==button2) {
            OutraPaginaAla2 outrapaginaala2 = new OutraPaginaAla2(inf2);
        } else if (e.getSource()==button3) {
            OutraPaginaAla3 outrapaginaala3 = new OutraPaginaAla3(inf3);

        }
    }
}


