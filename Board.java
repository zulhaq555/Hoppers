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

    private int location;
    private int location2;

    public Board()
    {

        panel.setLayout(layout);

        for (int i = 0; i < 25; i++){

            if (i == 6 || i == 8 || i == 12 || i == 20 || i == 24){
                button[i] = new Square(i, "GFrog");
            }else if (i == 22){
                button[i] = new Square(i, "RFrog");
            }else{
                button[i] = new Square(i, "");
            }
            
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
        /**get location, get piece, if button[location].piece = "GFrog" then button[location].setIcon[Greenfrog] */
    }
}