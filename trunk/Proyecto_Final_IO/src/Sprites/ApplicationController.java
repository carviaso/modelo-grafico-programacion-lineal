/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprites;

import Colas.*;
import Colas.Factory.*;
import com.sun.xml.internal.bind.v2.util.FatalAdapter;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.image.BufferStrategy;
import proyecto_final_io.Configuracion;
import java.awt.image.BufferStrategy;
/*
Los delegados de comunicación y las variables globales de la aplicacion
 */

/**
 *
 * @author edugonch
 */
public class ApplicationController extends Canvas {

    private Fact fact = new Fact();
    private java.util.ArrayList<Camino> array_caminos = new java.util.ArrayList<Camino>();
    /* ==================== CONTROLADORES DE CAMINOS ===========================*/
    public BaseController controladorCaminoPrincipal = fact.getFactory(Factories.CAMINO_PRINCIPAL);
    public BaseController controladorCaminoHaciaVendedores = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES);
    public BaseController controladorCaminoHaciaVendedores1 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES1);
    public BaseController controladorCaminoHaciaVendedores2 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES2);
    public BaseController controladorCaminoHaciaVendedores3 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES3);
    public BaseController controladorCaminoHaciaVendedores4 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES4);
    public BaseController controladorCaminoHaciaVendedores5 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES5);
    public BaseController controladorCaminoHaciaVendedores6 = fact.getFactory(Factories.CAMINO_HACIA_VENDEDORES6);
    public BaseController controladorCaminoDesdeVendedores1 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES1);
    public BaseController controladorCaminoDesdeVendedores2 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES2);
    public BaseController controladorCaminoDesdeVendedores3 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES3);
    public BaseController controladorCaminoDesdeVendedores4 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES4);
    public BaseController controladorCaminoDesdeVendedores5 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES5);
    public BaseController controladorCaminoDesdeVendedores6 = fact.getFactory(Factories.CAMINO_DESDE_VENDEDORES6);
    public BaseController controladorCaminoHaciaCajeros = fact.getFactory(Factories.CAMINO_HACIA_CAJAS);
    public BaseController controladorCaminoHaciaCajeros1 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS1);
    public BaseController controladorCaminoHaciaCajeros2 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS2);
    public BaseController controladorCaminoHaciaCajeros3 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS3);
    public BaseController controladorCaminoHaciaCajeros4 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS4);
    public BaseController controladorCaminoHaciaCajeros5 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS5);
    public BaseController controladorCaminoHaciaCajeros6 = fact.getFactory(Factories.CAMINO_HACIA_CAJAS6);
    public BaseController controladorCaminoDesdeCajeros1 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS1);
    public BaseController controladorCaminoDesdeCajeros2 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS2);
    public BaseController controladorCaminoDesdeCajeros3 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS3);
    public BaseController controladorCaminoDesdeCajeros4 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS4);
    public BaseController controladorCaminoDesdeCajeros5 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS5);
    public BaseController controladorCaminoDesdeCajeros6 = fact.getFactory(Factories.CAMINO_DESDE_CAJAS6);
    public BaseController controladorCaminoHaciaBodegueros = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS);
    public BaseController controladorCaminoHaciaBodegueros1 = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS1);
    public BaseController controladorCaminoHaciaBodegueros2 = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS2);
    public BaseController controladorCaminoHaciaBodegueros3 = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS3);
    public BaseController controladorCaminoHaciaBodegueros4 = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS4);
    public BaseController controladorCaminoHaciaBodegueros5 = fact.getFactory(Factories.CAMINO_HACIA_BODEGUEROS5);
    public BaseController controladorCaminoHaciaBodegas1 = fact.getFactory(Factories.CAMINO_HACIA_BODEGA1);
    public BaseController controladorCaminoHaciaBodegas2 = fact.getFactory(Factories.CAMINO_HACIA_BODEGA2);
    public BaseController controladorCaminoHaciaBodegas3 = fact.getFactory(Factories.CAMINO_HACIA_BODEGA3);
    public BaseController controladorCaminoHaciaBodegas4 = fact.getFactory(Factories.CAMINO_HACIA_BODEGA4);
    public BaseController controladorCaminoHaciaBodegas5 = fact.getFactory(Factories.CAMINO_HACIA_BODEGA5);
    /* =========================================================================*/
    private BufferStrategy strategy;
    private Graphics tg;

    public void pintaTodo() {
        /*Pintar Caminos*/
        dibuja_lienzo(tg);
        PintarCaminos();
        ((Graphics2D)tg).dispose();
	strategy.show();
    }

    public void PintarCaminos() {
        controladorCaminoPrincipal.getCamino().paint();

        controladorCaminoHaciaVendedores.getCamino().paint();
        controladorCaminoHaciaVendedores1.getCamino().paint();
        controladorCaminoHaciaVendedores2.getCamino().paint();
        controladorCaminoHaciaVendedores3.getCamino().paint();
        controladorCaminoHaciaVendedores4.getCamino().paint();
        controladorCaminoHaciaVendedores5.getCamino().paint();
        controladorCaminoHaciaVendedores6.getCamino().paint();
        controladorCaminoDesdeVendedores1.getCamino().paint();
        controladorCaminoDesdeVendedores2.getCamino().paint();
        controladorCaminoDesdeVendedores3.getCamino().paint();
        controladorCaminoDesdeVendedores4.getCamino().paint();
        controladorCaminoDesdeVendedores5.getCamino().paint();
        controladorCaminoDesdeVendedores6.getCamino().paint();

        controladorCaminoHaciaCajeros.getCamino().paint();
        controladorCaminoHaciaCajeros1.getCamino().paint();
        controladorCaminoHaciaCajeros2.getCamino().paint();
        controladorCaminoHaciaCajeros3.getCamino().paint();
        controladorCaminoHaciaCajeros4.getCamino().paint();
        controladorCaminoHaciaCajeros5.getCamino().paint();
        controladorCaminoHaciaCajeros6.getCamino().paint();
        controladorCaminoDesdeCajeros1.getCamino().paint();
        controladorCaminoDesdeCajeros2.getCamino().paint();
        controladorCaminoDesdeCajeros3.getCamino().paint();
        controladorCaminoDesdeCajeros4.getCamino().paint();
        controladorCaminoDesdeCajeros5.getCamino().paint();
        controladorCaminoDesdeCajeros6.getCamino().paint();

        controladorCaminoHaciaBodegueros.getCamino().paint();
        controladorCaminoHaciaBodegueros1.getCamino().paint();
        controladorCaminoHaciaBodegueros2.getCamino().paint();
        controladorCaminoHaciaBodegueros3.getCamino().paint();
        controladorCaminoHaciaBodegueros4.getCamino().paint();
        controladorCaminoHaciaBodegueros5.getCamino().paint();

        controladorCaminoHaciaBodegas1.getCamino().paint();
        controladorCaminoHaciaBodegas2.getCamino().paint();
        controladorCaminoHaciaBodegas3.getCamino().paint();
        controladorCaminoHaciaBodegas4.getCamino().paint();
        controladorCaminoHaciaBodegas5.getCamino().paint();
    }

    //################################################
    //#                CANVAS                        #
    //################################################
    public void dibuja_lienzo(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // draw entire component white
        g.setColor(Color.white);
        g.fillRect(0, 0, getWidth(), getHeight());

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
        for (int i = 0; i < Configuracion.HABITACION.length; i++) {
            g2.draw(new Rectangle2D.Double(
                    Configuracion.HABITACION[i][0],
                    Configuracion.HABITACION[i][1],
                    Configuracion.HABITACION[i][2],
                    Configuracion.HABITACION[i][3]));

        }
        //Dibuja a los Vendedores
        g2.setColor(Color.GREEN);
        for (int i = 0; i < Configuracion.VENDEDORES.length; i++) {
            g2.fillRect(
                    Configuracion.VENDEDORES[i][0],
                    Configuracion.VENDEDORES[i][1],
                    Configuracion.VENDEDORES[i][2],
                    Configuracion.VENDEDORES[i][3]);
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
        for (int i = 0; i < Configuracion.BODEGA.length; i++) {
            g2.draw(new Rectangle2D.Double(
                    Configuracion.BODEGA[i][0],
                    Configuracion.BODEGA[i][1],
                    Configuracion.BODEGA[i][2],
                    Configuracion.BODEGA[i][3]));
        }
    }


    //################################################
    //#                SINGLETON                     #
    //################################################
    private ApplicationController() {
        JFrame container = new JFrame("Proyecto Final de IO");

        // get hold the content of the frame and set up the resolution of the game

        JPanel panel = (JPanel) container.getContentPane();
        panel.setPreferredSize(new Dimension(800, 800));
        panel.setLayout(null);

        // setup our canvas size and put it into the content of the frame

        setBounds(0, 0, 800, 800);
        panel.add(this);

        // Tell AWT not to bother repainting our canvas since we're

        // going to do that our self in accelerated mode

        setIgnoreRepaint(true);

        // finally make the window visible 

        container.pack();
        container.setResizable(false);
        container.setVisible(true);

        // request the focus so key events come to us

        requestFocus();
        createBufferStrategy(2);
        this.strategy = getBufferStrategy();
        tg = strategy.getDrawGraphics();
        
        //#################################################
        //# Inicializa coordenadas y colores para caminos #
        //#################################################
        this.controladorCaminoPrincipal.setCamino(new Camino(Configuracion.CAMINO_INICIAL,
                Configuracion.COLOR_CAMINO_INICIAL, Configuracion.STROKE_CAMINO_INICIAL, tg));

        this.controladorCaminoHaciaVendedores.setCamino(new Camino(Configuracion.CAMINO_A_VENDEDORES,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores1.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES1,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores2.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES2,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores3.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES3,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores4.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES4,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores5.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES5,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoHaciaVendedores6.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_VENDEDORES6,
                Configuracion.COLOR_CAMINO_A_VENDEDORES, Configuracion.STROKE_CAMINO_A_VENDEDORES, tg));
        this.controladorCaminoDesdeVendedores1.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS1,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeVendedores2.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS2,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeVendedores3.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS3,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeVendedores4.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS4,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeVendedores5.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS5,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeVendedores6.setCamino(new Camino(Configuracion.CAMINO_DESDE_VENDEDORES_HASTA_CAJAS6,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));


        this.controladorCaminoHaciaCajeros.setCamino(new Camino(Configuracion.CAMINO_CAJAS,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros1.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS1,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros2.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS2,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros3.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS3,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros4.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS4,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros5.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS5,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoHaciaCajeros6.setCamino(new Camino(Configuracion.CAMINO_FINAL_A_CAJAS6,
                Configuracion.COLOR_CAMINO_A_CAJAS, Configuracion.STROKE_CAMINO_A_CAJAS, tg));
        this.controladorCaminoDesdeCajeros1.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS1,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoDesdeCajeros2.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS2,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoDesdeCajeros3.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS3,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoDesdeCajeros4.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS4,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoDesdeCajeros5.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS5,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoDesdeCajeros6.setCamino(new Camino(Configuracion.CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS6,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));

        this.controladorCaminoHaciaBodegueros.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoHaciaBodegueros1.setCamino(new Camino(Configuracion.CAMINO_FINAL_BODEGUEROS_1,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoHaciaBodegueros2.setCamino(new Camino(Configuracion.CAMINO_FINAL_BODEGUEROS_2,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoHaciaBodegueros3.setCamino(new Camino(Configuracion.CAMINO_FINAL_BODEGUEROS_3,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoHaciaBodegueros4.setCamino(new Camino(Configuracion.CAMINO_FINAL_BODEGUEROS_4,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));
        this.controladorCaminoHaciaBodegueros5.setCamino(new Camino(Configuracion.CAMINO_FINAL_BODEGUEROS_5,
                Configuracion.COLOR_CAMINO_A_BODEGUEROS, Configuracion.STROKE_CAMINO_A_BODEGUEROS, tg));

        this.controladorCaminoHaciaBodegas1.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS_A_BODEGAS1,
                Configuracion.COLOR_CAMINO_A_BODEGAS, Configuracion.STROKE_CAMINO_A_BODEGAS, tg));
        this.controladorCaminoHaciaBodegas2.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS_A_BODEGAS2,
                Configuracion.COLOR_CAMINO_A_BODEGAS, Configuracion.STROKE_CAMINO_A_BODEGAS, tg));
        this.controladorCaminoHaciaBodegas3.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS_A_BODEGAS3,
                Configuracion.COLOR_CAMINO_A_BODEGAS, Configuracion.STROKE_CAMINO_A_BODEGAS, tg));
        this.controladorCaminoHaciaBodegas4.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS_A_BODEGAS4,
                Configuracion.COLOR_CAMINO_A_BODEGAS, Configuracion.STROKE_CAMINO_A_BODEGAS, tg));
        this.controladorCaminoHaciaBodegas5.setCamino(new Camino(Configuracion.CAMINO_BODEGUEROS_A_BODEGAS5,
                Configuracion.COLOR_CAMINO_A_BODEGAS, Configuracion.STROKE_CAMINO_A_BODEGAS, tg));

        //#################################################
        //#                  Fin caminos                  #
        //#################################################

        pintaTodo();
    }
    private static ApplicationController INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ApplicationController();
        }
    }

    public static ApplicationController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
