/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoDesdeCajas2Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoDesdeCajas2Controller.getInstance();
    }
}
