
package Backend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;


abstract public class AlphaShape implements Shape{
    protected Point position;
    protected Map<String, Double> properties;
    protected Color color;
    protected Color fillColor;
    protected String name;
public AlphaShape()
{
    properties = new HashMap<>();
    color=Color.BLACK;
}
    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPosition() {
        return position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public Color getFillColor() {
        return fillColor;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
    @Override
    public abstract void draw(Graphics canvas);
    
    @Override
     public void move(Point position){
        setPosition(position);
     }
     
     @Override
     public abstract void resize(double x, double y);
     
}
