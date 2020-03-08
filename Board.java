/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;

public class Board
{
    
    private JFrame gameBoard = new JFrame();
    private JPanel panel = new JPanel();
    private JButton[] b = new JButton[25];
    private GridLayout layout = new GridLayout(5, 5);
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/Water.png");

    public Board()
    {
        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){
            
            /*if i is even, button is lilipad, else button is water*/ 

            b[i] = new JButton(water);
            b[i].setIcon(water);
            b[i].setSize(40, 40);
            
            panel.add(b[i]);
            
        }

        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(1000, 1000);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
    }
}