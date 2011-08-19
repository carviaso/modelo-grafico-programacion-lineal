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
public class Camino extends Entidad {
    public Camino()
    {
        super.setStroke(null);
        super.setColor(null);
        super.setCoordenadas(null);
    }
    public Camino(int[][] coordenadas, Color color, Stroke strike, Graphics g)
    {
        super.setStroke(strike);
        super.setColor(color);
        super.setCoordenadas(coordenadas);
        super.setG(g);
    }
}
