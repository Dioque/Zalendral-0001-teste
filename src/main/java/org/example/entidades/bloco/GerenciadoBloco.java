package org.example.entidades.bloco;

import org.example.GamerPainel;
import org.example.entidades.JogadorJsonParaLeitura;

import java.awt.*;

import static org.example.camera.cameraX;
import static org.example.camera.cameraY;

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
        bloco[0].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/Terreno/terreno1.json");

        bloco[1] = new Bloco();
        bloco[1].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/Terreno/terreno2.json");

        bloco[2] = new Bloco();
        bloco[2].imagem = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/Terreno/agua.json");

    }

    public void desenhaMapa(Graphics2D g2){

        JogadorJsonParaLeitura matrizJson = new JogadorJsonParaLeitura("target/classes/JsonConfigSprit/mapa/mapa1.json");

        int tamanhoBloco = 48;

        for (int y = 0; y < matrizJson.pixelArt.length; y++) {
            for (int x = 0; x < matrizJson.pixelArt[y].length; x++) {
                int cordIndex = matrizJson.pixelArt[y][x];
                g2.drawImage(bloco[cordIndex].imagem, x*tamanhoBloco-cameraX, y*tamanhoBloco-cameraY, null);
            }
        }



    }
}
