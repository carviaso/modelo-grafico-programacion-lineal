/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaVendedor3Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoHaciaVendedor3Controller.getInstance();
    }
}
