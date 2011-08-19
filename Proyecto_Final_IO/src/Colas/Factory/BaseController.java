/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public abstract class BaseController {

   /* private static BaseController INSTANCE = null;

    // Private constructor suppresses 
    private BaseController() {
    }

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new BaseController();
        }
    }

    public static BaseController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
    //El metodo "clone" es sobreescrito por el siguiente que arroja una excepción:
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }*/
   
    //El metodo "clone" es sobreescrito por el siguiente que arroja una excepción:
    private Sprites.Camino camino;
    
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    /**
     * @return the camino
     */
    public Sprites.Camino getCamino() {
        return camino;
    }

    /**
     * @param camino the camino to set
     */
    public void setCamino(Sprites.Camino camino) {
        this.camino = camino;
    }
    
}
