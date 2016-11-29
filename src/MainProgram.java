import Control.MainController;
import View.MainFrame;

import java.awt.*;

/**
 * Created by Jean-Pierre on 15.11.2016.
 */
public class MainProgram {
    public static void main (String[] args){
        EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });
    }

    private static void setup(){
        new MainController(new MainFrame("Erste graphische Ausgabe",50,50,1000,900));
    }
}