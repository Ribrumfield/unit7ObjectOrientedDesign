import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HIEGHT = 60;

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private TriangleComponent scean;

    class MousePressListener implements MouseListener
    {
       public void mousePressed( MouseEvent event )
       {
           int x = event.getX();
           int y = event.getY();

           //needs to draw point
           //_______
       }

       // Do-nothing methods
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
    }
    
    public TriangleFrame()
    {
        scean = new TriangleComponent();
        add(scean);
        
        MouseListener listener = new MousePressListener();
        scean.addMouseListener(listener);
        
        setSize(FRAME_WIDTH, FRAME_HIEGHT);
    }
}
