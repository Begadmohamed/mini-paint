package Backend;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;


public class Rectangle extends AlphaShape {
   
    public Rectangle() {
        super();
        properties.put("Width", 0.0);
        properties.put("Height", 0.0);
    }

    @Override
    public void draw(Graphics canvas) {
        int width = properties.get("Width").intValue();
        int height = properties.get("Height").intValue();
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(position.x, position.y, width, height);
        }
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, width, height);
    }
    @Override
    public void resize(double x,double y){
        Map<String, Double> properties = new HashMap<>();
        properties.put("Width", x);
        properties.put("Height", y);
        setProperties(properties);
    }
    
}
