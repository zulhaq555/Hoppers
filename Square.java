/**square buttons and lilly pads */
import javax.swing.*;
import java.awt.*;


public class Square 
{
    
    int c = 0;
    JButton w = new JButton();
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon rFrog2 = new ImageIcon("images/RedFrog2.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");
    private ImageIcon gFrog2 = new ImageIcon("images/GreenFrog2.png");

    public Square(int i, int loc, String type)
    {
        
        if (i % 2 == 0){

            w.setIcon(lilypad);

        }else{

            w.setIcon(water);
            
        }   
    }

    public JButton getButton(){
        return w;
    }
    
}