import javax.swing.*;


public class Square 
{
    
    JButton button = new JButton();
    //icons for the buttons
    private ImageIcon water = new ImageIcon("images/Water.png");
    private ImageIcon lilypad = new ImageIcon("images/LilyPad.png");
    private ImageIcon rFrog = new ImageIcon("images/RedFrog.png");
    private ImageIcon gFrog = new ImageIcon("images/GreenFrog.png");


    private int location;
    private String buttonType;

    /**A Square class which creates/represents a button with 2 parameters i(coordinate), type(type of button)
     * records location and button type so they can be returned via a retriever method
     * set icon as the button type e.g. RFrog = red frog icon
     * detect whether i is odd or even, even = lillypad, odd = water icon
     */
    public Square(int i, String type)
    {
        
        location = i;
        buttonType = type;
        
        if (buttonType == "RFrog"){

            button.setIcon(rFrog);

        }else if (buttonType == "GFrog"){

            button.setIcon(gFrog);

        }else{

            if (i % 2 == 0){
                button.setIcon(lilypad);
                buttonType = "Lilypad";
            }else{
                button.setIcon(water);      
                buttonType = "Water";
            }   

        }
    }


    /**moveTo method allows for pieces to be moved provided the conditions set in the Board class are met
     * sbutton is a Square that has been passed as a parameter
     * changes the frog button icon and type to lillypad, and lillypad button to frog
     */
    public void moveTo(Square sbutton){

        if ("GFrog".equals(buttonType)){

            button.setIcon(lilypad);
            sbutton.getButton().setIcon(gFrog);
            buttonType = "Lilypad";
            sbutton.buttonType = "GFrog";

        }else if ("RFrog".equals(buttonType)){

            button.setIcon(lilypad);
            sbutton.getButton().setIcon(rFrog);
            buttonType = "Lilypad";
            sbutton.buttonType = "RFrog";

        }

    }

    public void noFrog(){

        //Changes icon and type for the button
        button.setIcon(lilypad);
        buttonType = "Lilypad";

    }

    public JButton getButton(){
        return button;
    }

    public int getLocation(){
        return location;
    }

    public String getBtnTyp(){
        return buttonType;
    }
    
}