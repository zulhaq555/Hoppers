/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Board implements java.awt.event.ActionListener
{
    
    JFrame gameBoard = new JFrame();
    JPanel panel = new JPanel();
    Square[] w = new Square[25];
    GridLayout layout = new GridLayout(5, 5);
    ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");


    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){

            w[i] = new Square(i, i, "");
            panel.add(w[i].getButton());
            w[i].getButton().addActionListener(this);

        }

        w[6].getButton().setIcon(gFrog);
        w[8].getButton().setIcon(gFrog);
        w[12].getButton().setIcon(gFrog);
        w[20].getButton().setIcon(gFrog);
        w[22].getButton().setIcon(rFrog);
        w[24].getButton().setIcon(gFrog);

        

        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(750, 750);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        
    }

}