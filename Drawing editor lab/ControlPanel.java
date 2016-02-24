import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class ControlPanel extends JPanel
{
    private JButton circlebutton;
    private JButton squarebutton;
    private JButton colorbutton;
    private DrawingPanel canvas;
    
    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;
        
        JPanel panel = new JPanel();
        circlebutton = new JButton("Add Circle");
        squarebutton = new JButton("Add Square");
        colorbutton = new JButton ("Pick Color");
        
        panel.add(colorbutton);
        panel.add(circlebutton);
        panel.add(squarebutton);
        
        this.setLayout(new BorderLayout());
        this.add(canvas,BorderLayout.CENTER);
        this.add(panel,BorderLayout.SOUTH);  
    }
}