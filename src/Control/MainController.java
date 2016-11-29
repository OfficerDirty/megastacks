package Control;

import View.MainFrame;

/**
 * Created by gast09 on 28.11.2016.
 */
public class MainController {

    public MainController(MainFrame frame) {
        CardStackHandler stackHandler = new CardStackHandler(frame);
        for(int i = 0; i < 4; i++) {
            if (i == 0) {
                for (int j = 0; j < 13; j++) {
                    stackHandler.createCard(i,j,2);
                }
            }
        }
    }
}
