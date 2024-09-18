package org.example;


import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
    public static int janelaLargura;
    public static int janelaAltura;

    public static void main(String[] args) {

        JFrame janela = new JFrame();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(true);
        janela.setTitle("Prototico MMO 2D");
        janela.setUndecorated(true);
        janela.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        janelaLargura = screenSize.width;
        janelaAltura = screenSize.height;

        GamerPainel gamerPainel = new GamerPainel(screenSize);
        janela.add(gamerPainel);
        janela.pack();

        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        gamerPainel.iniciaFPS();
    }
}