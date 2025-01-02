
package Backend;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

public interface Shape {
    //set position
    public void setPosition(Point position);
    public Point getPosition();
    //update properties
    public void setProperties(Map<String,Double>properties);
    public Map<String,Double> getProperties();
    //colorize
    public void setColor(Color color);
    public Color getColor();
    public void setFillColor(Color color);
    public Color getFillColor();
    //draw shape on canvas
    public void draw(java.awt.Graphics canvas);
    //get and set names
    public void setName(String name);
    public String getName();
    //move and resize
    public void move(Point position);
    public void resize(double x,double y);
    
  

    
    
}
