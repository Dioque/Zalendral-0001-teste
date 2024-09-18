package org.example.bloco;

import org.example.GamerPainel;

import java.awt.*;

public class GerenciadoBloco {
    GamerPainel gamerPainel;
    Bloco[] bloco;

    public GerenciadoBloco(GamerPainel gamerPainel){
        this.gamerPainel = gamerPainel;

        bloco = new Bloco[3];
        getBlocoImage();
    }

    public void getBlocoImage(){

        bloco[0] = new Bloco();
        bloco[0].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/org/example/JsonConfigSprit/Terreno/terreno1.json");

        bloco[1] = new Bloco();
        bloco[1].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/org/example/JsonConfigSprit/Terreno/terreno1.json");

        bloco[2] = new Bloco();
        bloco[2].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/org/example/JsonConfigSprit/Terreno/terreno1.json");

    }

    public void pinta(Graphics2D g2){
        for (int y = 0; y <= 240; y += 45) {
            for (int x = 0; x <= 240; x += 45) {
                g2.drawImage(bloco[0].imagem, x, y, null);
            }
        }

    }
}
