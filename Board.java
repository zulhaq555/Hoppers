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
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");

    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){
            
            if (i % 2 == 0){

                b[i] = new JButton(lilypad);
                b[i].setIcon(lilypad);

            }else{

                b[i] = new JButton(water);
                b[i].setIcon(water);
                
            }

            panel.add(b[i]);
            
        }

        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(750, 750);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
    }
}