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
    private String piece;

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

        for (int c = 0; c < 25; c++){
            location = button[c].getLocation();
            piece = button[c].getPiece();

            if(e.getSource() == button[location].getButton() && (button[location].getPiece() == "GFrog" || button[location].getPiece() == "RFrog")){

                button[location].moveTo(location, location2);
                System.out.println("kl");

            }else if (e.getSource() == button[location].getButton() && (button[location].getPiece() == "Lilypad" || button[location].getPiece() == "Water")){

                location2 = location;
                button[location].moveTo(location, location2);

            }
        }

        

    }
}