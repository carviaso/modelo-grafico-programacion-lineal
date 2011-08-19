/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoDesdeVendedor4Controller extends BaseController {
    
    
    
    
    //################################################
    //#                SINGLETON                     #
    //################################################
    private CaminoDesdeVendedor4Controller()
    {
    }
    
    private static CaminoDesdeVendedor4Controller INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CaminoDesdeVendedor4Controller();
        }
    }
    public static CaminoDesdeVendedor4Controller getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
}
