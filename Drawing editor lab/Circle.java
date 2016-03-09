import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.*;

public class Circle extends Shape
{
   
    public Circle(Point2D.Double center, double radius, Color color)
    {
      super(center, radius, color); 
    }

     public boolean isInside(Point2D.Double point)
    {
        return true;
    }
    
    public void draw(Graphics2D g2,boolean filled)
    {
       g2.fillOval((int)getCenter().getX(),(int)getCenter().getY(),(int)getRadius(),(int)getRadius());
       g2.drawOval((int)getCenter().getX(),(int)getCenter().getY(),(int)getRadius(),(int)getRadius());
    }
}
