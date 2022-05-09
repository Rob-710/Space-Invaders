package src;

import java.awt.event.KeyEvent;

public class Player {

    private final int y_Position = 0; 
    private final int x_Position = 5;
    private final int Lives = 3;
    private int x_axis;

    public Player() {

     //image files for player to be added
    	
        getX(x_Position);
        getY(y_Position);
    }

    public void movement() {
        x_Position += x_axis;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            x_axis = -2;
        }

        if (key == KeyEvent.VK_RIGHT)
        {
            x_axis = 2;
        }

    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT)
        {
            x_axis = 0;
        }

        if (key == KeyEvent.VK_RIGHT)
        {
            x_axis = 0;
        }
    }
}



}
public int getY() {
    return y_Position;
}

public int getX() {
    return x_Position;
}
