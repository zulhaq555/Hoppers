/**square buttons and lilly pads */
import javax.swing.*;

public class Square 
{
    
    JPanel getPanel();
    JButton w = new JButton();
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");

    public Square(int i)
    {

        if (i % 2 == 0){

            w = new JButton(water);
            w.setIcon(water);

        }else{
            w = new JButton(lilypad);
            w.setIcon(lilypad);

            
        }
        
        
    }
}