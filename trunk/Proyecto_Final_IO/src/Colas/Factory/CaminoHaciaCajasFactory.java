/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaCajasFactory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoHaciaCajasController.getInstance();
    }
}
