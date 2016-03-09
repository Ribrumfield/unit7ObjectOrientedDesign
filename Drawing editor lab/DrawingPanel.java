import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.ArrayList;
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Point2D;

public  class DrawingPanel extends JPanel
{
    private Shape CurrentShape;
    private Color CurrentColor;
    private ArrayList<Shape> shapes;
    private boolean SelectedShape;

    public DrawingPanel()
    {
        setBackground(Color.WHITE);
        CurrentColor = Color.WHITE;
    }

    public Color getColor()
    {
        return CurrentColor; 
    }

    public Dimension getPreferedSize()
    {
        return new Dimension(600, 600);
    }

    public void pickColor()
    {
        CurrentColor = JColorChooser.showDialog(this,"Pick a Color" , Color.white);
    }

    public void addCircle()
    {
        Point2D.Double  point = new Point2D.Double(300,300);
        Circle c = new Circle(point, 20, CurrentColor);
        shapes.add(c);
        this.repaint();
    }

    public void addSquare()
    {

    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        for (int i = 0 ; i < shapes.size(); i++)
        {
            shapes.get(i).draw((Graphics2D)g, true);
        }
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
