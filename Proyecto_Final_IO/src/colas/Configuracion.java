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
    
    //Puestos de los vendedores
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
    
    //Camino desde vendedores hasta cajas
    public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS[][] = {
        {65, 300, 128, 250},   //Camino desde primer vendedor
        {90, 300, 128, 250},   //Camino desde segundo vendedor
        {114, 300, 128, 250},   //Camino desde tercer vendedor
        {138, 300, 128, 250},   //Camino desde cuarto vendedor
        {162, 300, 128, 250},   //Camino desde quinto vendedor
        {186, 300, 128, 250},   //Camino desde sexto vendedor
        {210, 300, 128, 250}   //Camino desde septimo vendedor
    };
    //Convergencia
    public static int CAMINO_CAJAS[][] = {
        {128, 250, 200, 250},   //Primera Parte
        {200, 250, 200, 240},   //Segunda Parte
        {200, 240, 55, 240},   //Tercera Parte
        {55, 240, 55, 220},   //Cuarta Parte
        {55, 220, 200, 220},   //Quinta Parte
        {200, 220, 200, 200},   //Sexta Parte
        {200, 200, 55, 200},   //Setima Parte
        {55, 200, 55, 180},   //Octava Parte
        {55, 180, 220, 180},   //Novena Parte
        {220, 180, 220, 252},   //Decima Parte
        {220, 252, 230, 252},   //Undecima Parte
    };
    //Caminos final hacia cajas
    public static int CAMINO_FINAL_A_CAJAS[][] = {
        {230, 252, 300, 310},   //Camino hacia primera caja
        {230, 252, 300, 286},   //Camino hacia segunda caja
        {230, 252, 300, 262},   //Camino hacia tercera caja
        {230, 252, 300, 238},   //Camino hacia cuarta caja
        {230, 252, 300, 214},   //Camino hacia quinta caja
        {230, 252, 300, 190},   //Camino hacia sexta caja
    };
    
    //Cajas
    public static int CAJAS[][] = {
        {300, 300, 20, 20},//Dibuja primer cajero (x,y,ancho, alto)
        {300, 276, 20, 20},//Dibuja primer cajero (x,y,ancho, alto)
        {300, 252, 20, 20},//Dibuja primer cajero (x,y,ancho, alto)
        {300, 228, 20, 20},//Dibuja primer cajero (x,y,ancho, alto)
        {300, 204, 20, 20},//Dibuja primer cajero (x,y,ancho, alto)
        {300, 180, 20, 20}//Dibuja primer cajero (x,y,ancho, alto)
    };
}
