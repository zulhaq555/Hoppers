/**This is the game interface (board) 
 * swing allows for objects to be implemented
 * swing.JOptionPane allows for message boxes to be displayed
 * awt.* allows for a layout to be set
 * awt.event.* allows for an ActionListener to be used
*/
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
    private int midpoint;

    /**Board class will be used to create the interface for the game */

    public Board()
    {

        panel.setLayout(layout);

        /**This for loop creates 25 instances of Square class
         * if i is equal to the coordinates provided, place the specified frog piece there
         * else the piece will be a blank button i.e. lillypad or water
         * then adds button to panel
         * then implements an action listener
         */
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

        /**The display settings of the game interface
         * Title bar will say "HOPPERS!", size of interface will be 750 by 750
         * Program/game will stop running when close button is clicked
         * Makes the game interface visible to the user
         */

        gameBoard.setContentPane(panel);
        gameBoard.setTitle("HOPPERS!");
        gameBoard.setSize(750, 750);
        gameBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameBoard.setVisible(true);
        
    }

    /**This method is implemented when a button is clicked, allows for piece movement
     * For loop usd to determine a buttons coordinates "i"
     * if  button[i] is a frog and is clicked then display the selected frog icon, also record button location and store button as selected button
     * else if button[i] is lillypad then record this location2 separately
     * calculate midpoint from location1 and location2
     * if button[midpoint] is a frog, then implement noFrog() method
     * else invalid move
     * if only red frog remains, you win
     * else you lose
     */
    public void actionPerformed(ActionEvent e)
    {
        //Create 2 counts 1 for green frogs, 1 for red frogs
        int rCount = 0;
        int gCount = 0;

        for (int i = 0; i < 25; i++){

            if(e.getSource() == button[i].getButton() && "GFrog".equals(button[i].getBtnTyp())){

                location = i;
                button[i].getButton().setIcon(gFrog2);
                selectButton = button[i];

            }else if (e.getSource() == button[i].getButton() && "RFrog".equals(button[i].getBtnTyp())){

                location = i;
                button[i].getButton().setIcon(rFrog2);
                selectButton = button[i];

            }else if (e.getSource() == button[i].getButton() && "Lilypad".equals(button[i].getBtnTyp())){

                location2 = i;
                selectButton2 = button[i];
                midpoint = ((location + location2)/2);

                if ("GFrog".equals(button[midpoint].getBtnTyp()) || "RFrog".equals(button[midpoint].getBtnTyp())){

                    button[midpoint].noFrog();
                    selectButton.moveTo(selectButton2);

                }else{

                    Board.msgBox("INVALID MOVE!!!", "WARNING!!!");

                }
            }

            //counts the number of each type of frogs left after each turn
            if ("RFrog".equals(button[i].getBtnTyp())){
                rCount++;
            }else if ("GFrog".equals(button[i].getBtnTyp())){
                gCount++;
            }
        }

        if (gCount == 0 && rCount == 1){

            //displays message box
            Board.msgBox("YOU WIN!!!", "CONGRATULATIONS!!!");

        }else if (rCount == 0){

            Board.msgBox("YOU LOSE!!!", "LOSER!!!");
            
        }
    }

    //Produces a message box when called
    public static void msgBox(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
}