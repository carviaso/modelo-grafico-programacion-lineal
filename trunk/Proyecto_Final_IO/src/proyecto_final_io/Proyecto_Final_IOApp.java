/*
 * Proyecto_Final_IOApp.java
 */

package proyecto_final_io;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class Proyecto_Final_IOApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new Proyecto_Final_IOView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of Proyecto_Final_IOApp
     */
    public static Proyecto_Final_IOApp getApplication() {
        return Application.getInstance(Proyecto_Final_IOApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(Proyecto_Final_IOApp.class, args);
    }
}
