package Backend;


import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;



public class Circle extends AlphaShape{


public Circle(){
    super();
     properties.put("Radius", 0.0);
 
}
   
    @Override
    public void draw(Graphics canvas) {
    int radius = properties.get("Radius").intValue();
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
        }
        canvas.setColor(color);
        canvas.drawOval(position.x - radius, position.y - radius, radius * 2, radius * 2);
    }    

    @Override
    public void resize(double x, double y) {
       Map<String, Double> properties = new HashMap<>();
       properties.put("Radius", x);
       setProperties(properties);
    }
}
    
