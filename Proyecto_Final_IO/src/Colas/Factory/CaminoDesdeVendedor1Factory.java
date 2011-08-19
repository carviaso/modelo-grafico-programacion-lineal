/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoDesdeVendedor1Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoDesdeVendedor1Controller.getInstance();
    }
}
