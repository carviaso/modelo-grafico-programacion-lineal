/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprites;

import java.awt.*;

/**
 *
 * @author edugonch
 */
public class Agente extends Entidad {
    private boolean activado = false;
    
    @Override
    public void paint()
    {
        Graphics2D g2 = (Graphics2D) super.getG();
        super.getG().setColor(this.getColor());
        g2.setStroke(this.getStroke());
        
        for (int i = 0; i < this.getCoordenadas().length; i++) {
            g2.fillRect(
                    this.getCoordenadas()[i][0],
                    this.getCoordenadas()[i][1],
                    this.getCoordenadas()[i][2],
                    this.getCoordenadas()[i][3]);
        }
    }

    /**
     * @return the activado
     */
    public boolean isActivado() {
        return activado;
    }

    /**
     * @param activado the activado to set
     */
    public void setActivado(boolean activado) {
        this.activado = activado;
    }
}
