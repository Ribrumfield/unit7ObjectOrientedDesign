import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;

public class TriangleFrame
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HIEGHT = 60;
    
    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    
    public TraingleFrame () 
    {
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.frame.add(this.panel);
        
        this.frame.setSize( FRAME_WIDTH, FRAME_HIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main (Stiring [] args)
    {
        TraiagleFrame frame = new TriangleFrame();
    }
    
}
