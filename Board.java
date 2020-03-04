/**This is the game interface (board) */

import javax.swing.*;
import  java.awt.*;

public class Board
{
    JFrame a = new JFrame();
    JPanel panel = new JPanel();
    GridLayout g = new GridLayout(5,5);
    ImageIcon water = new ImageIcon("Water.png");
    JButton w = new JButton(water);
    
   
    public Board()
    {
        w.setIcon(water);
        w.setPreferredSize(new Dimension(40,40));
        panel.add(w);
        a.setContentPane(panel);
        panel.setLayout(g);
        a.setTitle("Hoppers!");
        a.setSize(1000,1000);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }
}