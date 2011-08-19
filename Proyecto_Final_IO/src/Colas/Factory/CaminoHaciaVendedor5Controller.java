/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaVendedor5Controller extends BaseController {
    
    
    
    
    //################################################
    //#                SINGLETON                     #
    //################################################
    private CaminoHaciaVendedor5Controller()
    {
    }
    
    private static CaminoHaciaVendedor5Controller INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CaminoHaciaVendedor5Controller();
        }
    }
    public static CaminoHaciaVendedor5Controller getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
}
