package org.example.mapa;

import org.example.GamerPainel;
import org.example.entidades.JogadorJsonParaLeitura;
import org.example.entidades.bloco.Bloco;
import org.example.entidades.bloco.GerenciadoBloco;

import java.awt.Graphics2D;

import static org.example.camera.cameraX;
import static org.example.camera.cameraY;

public class DesenhaMapa {
    GamerPainel gamerPainel;
    GerenciadoBloco gerenciadoBloco;
    Bloco[] bloco;

    public DesenhaMapa(GamerPainel gamerPainel){
        this.gamerPainel = gamerPainel;
        gerenciadoBloco = new GerenciadoBloco(gamerPainel);
        bloco = gerenciadoBloco.bloco;
    }

    public void desenhaMapa(Graphics2D g2){

        JogadorJsonParaLeitura matrizJson = new JogadorJsonParaLeitura("target/classes/JsonConfigSprit/mapa/mapa1.json");
        int matrizOtimizada = 20;
        int tamanhoBloco = 48;

        int cordenadaXCamera;
        int cordenadaYCamera;

        int [][] matrizOtimizadaInterface = extraiCentralMatrix(matrizJson.pixelArt, matrizOtimizada, tamanhoBloco);

        int limitetelaMinX = cameraX % tamanhoBloco;
        int limitetelaminY = cameraY % tamanhoBloco;


        for (int y = 0; y < matrizOtimizadaInterface.length; y++) {
            for (int x = 0; x < matrizOtimizadaInterface[y].length; x++) {

                cordenadaXCamera = x*tamanhoBloco+limitetelaMinX;
                cordenadaYCamera = y*tamanhoBloco+limitetelaminY;

                int cordIndex = matrizOtimizadaInterface[y][x];
                g2.drawImage(bloco[cordIndex].imagem, cordenadaXCamera-tamanhoBloco, cordenadaYCamera-tamanhoBloco, null);

            }
        }
    }

    public static int [][] extraiCentralMatrix(int [][] matrix, int matrizOtimizada, int bloco){

        int matrixY = matrix.length;
        int matrizX = matrix[0].length;

        int centroMatrizY = (matrixY / 2) - cameraY/bloco;
        int centroMatrizX = (matrizX / 2) - cameraX/bloco;

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
