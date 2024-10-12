package org.example;

import org.example.entidades.JogadorJsonParaLeitura;
import org.example.entidades.bloco.GerenciadoBloco;

import java.awt.*;
import java.awt.image.BufferedImage;

public class bufferedImage {
    private BufferedImage imageCriada;
    private GamerPainel gamerPainel;

    public bufferedImage(GamerPainel gamerPainel){
        this.gamerPainel = gamerPainel;
    }

    public BufferedImage bufferedImage(String path) {
        JogadorJsonParaLeitura matrizJson = new JogadorJsonParaLeitura(path);
        int altura = matrizJson.pixelArt.length * gamerPainel.blocoAltura;
        int largura = matrizJson.pixelArt[0].length * gamerPainel.blocoLargura;
        imageCriada = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2 = imageCriada.createGraphics();

        for (int y = 0; y < matrizJson.pixelArt.length; y++) {
            for (int x = 0; x < matrizJson.pixelArt[y].length; x++) {
                int cordIndex = matrizJson.pixelArt[y][x];
                if (matrizJson.colors != null) {
                    g2.setColor(matrizJson.colors[cordIndex]);
                    g2.fillRect(x * gamerPainel.blocoLargura, y * gamerPainel.blocoAltura, gamerPainel.blocoLargura, gamerPainel.blocoAltura);
                }
            }
        }
        g2.dispose();
        return imageCriada;
    }

}
