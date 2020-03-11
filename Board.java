/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener
{
    
    private JFrame gameBoard = new JFrame();
    private JPanel panel = new JPanel();
    private Square[] button = new Square[25];
    private GridLayout layout = new GridLayout(5, 5);
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");

    int location;

    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){

            /**you must to the adding peices function in here */

            button[i] = new Square(i, "");
            panel.add(button[i].getButton());
            
        }

        button[6].getButton().setIcon(gFrog);
        button[8].getButton().setIcon(gFrog);
        button[12].getButton().setIcon(gFrog);
        button[20].getButton().setIcon(gFrog);
        button[22].getButton().setIcon(rFrog);
        button[24].getButton().setIcon(gFrog);

        
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