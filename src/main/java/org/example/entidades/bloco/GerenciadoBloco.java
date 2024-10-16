package org.example.entidades.bloco;

import org.example.GamerPainel;
import org.example.entidades.Jogador;
import org.example.entidades.JogadorJsonParaLeitura;

import java.awt.*;

import static org.example.camera.cameraX;
import static org.example.camera.cameraY;

public class GerenciadoBloco {
    GamerPainel gamerPainel;
    public Bloco[] bloco;


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

}
