/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaBodega1Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoHaciaBodega1Controller.getInstance();
    }
}
