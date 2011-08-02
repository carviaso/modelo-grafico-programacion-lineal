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
        //Dibuja Camino Inicial
        for(int i = 0; i < Configuracion.CAMINO_INICIAL.length; i++)
        {
             g2.draw(new Line2D.Double(
                     Configuracion.CAMINO_INICIAL[i][0], 
                     Configuracion.CAMINO_INICIAL[i][1], 
                     Configuracion.CAMINO_INICIAL[i][2], 
                     Configuracion.CAMINO_INICIAL[i][3]));
        }
        
        //Dibuja Puerta del Inicio, parte exterior
        g2.setColor(Color.BLACK);
        g2.fillRect(
                Configuracion.PUERTA_INICIO[0][0],
                Configuracion.PUERTA_INICIO[0][1],
                Configuracion.PUERTA_INICIO[0][2],
                Configuracion.PUERTA_INICIO[0][3]);
        //Dibuja la parte interior
        g2.setColor(Color.WHITE);
        g2.fillRect(
                Configuracion.PUERTA_INICIO[1][0],
                Configuracion.PUERTA_INICIO[1][1],
                Configuracion.PUERTA_INICIO[1][2],
                Configuracion.PUERTA_INICIO[1][3]);
        
        //Dibuja la Habitacion
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(1));
        g2.draw(new Rectangle2D.Double(
                Configuracion.HABITACION[0],
                Configuracion.HABITACION[1],
                Configuracion.HABITACION[2],
                Configuracion.HABITACION[3]
                ));
        
        g2.setColor(Color.GREEN);
        
        for(int i = 0; i < Configuracion.VENDEDORES.length; i++)
        {
            g2.fillRect(
                Configuracion.VENDEDORES[i][0],
                Configuracion.VENDEDORES[i][1],
                Configuracion.VENDEDORES[i][2],
                Configuracion.VENDEDORES[i][3]);
        }
        
        //Dibuja Camino hacia Vendedores
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(2));
        for(int i = 0; i < Configuracion.CAMINO_A_VENDEDORES.length; i++)
        {
             g2.draw(new Line2D.Double(
                     Configuracion.CAMINO_A_VENDEDORES[i][0], 
                     Configuracion.CAMINO_A_VENDEDORES[i][1], 
                     Configuracion.CAMINO_A_VENDEDORES[i][2], 
                     Configuracion.CAMINO_A_VENDEDORES[i][3]));
        }
        //Dibuja el Camino hacia cada vendedor individual
        for(int i = 0; i < Configuracion.CAMINO_FINAL_A_VENDEDORES.length; i++)
        {
             g2.draw(new Line2D.Double(
                     Configuracion.CAMINO_FINAL_A_VENDEDORES[i][0], 
                     Configuracion.CAMINO_FINAL_A_VENDEDORES[i][1], 
                     Configuracion.CAMINO_FINAL_A_VENDEDORES[i][2], 
                     Configuracion.CAMINO_FINAL_A_VENDEDORES[i][3]));
        }
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
