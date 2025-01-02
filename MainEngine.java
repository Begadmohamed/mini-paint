
package Backend;

import Frontend.MainWindow;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class MainEngine implements DrawingEngine {
   private ArrayList<Shape>shapes;
   private Map<String, Integer> shapeCounts;
   private MainWindow main;
    public MainEngine(MainWindow mainWindow){
        shapes=new ArrayList<>();
        shapeCounts=new HashMap<>();
        this.main=mainWindow;
    }
    @Override
    public void addShape(Shape shape) {
        shapes.add(shape);
        String shapeType = shape.getClass().getSimpleName();
        int count = shapeCounts.getOrDefault(shapeType, 0) + 1;
        shapeCounts.put(shapeType, count);
        String name=shapeType+"0"+count;
        shape.setName(name);
        main.addToComboBox(name);
    }

    @Override
    public void removeShape(Shape shape) {
        shapes.remove(shape);
        main.removeFromComboBox(shape.getName());
    }

    @Override
    public ArrayList<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void refresh(Graphics canvas) {
        for (Shape shape : shapes) {
            shape.draw(canvas);  
        }
    }

    @Override
    public boolean LoadFromFile(String fileName) { // load from file
        boolean success=true;
     try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
         String line;
         Graphics g=main.getBoard().getGraphics();
         while((line=reader.readLine())!=null)
         {
             String[] parts=line.split(","); //tokenize
         try{
             switch (parts.length) {
                 case 10: //case circle or square
                     {
                         String shapeType=parts[0];
                         if (!shapeType.equals("Circle") && !shapeType.equals("Square")) {
                            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
                        }
                         int red = Integer.parseInt(parts[4]);
                         int green = Integer.parseInt(parts[5]);
                         int blue = Integer.parseInt(parts[6]);
                         int red1 = Integer.parseInt(parts[7]);
                         int green1 = Integer.parseInt(parts[8]);
                         int blue1 = Integer.parseInt(parts[9]);
                         if(shapeType.equals("Circle"))
                         {
                             int x=Integer.parseInt(parts[1]);
                             int y=Integer.parseInt(parts[2]);
                             double radius=Double.parseDouble(parts[3]);
                             Color border = new Color(red, green, blue);
                             Color fill = new Color(red1, green1, blue1);
                             Circle circle=new Circle();
                             circle.setPosition(new Point(x,y));
                             Map<String, Double> properties = new HashMap<>();
                             properties.put("Radius", radius);
                             circle.setProperties(properties);
                             circle.setColor(border);
                             circle.setFillColor(fill);
                             addShape(circle);
                             refresh(g);
                         }
                         else if(shapeType.equals("Square"))
                         {
                             int x=Integer.parseInt(parts[1]);
                             int y=Integer.parseInt(parts[2]);
                             double side= Double.parseDouble(parts[3]);
                             Color border = new Color(red, green, blue);
                             Color fill = new Color(red1, green1, blue1);
                             Square square=new Square();
                             square.setPosition(new Point(x,y));
                             Map<String, Double> properties = new HashMap<>();
                             properties.put("Side",side);
                             square.setProperties(properties);
                             square.setColor(border);
                             square.setFillColor(fill);
                             addShape(square);
                             refresh(g);
                         }           break;
                     }
                 case 11://case rectangle
                     {  
                         String shapeType=parts[0];
                         if (!shapeType.equals("Rectangle")) {
                            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
                        }
                         int x=Integer.parseInt(parts[1]);
                         int y=Integer.parseInt(parts[2]);
                         double width=Double.parseDouble(parts[3]);
                         double height=Double.parseDouble(parts[4]);
                         int red = Integer.parseInt(parts[5]);
                         int green = Integer.parseInt(parts[6]);
                         int blue = Integer.parseInt(parts[7]);
                         int red1 = Integer.parseInt(parts[8]);
                         int green1 = Integer.parseInt(parts[9]);
                         int blue1 = Integer.parseInt(parts[10]);
                         Color border=new Color(red, green, blue);
                         Color fill = new Color(red1, green1, blue1);
                         Rectangle rectangle=new Rectangle();
                         rectangle.setPosition(new Point(x,y));
                         Map<String, Double> properties = new HashMap<>();
                         properties.put("Width",  width);
                         properties.put("Height", height);
                         rectangle.setProperties(properties);
                         rectangle.setColor(border);
                         rectangle.setFillColor(fill);
                         addShape(rectangle);
                         refresh(g);
                         break;
                     }
                 case 8: //case linesegment
                     {
                         String shapeType=parts[0];
                         if (!shapeType.equals("LineSegment")) {
                            throw new IllegalArgumentException("Invalid shape type: " + shapeType);
                        }
                         int x1=Integer.parseInt(parts[1]);
                         int y1=Integer.parseInt(parts[2]);
                         double x2=Double.parseDouble(parts[3]);
                         double y2=Double.parseDouble(parts[4]);
                         int red = Integer.parseInt(parts[5]);
                         int green = Integer.parseInt(parts[6]);
                         int blue = Integer.parseInt(parts[7]);
                         Color border=new Color(red, green, blue);
                         LineSegment lineSegment=new LineSegment();
                         lineSegment.setPosition(new Point(x1,y1));
                         Map<String, Double> properties = new HashMap<>();
                         properties.put("EndX",  x2);
                         properties.put("EndY",  y2);
                         lineSegment.setProperties(properties);
                         lineSegment.setColor(border);
                         addShape(lineSegment);
                         refresh(g);
                         break;
                     }
                 default:
                     throw new IllegalArgumentException("Invalid line format: " + line);
             }
            }catch(Exception e){
                    success=false;
                    e.printStackTrace();
                    }
}
     }catch (IOException e) {
            success=false;
            e.printStackTrace();
    }
     return success;
   }
   
    @Override
    public boolean SaveToFile(String fileName) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, false))){
          for(int i=0;i<shapes.size();i++)
          {  //properties for all shapes
              Shape selectedShape=shapes.get(i); 
             String name=selectedShape.getClass().getSimpleName(); //name
             int x=selectedShape.getPosition().x; //x coordinate
             int y=selectedShape.getPosition().y; //y coordinate
             Color border=selectedShape.getColor(); //border color
             String line="";
              switch (name) {
                  case "Square":
                      {
                          double side=selectedShape.getProperties().get("Side"); //side
                          Color fill=selectedShape.getFillColor(); //fill color
                          if (fill == null) {  //if fill color not choosen
                              JOptionPane.showMessageDialog(null,
                                      "The fill color for the square is not set. Please set it before saving.",
                                      "Missing Fill Color",
                                      JOptionPane.WARNING_MESSAGE);
                              return false;
                          }         line = String.format("Square,%d,%d,%f,%d,%d,%d,%d,%d,%d",
                                  x, y, side,
                                  border.getRed(), border.getGreen(), border.getBlue(),
                                  fill.getRed(), fill.getGreen(), fill.getBlue());
                          break;
                      }
                  case "Rectangle":
                      {
                          double width=selectedShape.getProperties().get("Width"); //width
                          double height=selectedShape.getProperties().get("Height"); //height
                          Color fill=selectedShape.getFillColor(); //fill color
                          if (fill == null) {
                              JOptionPane.showMessageDialog(null,
                                      "The fill color for the rectangle is not set. Please set it before saving.",
                                      "Missing Fill Color",
                                      JOptionPane.WARNING_MESSAGE);
                              return false;
                          }         line = String.format("Rectangle,%d,%d,%f,%f,%d,%d,%d,%d,%d,%d",
                                  x, y, width, height,
                                  border.getRed(), border.getGreen(), border.getBlue(),
                                  fill.getRed(), fill.getGreen(), fill.getBlue());
                          break;
                      }
                  case "Circle":
                      {
                          double radius=selectedShape.getProperties().get("Radius"); //radius
                          Color fill=selectedShape.getFillColor(); //fill color
                          if (fill == null) {
                              JOptionPane.showMessageDialog(null,
                                      "The fill color for the circle is not set. Please set it before saving.",
                                      "Missing Fill Color",
                                      JOptionPane.WARNING_MESSAGE);
                              return false;
                          }         line = String.format("Circle,%d,%d,%f,%d,%d,%d,%d,%d,%d",
                                  x, y, radius,
                                  border.getRed(), border.getGreen(), border.getBlue(),
                                  fill.getRed(), fill.getGreen(), fill.getBlue());
                          break;
                      }
                  default:
                      double endX=selectedShape.getProperties().get("EndX"); //endx
                      double endY=selectedShape.getProperties().get("EndY"); //endy
                      line = String.format("LineSegment,%d,%d,%f,%f,%d,%d,%d",
                              x, y, endX, endY,
                              border.getRed(), border.getGreen(), border.getBlue());
                      break;
              }
              writer.write(line);
              writer.newLine();
          }
         
      }catch (IOException e) {
        e.printStackTrace();
    }
      return true;
    }
    public void ClearCounters() //clear counter for each shape in loading
    {
        shapeCounts.clear();
    }
  }
    
