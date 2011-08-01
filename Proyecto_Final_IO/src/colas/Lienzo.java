/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

/**
 *
 * @author eduardo
 */
public class Lienzo extends java.awt.Canvas {

    public Lienzo() {
        super();
        super.setSize(506, 560);

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        // draw entire component white
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        //Linea de inicio
        g2.draw(new Line2D.Double(253, 560, 253, 550));

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }
}
