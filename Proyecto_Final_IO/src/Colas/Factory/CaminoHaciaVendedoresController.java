/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaVendedoresController extends BaseController {
    
    
    
    
    //################################################
    //#                SINGLETON                     #
    //################################################
    private CaminoHaciaVendedoresController()
    {
    }
    
    private static CaminoHaciaVendedoresController INSTANCE = null;

    // creador sincronizado para protegerse de posibles problemas  multi-hilo
    // otra prueba para evitar instanciación múltiple 
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new CaminoHaciaVendedoresController();
        }
    }
    public static CaminoHaciaVendedoresController getInstance() {
        if (INSTANCE == null) {
            createInstance();
        }
        return INSTANCE;
    }
}
