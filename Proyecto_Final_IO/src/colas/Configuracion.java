/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

/**
 *
 * @author edugonch
 */
public class Configuracion {
    //Camino para entrar al establecimiento

    public static int CAMINO_INICIAL[][] = {
        {253, 560, 253, 550},//Coordenadas del primer trayecto (x,y,x,y)
        {253, 550, 490, 550},//Coordenadas del segundo trayecto (x,y,x,y)
        {490, 550, 490, 520},//Coordenadas del tercer trayecto (x,y,x,y)
        {490, 520, 100, 520},//Coordenadas del cuarto trayecto (x,y,x,y)
        {100, 520, 100, 490},//Coordenadas del quinto trayecto (x,y,x,y)
        {100, 490, 490, 490},//Coordenadas del sexto trayecto (x,y,x,y)
        {490, 490, 490, 460},//Coordenadas del septimo trayecto (x,y,x,y)
        {490, 460, 300, 460},//Coordenadas del octavo trayecto (x,y,x,y)
        {300, 460, 300, 440}//Coordenadas del octavo trayecto (x,y,x,y)
    };
    //Puerta del establecimiento
    public static int PUERTA_INICIO[][] = {
        {290, 420, 20, 20},//Dibuja la parte exterior (x,y,ancho, alto)
        {295, 425, 10, 10}//Dibuja la parte interior (x,y,ancho, alto)
    };
    //Caja de la habitación
    public static int HABITACION[] = {50, 1, 455, 420};// (x,y, ancho, alto
    
    //Cajas de los vendedores
    public static int VENDEDORES[][] = {
        {55, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {80, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {104, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {128, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {152, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {176, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {200, 300, 20, 20}//Dibuja primer vendedor (x,y,ancho, alto)
    };
    
    //Camino principal hacia vendedores
    public static int CAMINO_A_VENDEDORES[][] = {
        {300, 425, 300, 415},//Coordenadas del primer trayecto (x,y,x,y)
        {300, 415, 490, 415},//Coordenadas del segundo trayecto (x,y,x,y)
        {490, 415, 490, 385},//Coordenadas del tercer trayecto (x,y,x,y)
        {490, 385, 128, 385}//Coordenadas del cuarto trayecto (x,y,x,y)
    };
    
    public static int CAMINO_FINAL_A_VENDEDORES[][] = {
        {128, 385, 65, 320}, //Camino a primer vendedor
        {128, 385, 90, 320}, //Camino a segundo vendedor
        {128, 385, 114, 320}, //Camino a tercer vendedor
        {128, 385, 138, 320}, //Camino a cuarto vendedor
        {128, 385, 162, 320}, //Camino a quinto vendedor
        {128, 385, 186, 320}, //Camino a sexto vendedor
        {128, 385, 210, 320}, //Camino a setimo vendedor
        
    };
}
