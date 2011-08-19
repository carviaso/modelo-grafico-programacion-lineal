/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoHaciaBodeguerosFactory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoHaciaBodeguerosController.getInstance();
    }
}
