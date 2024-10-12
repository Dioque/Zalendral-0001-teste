package org.example.entidades;

import org.example.GamerPainel;
import org.example.ManipulaTeclas;

import java.awt.*;
import java.awt.image.BufferedImage;

import static org.example.camera.cameraX;
import static org.example.camera.cameraY;

public class Jogador extends Entidade {
    GamerPainel gamerPainel;
    ManipulaTeclas tecladoM;


    public Jogador(GamerPainel gamerPainel, ManipulaTeclas tecladoM) {
        this.gamerPainel = gamerPainel;
        this.tecladoM = tecladoM;
        valoresPadroes();
        getJogadorImage();
        //bufferedImage();
    }

    public void valoresPadroes() {
        posX = 800;
        posY = 450;
        velocidade = 3;
        direcao = "abaixo";
    }

    public void getJogadorImage(){
        //System.out.println("Current working directory: " + System.getProperty("user.dir"));

        // REAL        desceParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesceParado.json");

        desceParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        desce1 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        desce2 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce2.json");
        desce3 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce3.json");
        desce4 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce4.json");
        desce5 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce5.json");
        desce6 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce6.json");
        desce7 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce7.json");
        desce8 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce8.json");

 //REAL       subiParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesceParado.json");


        subiParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        subi1 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        subi2 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce2.json");
        subi3 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce3.json");
        subi4 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce4.json");
        subi5 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce5.json");
        subi6 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce6.json");
        subi7 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce7.json");
        subi8 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce8.json");

  //REAL      direitaParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesceParado.json");

        direitaParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        direita1 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        direita2 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce2.json");
        direita3 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce3.json");
        direita4 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce4.json");
        direita5 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce5.json");
        direita6 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce6.json");
        direita7 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce7.json");
        direita8 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce8.json");

   //REAL     esquerdaParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesceParado.json");

        esquerdaParado = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        esquerda1 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce1.json");
        esquerda2 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce2.json");
        esquerda3 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce3.json");
        esquerda4 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce4.json");
        esquerda5 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce5.json");
        esquerda6 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce6.json");
        esquerda7 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce7.json");
        esquerda8 = gamerPainel.bufferedImage.bufferedImage("target/classes/JsonConfigSprit/JogadorSprit/Descer/JogadorDesce8.json");

    }

    public void update() {
        if (tecladoM.acimaAtivado == true || tecladoM.abaixoAtivado == true ||
                tecladoM.direitaAtivado == true || tecladoM.esquerdaAtivado == true) {


            if (tecladoM.acimaAtivado) {
                direcao = "acima";
                //posY -= velocidade;

                cameraY -= velocidade;
            }
            if (tecladoM.abaixoAtivado) {
                direcao = "abaixo";
               // posY += velocidade;

                cameraY += velocidade;
            }
            if (tecladoM.direitaAtivado) {
                direcao = "direita";
                //posX += velocidade;

                cameraX += velocidade;
            }
            if (tecladoM.esquerdaAtivado) {
                direcao = "esquerda";
                //posX -= velocidade;

                cameraX -= velocidade;
            }

            spriteContador++;
            if (spriteContador >= 5){
                spriteNumero ++;
                if (spriteNumero >= 8) {
                    spriteNumero = 1;
                }
                spriteContador = 0;
            }

        }else {
            spriteNumero = 0;
        }

    }

    public void pinta(Graphics2D g) {

        BufferedImage image = null;

        switch (direcao){
            case "acima":
                if (spriteNumero == 0){
                    image = subiParado;
                }
                if (spriteNumero == 1) {
                    image = subi1;
                }
                if (spriteNumero == 2) {
                    image = subi2;
                }
                if (spriteNumero == 3) {
                    image = subi3;
                }
                if (spriteNumero == 4) {
                    image = subi4;
                }
                if (spriteNumero == 5) {
                    image = subi5;
                }
                if (spriteNumero == 6) {
                    image = subi6;
                }
                if (spriteNumero == 7) {
                    image = subi7;
                }
                if (spriteNumero == 8) {
                    image = subi8;
                }
                break;
            case "abaixo":
                if (spriteNumero == 0) {
                    image = desceParado;
                }
                if (spriteNumero == 1) {
                    image = desce1;
                }
                if (spriteNumero == 2) {
                    image = desce2;
                }
                if (spriteNumero == 3) {
                    image = desce3;
                }
                if (spriteNumero == 4) {
                    image = desce4;
                }
                if (spriteNumero == 5) {
                    image = desce5;
                }
                if (spriteNumero == 6) {
                    image = desce6;
                }
                if (spriteNumero == 7) {
                    image = desce7;
                }
                if (spriteNumero == 8) {
                    image = desce8;
                }
                break;
            case "direita":
                if(spriteNumero == 0){
                    image = direitaParado;
                }
                if (spriteNumero == 1) {
                    image = direita1;
                }
                if (spriteNumero == 2) {
                    image = direita2;
                }
                if (spriteNumero == 3) {
                    image = direita3;
                }
                if (spriteNumero == 4) {
                    image = direita4;
                }
                if (spriteNumero == 5) {
                    image = direita5;
                }
                if (spriteNumero == 6) {
                    image = direita6;
                }
                if (spriteNumero == 7) {
                    image = direita7;
                }
                if (spriteNumero == 8) {
                    image = direita8;
                }
                break;
            case "esquerda":
                if(spriteNumero == 0){
                    image = esquerdaParado;
                }
                if (spriteNumero == 1) {
                    image = esquerda1;
                }
                if (spriteNumero == 2) {
                    image = esquerda2;
                }
                if (spriteNumero == 3) {
                    image = esquerda3;
                }
                if (spriteNumero == 4) {
                    image = esquerda4;
                }
                if (spriteNumero == 5) {
                    image = esquerda5;
                }
                if (spriteNumero == 6) {
                    image = esquerda6;
                }
                if (spriteNumero == 7) {
                    image = esquerda7;
                }
                if (spriteNumero == 8) {
                    image = esquerda8;
                }
                break;

        }

        g.drawImage(image, posX, posY, null);
    }

}
