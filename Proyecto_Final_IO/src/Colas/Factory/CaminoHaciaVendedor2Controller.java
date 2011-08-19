/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaVendedor2Controller extends BaseController {
    
    
    
    
    //################################################
    //#                SINGLETON                     #
    //################################################
    private CaminoHaciaVendedor2Controller()
    {
    }
    
    private static CaminoHaciaVendedor2Controller INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CaminoHaciaVendedor2Controller();
        }
    }
    public static CaminoHaciaVendedor2Controller getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
}
