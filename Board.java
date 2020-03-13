/**This is the game interface (board) */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board implements ActionListener
{
    
    private JFrame gameBoard = new JFrame();
    private JPanel panel = new JPanel();
    private Square selectButton;
    private Square selectButton2;
    private Square[] button = new Square[25];
    private GridLayout layout = new GridLayout(5, 5);
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");



    private int location;
    private int location2;
    private String piece;
    private int midpoint;

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
            piece = button[c].getPiece();

            if(e.getSource() == button[c].getButton() && "GFrog".equals(button[c].getPiece())){

                location = c;
                button[c].getButton().setIcon(gFrog2);
                selectButton = button[c];
                System.out.println("kl");

            }else if (e.getSource() == button[c].getButton() && "RFrog".equals(button[c].getPiece())){

                location = c;
                button[c].getButton().setIcon(rFrog2);
                selectButton = button[c];

            }else if (e.getSource() == button[c].getButton() && "Lilypad".equals(button[c].getPiece())){

                location2 = c;
                selectButton2 = button[c];
                midpoint = ((location + location2)/2);

                if ("GFrog".equals(button[midpoint].getPiece()) || "RFrog".equals(button[midpoint].getPiece())){

                    button[midpoint].noFrog();
                    selectButton.moveTo(selectButton2);

                }else{
                    System.out.println("NOPE");
                }

            }

        

        }

        

    }
}