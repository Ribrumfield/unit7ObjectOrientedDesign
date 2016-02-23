import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HIGHT = 600;
    
    private JFrame frame;
    private JPanel panel;
    
    public DrawingEditor()
    {
        this.frame = new JFrame();
        this.panel= new JPanel();
        
        this.frame.add(this.panel);
        
        this.frame.setSize( FRAME_WIDTH, FRAME_HIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main (String [] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
}
