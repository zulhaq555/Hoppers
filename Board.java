/**This is the game interface (board) */
import javax.swing.*;
import javax.swing.JOptionPane;
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

            if (i == 6 || i == 8 || i == 12 || i == 20){
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
        int rCount = 0;
        int gCount = 0;

        for (int i = 0; i < 25; i++){

            if(e.getSource() == button[i].getButton() && "GFrog".equals(button[i].getPiece())){

                location = i;
                button[i].getButton().setIcon(gFrog2);
                selectButton = button[i];

            }else if (e.getSource() == button[i].getButton() && "RFrog".equals(button[i].getPiece())){

                location = i;
                button[i].getButton().setIcon(rFrog2);
                selectButton = button[i];

            }else if (e.getSource() == button[i].getButton() && "Lilypad".equals(button[i].getPiece())){

                location2 = i;
                selectButton2 = button[i];
                midpoint = ((location + location2)/2);

                if ("GFrog".equals(button[midpoint].getPiece()) || "RFrog".equals(button[midpoint].getPiece())){

                    button[midpoint].noFrog();
                    selectButton.moveTo(selectButton2);

                }else{

                    Board.msgBox("INVALID MOVE!!!", "WARNING!!!");

                }
            }

            if ("RFrog".equals(button[i].getPiece())){
                rCount++;
            }else if ("GFrog".equals(button[i].getPiece())){
                gCount++;
            }
        }

        if (gCount == 0 && rCount == 1){

            Board.msgBox("YOU WIN!!!", "CONGRATULATIONS!!!");

        }else if (rCount == 0){

            Board.msgBox("YOU LOSE!!!", "LOSER!!!");
            
        }
    }

    public static void msgBox(String message, String title)
    {

        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);

    }
}