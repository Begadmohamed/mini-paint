package Backend;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class LineSegment extends AlphaShape {
    
    public LineSegment() {
        super();
        properties.put("EndX", 0.0);
        properties.put("EndY", 0.0);
    }

    @Override
    public void draw(Graphics canvas) {
        int endX = properties.get("EndX").intValue();
        int endY = properties.get("EndY").intValue();
        canvas.setColor(color);
        canvas.drawLine(position.x, position.y, endX, endY);
    }

    @Override
    public void setFillColor(Color color) {
    }

    @Override
    public Color getFillColor() {
     return null;
    }
    @Override
    public void move(Point position)
    {
            int dx = position.x - this.getPosition().x;
            int dy = position.y - this.getPosition().y;
            setPosition(position);
            Map<String, Double> properties = new HashMap<>();
            properties.put("EndX", this.getProperties().get("EndX")+(double) dx);
            properties.put("EndY",this.getProperties().get("EndY")+(double) dy);
            setProperties(properties);
        
    }

    @Override
    public void resize(double x, double y) {
        Map<String, Double> properties = new HashMap<>();
            properties.put("EndX", x);
            properties.put("EndY", y);
            setProperties(properties);
    }
}
