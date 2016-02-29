import javax.swing.JPanel;
import javax.swing.JFrame;

public class DrawingEditor extends JFrame
{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HIGHT = 600;
    
    
    private ControlPanel controls;
    private DrawingPanel canvas;
    
    public DrawingEditor()
    {
        setTitle( " Drawing Editor");
        this.canvas = new DrawingPanel();
        this.controls = new ControlPanel(canvas);
        
        this.getContentPane().add(this.controls);
        this.pack();
        
        this.setSize( FRAME_WIDTH, FRAME_HIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main (String [] args)
    {
        DrawingEditor editor = new DrawingEditor();
    }
}