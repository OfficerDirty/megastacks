package Model;


import java.awt.geom.Rectangle2D;
import View.DrawingPanel;
import View.InteractableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
/**
 * Created by gast09 on 28.11.2016.
 */
public class Cards implements InteractableObject{

    private int value;  // 1 = Ace, 11 = Jack, 12 = Queen, 13 = King
    private int sign;  // 1 = Hearts, 2 = Diamond, 3 = Spade, 4 = Club
    private double xPos;
    private double yPos = 100;
    private Rectangle2D rectangle;
    private boolean flipped;
    private Image cardback1 = Toolkit.getDefaultToolkit().getImage("cardback.png");
    private Image hearts = Toolkit.getDefaultToolkit().getImage("heart.png");
    private Image diamond = Toolkit.getDefaultToolkit().getImage("diamond.png");
    private Image clubs = Toolkit.getDefaultToolkit().getImage("clubs.png");
    private Image spade = Toolkit.getDefaultToolkit().getImage("spades.png");

    public Cards(int sign , int value, boolean flipped){
        this.flipped = flipped;
        this.value = value;
        this.sign = sign;
        createGraphics();
    }

    private void createGraphics(){
        rectangle = new Rectangle2D.Double(xPos,yPos,300,500);
    }

    public int getSign() {
        return sign;
    }
    public int getValue(){
        return value;
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        if (flipped == true) {
            if (sign == 1) {
                g2d.drawImage(hearts, 140, 200, null);
            }
            if (sign == 2) {
                g2d.drawImage(diamond, 140, 200, null);
            }
            if (sign == 3) {
                g2d.drawImage(spade, 140, 200, null);
            }
            if (sign == 4) {
                g2d.drawImage(clubs, 140, 200, null);
            }
            //g2d.drawString("" + value, 160, 200);
        }
        g2d.drawImage(cardback1, 600, 100, null);
    }

    public void setXPos(double newPos){
        xPos = newPos;
    }

    public void switchFlipped(){
        if(flipped == true){
            flipped = false;
        }
        if(flipped == false){
            flipped = true;
        }
    }

    @Override
    public void update(double dt) {
        rectangle.setFrame(xPos, yPos, 300, 500);
    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
