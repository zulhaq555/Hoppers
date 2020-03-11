/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;

public class Board
{
    
    private JFrame gameBoard = new JFrame();
    private JPanel panel = new JPanel();
    private Square[] w = new Square[25];
    private GridLayout layout = new GridLayout(5, 5);
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");



    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){

            w[i] = new Square(i, i, "");
            panel.add(w[i].getButton());
            
        }

        w[0].getButton().setIcon(rFrog);
        w[6].getButton().setIcon(gFrog);

        
        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(750, 750);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
    }
}