package org.example.entidades;

import org.example.ProcessoImagemJson;

import java.awt.Color;

public class JogadorJsonParaLeitura {

    public int [][] pixelArt;
    public Color[] colors;
    public JogadorJsonParaLeitura(String path){
        ProcessoImagemJson processoImagemJson = new ProcessoImagemJson(path);
        this.pixelArt = processoImagemJson.matrix;
        this.colors = processoImagemJson.colors;
    }


}
