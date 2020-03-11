/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Board implements java.awt.event.ActionListener
{
    
<<<<<<< HEAD
    JFrame gameBoard = new JFrame();
    JPanel panel = new JPanel();
    GridLayout layout = new GridLayout(5, 5);
=======
<<<<<<< HEAD
    JFrame gameBoard = new JFrame();
    JPanel panel = new JPanel();
    GridLayout layout = new GridLayout(5, 5);
=======
    private JFrame gameBoard = new JFrame();
    private JPanel panel = new JPanel();
    private Square[] w = new Square[25];
    private GridLayout layout = new GridLayout(5, 5);
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");

>>>>>>> parent of 7c45e39... Action Listener
>>>>>>> parent of a820f57... Reverted files

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

                

<<<<<<< HEAD
=======
=======
            w[i] = new Square(i, i, "");
            panel.add(w[i].getButton());
            
        }

        w[0].getButton().setIcon(rFrog);
        w[6].getButton().setIcon(gFrog);

        
>>>>>>> parent of 7c45e39... Action Listener
>>>>>>> parent of a820f57... Reverted files
        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(750, 750);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
    }
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> parent of a820f57... Reverted files

    public void actionPerformed(ActionEvent e)
    {

    }

<<<<<<< HEAD
=======
=======
>>>>>>> parent of 7c45e39... Action Listener
>>>>>>> parent of a820f57... Reverted files
}