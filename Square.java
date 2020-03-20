/**square buttons and lilly pads */
import javax.swing.*;


public class Square 
{
    
    JButton button = new JButton();
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");


    private int location;
    private String piece;
    private String piece2;

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
                piece = "Lilypad";
            }else{
                button.setIcon(water);      
                piece = "Water";
            }   

        }
    }

    public void moveTo(Square sbutton){

        if ("GFrog".equals(piece)){

            button.setIcon(lilypad);
            sbutton.getButton().setIcon(gFrog);
            piece = "Lilypad";
            sbutton.piece = "GFrog";

        }else if ("RFrog".equals(piece)){

            button.setIcon(lilypad);
            sbutton.getButton().setIcon(rFrog);
            piece = "Lilypad";
            sbutton.piece = "RFrog";

        }

    }

    public void noFrog(){

        button.setIcon(lilypad);
        piece = "Lilypad";

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