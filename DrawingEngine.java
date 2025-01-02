
package Backend;

import java.util.ArrayList;

public interface DrawingEngine {
    //manage shape objects
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    //return the created shapes objects
    public ArrayList<Shape> getShapes();
    //redraw all shapes on canvas
    public void refresh(java.awt.Graphics canvas);
    //load and save from/to file
    public boolean LoadFromFile(String fileName);
    public boolean SaveToFile(String fileName);
}
