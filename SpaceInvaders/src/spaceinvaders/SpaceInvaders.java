/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

/**
 *
 * @author edugonch
 */
public class SpaceInvaders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game g = new Game();

        // Start the main game loop, note: this method will not

        // return until the game has finished running. Hence we are

        // using the actual main thread to run the game.

        g.gameLoop();
    }
}
