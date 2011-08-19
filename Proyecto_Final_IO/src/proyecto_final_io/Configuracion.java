/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final_io;
import java.awt.*;
/**
 *
 * @author edugonch
 */
public class Configuracion {
    //Camino para entrar al establecimiento
    public static Color COLOR_CAMINO_INICIAL = Color.BLACK;
    public static Stroke STROKE_CAMINO_INICIAL = new BasicStroke(2);
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
    public static int HABITACION[][] = {{50, 1, 455, 420}};// (x,y, ancho, alto
    
    public static Color COLOR_VENDEDORES = Color.GREEN;
    public static Stroke STROKE_VENDEDORES = new BasicStroke(2);
    //Puestos de los vendedores
    public static int VENDEDORES[][] = {
        {55, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {80, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {104, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {128, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {152, 300, 20, 20},//Dibuja primer vendedor (x,y,ancho, alto)
        {176, 300, 20, 20}//Dibuja primer vendedor (x,y,ancho, alto)
    };
    
    //Camino principal hacia vendedores
    public static Color COLOR_CAMINO_A_VENDEDORES = Color.GRAY;
    public static Stroke STROKE_CAMINO_A_VENDEDORES = new BasicStroke(2);
    public static int CAMINO_A_VENDEDORES[][] = {
        {300, 425, 300, 415},//Coordenadas del primer trayecto (x,y,x,y)
        {300, 415, 490, 415},//Coordenadas del segundo trayecto (x,y,x,y)
        {490, 415, 490, 395},//Coordenadas del tercer trayecto (x,y,x,y)
        {490, 395, 127, 395},//Coordenadas del cuarto trayecto (x,y,x,y)
        {127, 395, 127, 385}
    };
    public static int CAMINO_FINAL_A_VENDEDORES1[][] = {
         {65, 385, 65, 320},
         {65, 385, 118, 385}
    };
    public static int CAMINO_FINAL_A_VENDEDORES2[][] = {
        {90, 375, 90, 320},
        {90, 375, 118, 375}
    };
    public static int CAMINO_FINAL_A_VENDEDORES3[][] = {
        {114, 365, 114, 320},
        {114, 365, 118, 365}
    };
    public static int CAMINO_FINAL_A_VENDEDORES4[][] = {
        {138, 365, 138, 320},
        {134, 365, 138, 365}
    };
    public static int CAMINO_FINAL_A_VENDEDORES5[][] = {
        {162, 375, 162, 320},
        {134, 375, 162, 375}
    };
    public static int CAMINO_FINAL_A_VENDEDORES6[][] = {
        {186, 385, 186, 320},
        {134, 385, 186, 385}
    };
  
    //Camino desde vendedores hasta cajas
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS1[][] = {
         {65, 300, 65, 260},
         {65, 260, 116, 260}
     };
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS2[][] = {
         {90, 300, 90, 270},
         {90, 270, 116, 270}
     };
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS3[][] = {
         {114, 300, 114, 280},
         {114, 280, 116, 280}
     };
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS4[][] = {
         {138, 300, 138, 280},
         {136, 280, 138, 280}
     };
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS5[][] = {
         {162, 300, 162, 270},
         {136, 270, 162, 270}
     };
     public static int CAMINO_DESDE_VENDEDORES_HASTA_CAJAS6[][] = {
         {186, 300, 186, 260},
         {136, 260, 186, 260}
     };

    //Convergencia
     public static Color COLOR_CAMINO_A_CAJAS = Color.BLUE;
    public static Stroke STROKE_CAMINO_A_CAJAS = new BasicStroke(2);
    public static int CAMINO_CAJAS[][] = {
        {128, 260, 128, 250},
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
    
    //Cajas
    public static Color COLOR_CAJAS = new Color(128, 120, 86);
    public static Stroke STROKE_CAJAS = new BasicStroke(2);
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
    
    //Camino desde cajas hacia bodegueros
    public static Color COLOR_CAMINO_A_BODEGUEROS = Color.BLACK;
    public static Stroke STROKE_CAMINO_A_BODEGUEROS = new BasicStroke(2);
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
    public static Color COLOR_DESPACHOS = Color.RED;
    public static Stroke STROKE_DESPACHOS = new BasicStroke(2);
    public static int DESPACHOS[][] = {
        {180, 106, 20, 20},//Dibuja segundo bodeguero (x,y,ancho, alto)
        {180, 82, 20, 20},//Dibuja tercero bodeguero (x,y,ancho, alto)
        {180, 58, 20, 20},//Dibuja cuarto bodeguero (x,y,ancho, alto)
        {180, 34, 20, 20},//Dibuja quinto bodeguero (x,y,ancho, alto)
        {180, 10, 20, 20}//Dibuja sexto bodeguero (x,y,ancho, alto)
    };
    
    //Bodega (contenedor) de pedidos
    public static Color COLOR_CAMINO_A_BODEGAS = Color.ORANGE;
    public static Stroke STROKE_CAMINO_A_BODEGAS = new BasicStroke(2);
    public static int BODEGA[][] = 
    {{280, 12, 220, 130 }};
    
    //Camino de bodegueros a bodegas
    public static int CAMINO_BODEGUEROS_A_BODEGAS1[][] = {
        {200, 20, 280, 20}
    };
    public static int CAMINO_BODEGUEROS_A_BODEGAS2[][] = {
        {200, 44, 280, 44}
    };
    public static int CAMINO_BODEGUEROS_A_BODEGAS3[][] = {
        {200, 68, 280, 68}
    };
    public static int CAMINO_BODEGUEROS_A_BODEGAS4[][] = {
        {200, 92, 280, 92}
    };
    public static int CAMINO_BODEGUEROS_A_BODEGAS5[][] = {
        {200, 116, 280, 116}
    };
}
