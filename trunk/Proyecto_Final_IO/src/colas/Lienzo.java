/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.image.BufferStrategy;

/**
 *
 * @author eduardo
 */
public class Lienzo extends java.awt.Canvas {

    public Lienzo() {
        super();
        super.setSize(506, 560);

    }

    public void dibuja_lienzo(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // draw entire component white
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(2));
        //Dibuja Camino Inicial
        for (int i = 0; i < Configuracion.CAMINO_INICIAL.length; i++) {
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
                Configuracion.HABITACION[3]));

        //Dibuja a los Vendedores
        g2.setColor(Color.GREEN);
        for (int i = 0; i < Configuracion.VENDEDORES.length; i++) {
            g2.fillRect(
                    Configuracion.VENDEDORES[i][0],
                    Configuracion.VENDEDORES[i][1],
                    Configuracion.VENDEDORES[i][2],
                    Configuracion.VENDEDORES[i][3]);
        }

        //Dibuja Camino hacia Vendedores
        g2.setColor(Color.GRAY);
        g2.setStroke(new BasicStroke(2));
        for (int i = 0; i < Configuracion.CAMINO_A_VENDEDORES.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_A_VENDEDORES[i][0],
                    Configuracion.CAMINO_A_VENDEDORES[i][1],
                    Configuracion.CAMINO_A_VENDEDORES[i][2],
                    Configuracion.CAMINO_A_VENDEDORES[i][3]));
        }
        //Dibuja el Camino hacia cada vendedor individual
        for (int i = 0; i < Configuracion.CAMINO_FINAL_A_VENDEDORES.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_FINAL_A_VENDEDORES[i][0],
                    Configuracion.CAMINO_FINAL_A_VENDEDORES[i][1],
                    Configuracion.CAMINO_FINAL_A_VENDEDORES[i][2],
                    Configuracion.CAMINO_FINAL_A_VENDEDORES[i][3]));
        }

        //Dibujar camino hasta cajas
        //Camino dese vendedores
        g2.setColor(Color.BLUE);
        for (int i = 0; i < Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS[i][0],
                    Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS[i][1],
                    Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS[i][2],
                    Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS[i][3]));
        }
        //Camino principal
        for (int i = 0; i < Configuracion.CAMINO_CAJAS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_CAJAS[i][0],
                    Configuracion.CAMINO_CAJAS[i][1],
                    Configuracion.CAMINO_CAJAS[i][2],
                    Configuracion.CAMINO_CAJAS[i][3]));
        }
        //Camino hacia Cajas
        for (int i = 0; i < Configuracion.CAMINO_FINAL_A_CAJAS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_FINAL_A_CAJAS[i][0],
                    Configuracion.CAMINO_FINAL_A_CAJAS[i][1],
                    Configuracion.CAMINO_FINAL_A_CAJAS[i][2],
                    Configuracion.CAMINO_FINAL_A_CAJAS[i][3]));
        }

        //Dibuja a los Cajeros
        g2.setColor(new Color(128, 120, 86));
        for (int i = 0; i < Configuracion.CAJAS.length; i++) {
            g2.fillRect(
                    Configuracion.CAJAS[i][0],
                    Configuracion.CAJAS[i][1],
                    Configuracion.CAJAS[i][2],
                    Configuracion.CAJAS[i][3]);
        }

        //Camino Desde Cajas hacia Bodegas
        g2.setColor(Color.BLACK);
        for (int i = 0; i < Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS[i][0],
                    Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS[i][1],
                    Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS[i][2],
                    Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS[i][3]));
        }
        //Camino Principal
        for (int i = 0; i < Configuracion.CAMINO_BODEGUEROS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_BODEGUEROS[i][0],
                    Configuracion.CAMINO_BODEGUEROS[i][1],
                    Configuracion.CAMINO_BODEGUEROS[i][2],
                    Configuracion.CAMINO_BODEGUEROS[i][3]));
        }

        //Camino Final
        for (int i = 0; i < Configuracion.CAMINO_FINAL_CAJAS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_FINAL_CAJAS[i][0],
                    Configuracion.CAMINO_FINAL_CAJAS[i][1],
                    Configuracion.CAMINO_FINAL_CAJAS[i][2],
                    Configuracion.CAMINO_FINAL_CAJAS[i][3]));
        }

        //Dibuja a los Despachos
        g2.setColor(Color.RED);
        for (int i = 0; i < Configuracion.DESPACHOS.length; i++) {
            g2.fillRect(
                    Configuracion.DESPACHOS[i][0],
                    Configuracion.DESPACHOS[i][1],
                    Configuracion.DESPACHOS[i][2],
                    Configuracion.DESPACHOS[i][3]);
        }

        g2.setColor(Color.ORANGE);
        g2.draw(new Rectangle2D.Double(
                Configuracion.BODEGA[0],
                Configuracion.BODEGA[1],
                Configuracion.BODEGA[2],
                Configuracion.BODEGA[3]));
        //Camino a Bodegas
        for (int i = 0; i < Configuracion.CAMINO_BODEGUEROS_A_BODEGAS.length; i++) {
            g2.draw(new Line2D.Double(
                    Configuracion.CAMINO_BODEGUEROS_A_BODEGAS[i][0],
                    Configuracion.CAMINO_BODEGUEROS_A_BODEGAS[i][1],
                    Configuracion.CAMINO_BODEGUEROS_A_BODEGAS[i][2],
                    Configuracion.CAMINO_BODEGUEROS_A_BODEGAS[i][3]));
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        dibuja_lienzo(g);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    @Override
    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    public void sigueCamino(int[][] camino) {
        createBufferStrategy(2);
        BufferStrategy strategy = getBufferStrategy();
        Graphics2D g2 = (Graphics2D) strategy.getDrawGraphics();
        g2.setColor(Color.RED);
        Rectangle2D rec = new Rectangle2D.Double(
                camino[0][0],
                camino[0][1],
                2, 2);
        //g2.fill(rec);
        for (int i = 0; i < camino.length; i++) {
            int x = camino[i][0]-2;
            int y = camino[i][1]-2;

            int x_final = camino[i][2]-2;
            int y_final = camino[i][3]-2;

            boolean restar_x = false;
            boolean restar_y = false;

            restar_x = x > x_final;
            restar_y = y > y_final;

            while (true) {
                if (restar_x) {
                    if (x > x_final) //Avanza x
                    {
                        x--;
                    }
                } else {
                    if (x < x_final) //Avanza x
                    {
                        x++;
                    }
                }

                if (restar_y) {
                    if (y > y_final) //Avanza y
                    {
                        y--;
                    }
                } else {
                    if (y < y_final) //Avanza y
                    {
                        y++;
                    }
                }

                rec.setFrame(
                        x,
                        y,
                        5, 5);
                this.dibuja_lienzo(strategy.getDrawGraphics());
                g2.fill(rec);
                strategy.show();

                //Sale
                if (x == x_final && y == y_final) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                }
            }
        }

    }
}
