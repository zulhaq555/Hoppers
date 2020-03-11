/**square buttons and lilly pads */
import javax.swing.*;
import java.awt.*;


public class Square 
{
    
    JButton button = new JButton();
    int location;
    String piece;
    ImageIcon water = new ImageIcon("images/Water.png");
    ImageIcon lilypad = new ImageIcon("images/LilyPad.png");
    ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");

    public Square(int i, String type)
    {
        
        location = i;
        piece = type;

        if (piece == "Gfrog"){

            button.setIcon(gFrog);

        }else if (piece == "Rfrog"){

            button.setIcon(rFrog);

        }else{

            if (i % 2 == 0){
                button.setIcon(lilypad);
            }else{                     
                button.setIcon(water);
            }    
        }
        

    }

    public void moveTo()
    {
        
    }

    public String getPieces(){
        return piece;
    }

    public int getLocation(){
        return location;
    }

    public JButton getButton(){
        return button;
    }
    
}