/**square buttons and lilly pads */
import javax.swing.*;
import java.awt.*;


public class Square 
{
    
    JButton button = new JButton();
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");


    private int location;
    private String piece;

    public Square(int i, String type)
    {
        
        location = i;
        piece = type;
        
        if (piece == "RFrog"){

            button.setIcon(rFrog);

        }else if (piece == "GFrog"){

            button.setIcon(gFrog);

        }else{

            if (i % 2 == 0){
                button.setIcon(lilypad);
            }else{
                button.setIcon(water);      
            }   

        }
    }

    public void moveTo(int location2){

        if (piece == "GFrog"){

            button.setIcon(gFrog2);

        }else if (piece == "RFrog"){

            button.setIcon(rFrog2);

        }else{

        }

    }

    public JButton getButton(){
        return button;
    }

    public int getLocation(){
        return location;
    }

    public String getPiece(){
        return piece;
    }
    
}