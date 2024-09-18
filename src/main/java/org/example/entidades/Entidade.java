package org.example.entidades;

import java.awt.image.BufferedImage;

public class Entidade {
    public int posX, posY;
    public int velocidade;

    public BufferedImage desceParado, desce1, desce2, desce3, desce4, desce5, desce6, desce7, desce8;
    public BufferedImage subiParado, subi1, subi2, subi3, subi4, subi5, subi6, subi7, subi8;
    public BufferedImage direitaParado, direita1, direita2, direita3, direita4, direita5, direita6, direita7, direita8;
    public BufferedImage esquerdaParado, esquerda1, esquerda2, esquerda3, esquerda4, esquerda5, esquerda6, esquerda7, esquerda8;

    public String direcao;

    public int spriteContador = 0;
    public int spriteNumero = 1;

}
