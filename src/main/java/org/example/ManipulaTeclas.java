package org.example;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ManipulaTeclas implements KeyListener {

    public boolean acimaAtivado, abaixoAtivado, esquerdaAtivado, direitaAtivado;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigoTecla = e.getExtendedKeyCode();

        if (codigoTecla == KeyEvent.VK_W){
            acimaAtivado = true;
        }
        if (codigoTecla == KeyEvent.VK_S){
            abaixoAtivado = true;
        }
        if (codigoTecla == KeyEvent.VK_A){
            esquerdaAtivado = true;
        }
        if (codigoTecla == KeyEvent.VK_D){
            direitaAtivado = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int codigoTecla = e.getExtendedKeyCode();

        if (codigoTecla == KeyEvent.VK_W){
            acimaAtivado = false;
        }
        if (codigoTecla == KeyEvent.VK_S){
            abaixoAtivado = false;
        }
        if (codigoTecla == KeyEvent.VK_A){
            esquerdaAtivado = false;
        }
        if (codigoTecla == KeyEvent.VK_D){
            direitaAtivado = false;
        }
    }
}
