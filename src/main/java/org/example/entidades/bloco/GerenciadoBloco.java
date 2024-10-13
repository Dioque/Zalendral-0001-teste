package org.example.entidades.bloco;

import org.example.GamerPainel;
import org.example.entidades.Jogador;
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
        int matrizOtimizada = 1000;
        int tamanhoBloco = 48;

        int cordenadaXCamera;
        int cordenadaYCamera;


        int [][] matrizOtimizadaInterface = extraiCentralMatrix(matrizJson.pixelArt, matrizOtimizada);

        for (int y = 0; y < matrizOtimizadaInterface.length; y++) {
            for (int x = 0; x < matrizOtimizadaInterface[y].length; x++) {
                cordenadaXCamera = x*tamanhoBloco-cameraX;
                cordenadaYCamera = y*tamanhoBloco-cameraY;

                int cordIndex = matrizOtimizadaInterface[y][x];
                g2.drawImage(bloco[cordIndex].imagem, cordenadaXCamera, cordenadaYCamera, null);

            }
        }
    }

    public static int [][] extraiCentralMatrix(int [][] matrix, int matrizOtimizada){

        int matrixY = matrix.length;
        int matrizX = matrix[0].length;

        int centroMatrizY = matrixY / 2;
        int centroMatrizX = matrizX / 2;

        int inicioMatrizOtimizadaY = centroMatrizY - matrizOtimizada / 2;
        int inicioMatrizOtimizadaX = centroMatrizX - matrizOtimizada / 2;

        int [][] matrizOtimizadaInterface = new int[matrizOtimizada][matrizOtimizada];

        for (int y = 0; y < matrizOtimizada; y++) {
            for (int x = 0; x < matrizOtimizada; x++) {
                matrizOtimizadaInterface[y][x] = matrix[inicioMatrizOtimizadaY + y][inicioMatrizOtimizadaX + x];
            }
        }
        return matrizOtimizadaInterface;
    }


}
