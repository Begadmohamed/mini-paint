package Backend;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Square extends AlphaShape{
   

    public Square() {
        super();
        properties.put("Side", 0.0); 
    }

    @Override
    public void draw(Graphics canvas) {
        int side = properties.get("Side").intValue();
        if (fillColor != null) {
            canvas.setColor(fillColor);
            canvas.fillRect(position.x, position.y, side, side);
        }
        canvas.setColor(color);
        canvas.drawRect(position.x, position.y, side, side);
    }

    @Override
    public void resize(double x, double y) {
        Map<String, Double> properties = new HashMap<>();
            properties.put("Side", x);
            setProperties(properties);
    }

}
