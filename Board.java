import javax.swing.*;

/**This is the game interface (board) */

public class Board
{
    public Board()
    {
        JFrame a = new JFrame();
        JPanel panel = new JPanel();
        a.setContentPane(panel);
        a.setVisible(true);
        a.setTitle("Hoppers!");
        a.setSize(1000,1000);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
}