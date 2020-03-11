/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Board implements java.awt.event.ActionListener
{
    
    JFrame gameBoard = new JFrame();
    JPanel panel = new JPanel();
    GridLayout layout = new GridLayout(5, 5);

    Square[] button = new Square[25];
    String piece;
    int rlocation = 23;
    int glocation[] = {6, 8, 12, 21};

    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){

            for (int c = 0; c < 3; c++){
                if (glocation[c] == i){
                    button[i] = new Square(i, "Gfrog");
                }
            }

            button[i] = new Square(i, "");
            panel.add(button[i].getButton());
            button[i].getButton().addActionListener(this);

        }

                

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