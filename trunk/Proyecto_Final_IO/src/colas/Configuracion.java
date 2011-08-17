/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import com.sun.org.apache.bcel.internal.generic.PUSH;

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
    public static int CAMINO_FINAL_A_CAJAS1[][] = {
        {230, 262, 230, 310},
        {230, 310, 300, 310}
    };
    public static int CAMINO_FINAL_A_CAJAS2[][] = {
        {240, 262, 240, 286},
        {240, 286, 300, 286}
    };
    public static int CAMINO_FINAL_A_CAJAS3[][] = {
        {250, 262, 300, 262}
    };
    public static int CAMINO_FINAL_A_CAJAS4[][] = {
        {250, 238, 300, 238}
    };
    public static int CAMINO_FINAL_A_CAJAS5[][] = {
        {240, 238, 240, 214},
        {240, 214, 300, 214}
    };
    public static int CAMINO_FINAL_A_CAJAS6[][] = {
        {230, 238, 230, 190},
        {230, 190, 300, 190}
    };
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
        {300, 276, 20, 20},//Dibuja segundo cajero (x,y,ancho, alto)
        {300, 252, 20, 20},//Dibuja tercero cajero (x,y,ancho, alto)
        {300, 228, 20, 20},//Dibuja cuarto cajero (x,y,ancho, alto)
        {300, 204, 20, 20},//Dibuja quinto cajero (x,y,ancho, alto)
        {300, 180, 20, 20}//Dibuja sexto cajero (x,y,ancho, alto)
    };
    
    //Camino desde cajas hacia bodegueros
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS1[][] = {
        {320, 310, 400, 310},
        {400, 310, 400, 262}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS2[][] = {
        {320, 286, 390, 286},
        {390, 286, 390, 262}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS3[][] = {
        {320, 262, 380, 262}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS4[][] = {
        {320, 238, 380, 238}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS5[][] = {
        {320, 214, 390, 214},
        {390, 214, 390, 238}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS6[][] = {
        {320, 190, 400, 190},
        {400, 190, 400, 238}
    };
    public static int CAMINO_DESDE_CAJAS_HACIA_BODEGUEROS[][] = {
        {320, 310, 400, 252},//Dibuja primera parte 
        {320, 286, 400, 252},//Dibuja segunda parte 
        {320, 262, 400, 252},//Dibuja tercera parte 
        {320, 238, 400, 252},//Dibuja cuarta parte 
        {320, 214, 400, 252},//Dibuja quinta parte 
        {320, 190, 400, 252}//Dibuja sexta parte 
    };
    
    //Camino desde cajas hacia bodegueros
    public static int CAMINO_BODEGUEROS[][] = {
        {400, 252, 410, 252},//Dibuja primera parte 
        {410, 252, 410, 370},//Dibuja segunda parte
        {410, 370, 430, 370},//Dibuja tercera parte 
        {430, 370, 430, 180},//Dibuja cuarta parte 
        {430, 180, 450, 180},//Dibuja quinta parte
        {450, 180, 450, 370},//Dibuja sexta parte
        {450, 370, 470, 370},//Dibuja sexta parte
        {470, 370, 470, 150},//Dibuja sexta parte
        {470, 150, 55, 150},//Dibuja sexta parte
        {55, 150, 55, 68},//Dibuja sexta parte
        {55, 68, 70, 68},//Dibuja sexta parte
    };
    
    //Camino final de cajas
    public static int CAMINO_FINAL_BODEGUEROS_1[][] = 
    {
        {70, 58, 70, 20},
        {70, 20, 180, 20}
    };
    public static int CAMINO_FINAL_BODEGUEROS_2[][] = 
    {
        {80, 58, 80, 44},
        {80, 44, 180, 44}
    };
    public static int CAMINO_FINAL_BODEGUEROS_3[][] = 
    {
        {80, 68, 180, 68}
    };
    public static int CAMINO_FINAL_BODEGUEROS_4[][] = 
    {
        {80, 78, 80, 92},
        {80, 92, 180, 92}
    };
    public static int CAMINO_FINAL_BODEGUEROS_5[][] = 
    {
        {70, 78, 70, 116},
        {70, 116, 180, 116}
    };
    
    //Despachos de bodegueros
    public static int DESPACHOS[][] = {
        {180, 106, 20, 20},//Dibuja segundo bodeguero (x,y,ancho, alto)
        {180, 82, 20, 20},//Dibuja tercero bodeguero (x,y,ancho, alto)
        {180, 58, 20, 20},//Dibuja cuarto bodeguero (x,y,ancho, alto)
        {180, 34, 20, 20},//Dibuja quinto bodeguero (x,y,ancho, alto)
        {180, 10, 20, 20}//Dibuja sexto bodeguero (x,y,ancho, alto)
    };
    
    //Bodega (contenedor) de pedidos
    public static int BODEGA[] = {280, 12, 220, 130 };
    
    //Camino de bodegueros a bodegas
    public static int CAMINO_BODEGUEROS_A_BODEGAS[][] = {
        {200, 20, 280, 20},//Dibuja primera parte 
        {200, 44, 280, 44},//Dibuja segunda parte 
        {200, 68, 280, 68},//Dibuja tercera parte 
        {200, 92, 280, 92},//Dibuja cuarta parte 
        {200, 116, 280, 116}//Dibuja quinta parte
    };
}
