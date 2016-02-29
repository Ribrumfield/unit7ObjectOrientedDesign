import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public  class DrawingPanel extends JPanel //implements MouseListener, MouseMotionListener, KeyListener
{
    private Shape shape;
    private Color CurrentColor;
    
    public DrawingPanel()
    {
        
    }

    public Color getColor()
    {
       return CurrentColor; 
    }

    public Dimension getPrefferedSize()
    {
        return new Dimension(600, 600);
    }

    public void addCircle()
    {
        
    }

    public void addSquare()
    {
        
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }
    
    class MousePressListener implements MouseListener
    {
        public void mouseReleased(MouseEvent event) {}
        public void mouseClicked(MouseEvent event) {}
        public void mouseEntered(MouseEvent event) {}
        public void mouseExited(MouseEvent event) {}
        public void mousePressed(MouseEvent event) {}
    }
    
}
