import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.geom.Point2D;
import java.awt.Color;

public abstract class Shape
{
    private Point2D.Double center;
    private double radius;
    private Color color;
    
    public Shape(Point2D.Double center, double radius, Color color)
    {
       this.center = center;
       this.radius = radius;
       this.color = color;
       
    }
    
    public Color getColor()
    {
        return color;
    }
    
    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        
    }
    
    public void setRadius(double r)
    {
        radius = 400.0;
    }
    
    public abstract boolean isInside(Point2D.Double point);
    public abstract  void draw(Graphics2D g2,boolean filled);
}
