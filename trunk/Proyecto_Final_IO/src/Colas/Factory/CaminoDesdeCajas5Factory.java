/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas.Factory;

/**
 *
 * @author edugonch
 */
public class CaminoDesdeCajas5Factory implements ControllerFactory {
    public BaseController createController()
    {
        return CaminoDesdeCajas5Controller.getInstance();
    }
}
