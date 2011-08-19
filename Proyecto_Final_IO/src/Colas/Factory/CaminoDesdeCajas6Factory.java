/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoDesdeCajas6Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoDesdeCajas6Controller.getInstance();
    }
}
