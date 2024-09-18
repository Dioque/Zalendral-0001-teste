package org.example;

import org.example.bloco.Bloco;
import org.example.bloco.GerenciadoBloco;
import org.example.entidades.JogadorJsonParaLeitura;
import org.example.entidades.Jogador;

import javax.swing.JPanel;
import java.awt.*;

public class GamerPainel extends JPanel implements Runnable{

    final int tamanhoOriginalBloco = 1;
    AjustaEscala escala = new AjustaEscala(Main.janelaAltura, Main.janelaLargura);

    public final int blocoAltura = tamanhoOriginalBloco * escala.baseAltura;
    public final int blocoLargura = tamanhoOriginalBloco * escala.baseLargura;
    int fps = 60;

    ManipulaTeclas tecladoM = new ManipulaTeclas();

    GerenciadoBloco gerenciadoBloco;
    Jogador jogador;
    public bufferedImage bufferedImage;
    public GamerPainel(Dimension screenSize){
        this.setPreferredSize(new Dimension(screenSize.width, screenSize.height));
        this.setBackground(Color.blue);
        this.setDoubleBuffered(true);
        this.addKeyListener(tecladoM);
        this.setFocusable(true);

        inicializar();
    }

    private void inicializar() {
        bufferedImage = new bufferedImage(this);

        gerenciadoBloco = new GerenciadoBloco(this);
        jogador = new Jogador(this, tecladoM);

    }

    Thread thread;


    public void iniciaFPS(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        long now;
        long updateTime;
        long wait;

        final long OPTIMAL_TIME = 1000000000 / fps;

        while (thread != null) {
            now = System.nanoTime();

            update();
            repaint();

            updateTime = System.nanoTime() - now;
            wait = (OPTIMAL_TIME - updateTime) / 1000000;

            try {
                if (wait < 0){
                    wait = 0;
                }
                Thread.sleep(wait);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void update(){
        jogador.update();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        gerenciadoBloco.pinta(g2);
        jogador.pinta(g2);

        g2.dispose();
    }
}
