/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprites;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.image.BufferStrategy;

/**
 *
 * @author edugonch
 */
abstract class base implements java.lang.Runnable {

    //Método para iniciar el hilo
    private Color color;
    private Stroke stroke;
    private int coordenadas[][];
    private Graphics g;

    public void paint() {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(this.color);
        g2.setStroke(this.getStroke());

        for (int i = 0; i < this.coordenadas.length; i++) {
            g2.draw(new Line2D.Double(
                    this.coordenadas[i][0],
                    this.coordenadas[i][1],
                    this.coordenadas[i][2],
                    this.coordenadas[i][3]));
        }
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * @return the coordenadas
     */
    public int[][] getCoordenadas() {
        return coordenadas;
    }

    /**
     * @param coordenadas the coordenadas to set
     */
    public void setCoordenadas(int[][] coordenadas) {
        this.coordenadas = coordenadas;
    }

    /**
     * @return the stroke
     */
    public Stroke getStroke() {
        return stroke;
    }

    /**
     * @param stroke the stroke to set
     */
    public void setStroke(Stroke stroke) {
        this.stroke = stroke;
    }

    /**
     * @return the g
     */
    public Graphics getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(Graphics g) {
        this.g = g;
    }
}
