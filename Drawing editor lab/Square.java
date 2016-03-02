import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Point2D;
import java.awt.Color;

public class Square extends Shape
{
  
    public Square(Point2D.Double center, double radius, Color color)
    {
        super( center,  radius,  color);
    }

    public  boolean isInside(Point2D.Double point)
    {
        return true;
    }
    public  void draw(Graphics2D g2,boolean filled)
    {
        
    }
}
