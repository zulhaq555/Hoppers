/**This is the game interface (board) */

import javax.swing.*;
import  java.awt.*;

public class Board
{
    public Board()
    {
        JFrame a = new JFrame();
        JPanel panel = new JPanel();
        GridLayout g = new GridLayout(5,5);
        panel.setLayout(g);
        a.setContentPane(panel);
        a.setVisible(true);
        a.setTitle("Hoppers!");
        a.setSize(1000,1000);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}