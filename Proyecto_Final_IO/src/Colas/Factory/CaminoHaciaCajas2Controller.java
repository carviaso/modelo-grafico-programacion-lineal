/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaCajas2Controller extends BaseController {
    
    
    
    
    //################################################
    //#                SINGLETON                     #
    //################################################
    private CaminoHaciaCajas2Controller()
    {
    }
    
    private static CaminoHaciaCajas2Controller INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CaminoHaciaCajas2Controller();
        }
    }
    public static CaminoHaciaCajas2Controller getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
}
