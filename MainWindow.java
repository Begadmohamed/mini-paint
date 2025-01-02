
package Frontend;

import Backend.MainEngine;
import Backend.Shape;
import java.awt.Color;
import java.awt.Graphics;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MainWindow extends javax.swing.JFrame {
private MainEngine engine;
   
  
  
    public MainWindow() {
        initComponents();
        engine=new MainEngine(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                engine.refresh(g);
            }
        };
        RectangleButton = new javax.swing.JButton();
        CircleButton = new javax.swing.JButton();
        LineSegmentButton = new javax.swing.JButton();
        SquareButton = new javax.swing.JButton();
        ChooseShape = new javax.swing.JComboBox<>();
        SelectShapeText = new javax.swing.JLabel();
        ColorizeButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        SelectShapeText1 = new javax.swing.JLabel();
        SelectShapeText2 = new javax.swing.JLabel();
        MoveButton = new javax.swing.JButton();
        ResizeButton = new javax.swing.JButton();
        SaveButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drawing Application");
        setResizable(false);

        Board.setBackground(new java.awt.Color(255, 255, 255));
        Board.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        RectangleButton.setBackground(new java.awt.Color(153, 51, 255));
        RectangleButton.setForeground(new java.awt.Color(255, 255, 255));
        RectangleButton.setText("Rectangle");
        RectangleButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        RectangleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RectangleButtonActionPerformed(evt);
            }
        });

        CircleButton.setBackground(new java.awt.Color(153, 51, 255));
        CircleButton.setForeground(new java.awt.Color(255, 255, 255));
        CircleButton.setText("Circle");
        CircleButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        CircleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CircleButtonActionPerformed(evt);
            }
        });

        LineSegmentButton.setBackground(new java.awt.Color(153, 51, 255));
        LineSegmentButton.setForeground(new java.awt.Color(255, 255, 255));
        LineSegmentButton.setText("LineSegment");
        LineSegmentButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        LineSegmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LineSegmentButtonActionPerformed(evt);
            }
        });

        SquareButton.setBackground(new java.awt.Color(153, 51, 255));
        SquareButton.setForeground(new java.awt.Color(255, 255, 255));
        SquareButton.setText("Square");
        SquareButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        SquareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SquareButtonActionPerformed(evt);
            }
        });

        ChooseShape.setBackground(new java.awt.Color(153, 51, 255));
        ChooseShape.setForeground(new java.awt.Color(255, 255, 255));
        ChooseShape.setMaximumRowCount(30);
        ChooseShape.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Shape" }));
        ChooseShape.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        ChooseShape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseShapeActionPerformed(evt);
            }
        });

        SelectShapeText.setForeground(new java.awt.Color(153, 51, 255));
        SelectShapeText.setText("Select Shape");

        ColorizeButton.setBackground(new java.awt.Color(153, 51, 255));
        ColorizeButton.setForeground(new java.awt.Color(255, 255, 255));
        ColorizeButton.setText("Colorize");
        ColorizeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        ColorizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorizeButtonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(153, 51, 255));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        SelectShapeText1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SelectShapeText1.setForeground(new java.awt.Color(153, 51, 255));
        SelectShapeText1.setText("Board w=562");

        SelectShapeText2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        SelectShapeText2.setForeground(new java.awt.Color(153, 51, 255));
        SelectShapeText2.setText("Board h=333");

        MoveButton.setBackground(new java.awt.Color(153, 51, 255));
        MoveButton.setForeground(new java.awt.Color(255, 255, 255));
        MoveButton.setText("Move");
        MoveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        MoveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MoveButtonActionPerformed(evt);
            }
        });

        ResizeButton.setBackground(new java.awt.Color(153, 51, 255));
        ResizeButton.setForeground(new java.awt.Color(255, 255, 255));
        ResizeButton.setText("Resize");
        ResizeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        ResizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResizeButtonActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(153, 51, 255));
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setText("Save");
        SaveButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        LoadButton.setBackground(new java.awt.Color(153, 51, 255));
        LoadButton.setForeground(new java.awt.Color(255, 255, 255));
        LoadButton.setText("Load");
        LoadButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 204, 204)));
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ColorizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SelectShapeText)
                                .addComponent(ChooseShape, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MoveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ResizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SelectShapeText2)
                            .addComponent(SelectShapeText1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LoadButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CircleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(LineSegmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(RectangleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(RectangleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SquareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CircleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LineSegmentButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(SaveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addComponent(SelectShapeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ChooseShape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteButton)
                            .addComponent(ColorizeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ResizeButton)
                            .addComponent(MoveButton))
                        .addGap(18, 18, 18)
                        .addComponent(SelectShapeText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SelectShapeText2)
                        .addContainerGap(75, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void ChooseShapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseShapeActionPerformed
    
    }//GEN-LAST:event_ChooseShapeActionPerformed

    private void ColorizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorizeButtonActionPerformed
    String selectedShapeName = (String) ChooseShape.getSelectedItem();
    if (selectedShapeName != null && !selectedShapeName.isEmpty()) {
        Shape selectedShape = getShapeByName(selectedShapeName);
    
    if(selectedShape != null)
    {
        Color borderColor = JColorChooser.showDialog(null, "Select Border Color", Color.BLACK);
    if(borderColor !=null)
        selectedShape.setColor(borderColor);
    
    Color fillColor = JColorChooser.showDialog(null, "Select Fill Color", Color.WHITE);
    if(fillColor !=null)
    {
        selectedShape.setFillColor(fillColor);
    }
    Graphics g=Board.getGraphics();
    engine.refresh(g);
    }
    }
    }//GEN-LAST:event_ColorizeButtonActionPerformed

    private void CircleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CircleButtonActionPerformed
        CirclePropertiesDialog circleProp=new CirclePropertiesDialog(this,engine);
        circleProp.setVisible(true);
    }//GEN-LAST:event_CircleButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
  String selectedShapeName = (String) ChooseShape.getSelectedItem();
    if (selectedShapeName != null && !selectedShapeName.isEmpty()) {
        Shape selectedShape = getShapeByName(selectedShapeName);
        if(selectedShape != null)
        {
            engine.removeShape(selectedShape);
            Board.repaint();
            Graphics g=Board.getGraphics();
            engine.refresh(g);
             
        }
    }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void LineSegmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LineSegmentButtonActionPerformed
       LineSegmentPropertiesDialog LineProp=new LineSegmentPropertiesDialog(this,engine);
       LineProp.setVisible(true);
    }//GEN-LAST:event_LineSegmentButtonActionPerformed

    private void RectangleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RectangleButtonActionPerformed
     RectanglePropertiesDialog RectProp=new RectanglePropertiesDialog(this,engine);
     RectProp.setVisible(true);
    }//GEN-LAST:event_RectangleButtonActionPerformed

    private void SquareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SquareButtonActionPerformed
        SquarePropertiesDialog SquareProp=new SquarePropertiesDialog(this,engine);
        SquareProp.setVisible(true);
    }//GEN-LAST:event_SquareButtonActionPerformed

    private void MoveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MoveButtonActionPerformed
       String selectedShapeName = (String) ChooseShape.getSelectedItem();
        if (selectedShapeName != null && !selectedShapeName.isEmpty()) {
        Shape selectedShape = getShapeByName(selectedShapeName);
        if(selectedShape!=null)
        {
          MoveDialog move=new MoveDialog(this,selectedShape,engine);
          move.setVisible(true);
        }
      }
    }//GEN-LAST:event_MoveButtonActionPerformed

    private void ResizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResizeButtonActionPerformed
         String selectedShapeName = (String) ChooseShape.getSelectedItem();
        if (selectedShapeName != null && !selectedShapeName.isEmpty()) {
        Shape selectedShape = getShapeByName(selectedShapeName);
        if(selectedShape!=null)
        {
         if(selectedShape.getClass().getSimpleName().equals("Square")||selectedShape.getClass().getSimpleName().equals("Circle"))
         {
            SquareAndCircleResize resize=new SquareAndCircleResize(this,selectedShape,engine);
            resize.setVisible(true);
         }
         else{
             RecAndLineResize resize=new RecAndLineResize(this,selectedShape,engine);
             resize.setVisible(true);
         }
        }
      }
    }//GEN-LAST:event_ResizeButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
      JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Save Shapes");
    
    
    int userSelection = fileChooser.showSaveDialog(null);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToSave = fileChooser.getSelectedFile();
        String fileName = fileToSave.getAbsolutePath();
        
        
        if (!fileName.endsWith(".txt")) {
            fileName += ".txt";
        }
        
        
        if (engine.SaveToFile(fileName)) {
            JOptionPane.showMessageDialog(null, "Shapes saved successfully!", "Save Successful", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to save shapes.", "Save Failed", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
    while(!engine.getShapes().isEmpty())
    engine.removeShape(engine.getShapes().get(0));
    engine.ClearCounters();
    Board.repaint();
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Load Shapes");
    
    int userSelection = fileChooser.showOpenDialog(null);
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        File fileToLoad = fileChooser.getSelectedFile();
        String fileName = fileToLoad.getAbsolutePath();
        
       
            if(engine.LoadFromFile(fileName)){
            JOptionPane.showMessageDialog(null, "Shapes loaded successfully!", "Load Successful", JOptionPane.INFORMATION_MESSAGE);
            } else {
            JOptionPane.showMessageDialog(null, "Failed to load shapes. Please check the file format.", "Load Failed", JOptionPane.ERROR_MESSAGE);
            }
    }
    }//GEN-LAST:event_LoadButtonActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Board;
    private javax.swing.JComboBox<String> ChooseShape;
    private javax.swing.JButton CircleButton;
    private javax.swing.JButton ColorizeButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton LineSegmentButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JButton MoveButton;
    private javax.swing.JButton RectangleButton;
    private javax.swing.JButton ResizeButton;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel SelectShapeText;
    private javax.swing.JLabel SelectShapeText1;
    private javax.swing.JLabel SelectShapeText2;
    private javax.swing.JButton SquareButton;
    // End of variables declaration//GEN-END:variables

    public int getBoardWidth() {//562
     return Board.getWidth();
     
    }
 public int getBoardHeight() {//333
       return Board.getHeight();
   }

    private Shape getShapeByName(String name) {
     ArrayList<Shape>shapes=engine.getShapes();
        for(int i=0;i<shapes.size();i++) {
        if(shapes.get(i).getName().equals(name))
            return shapes.get(i);
       
    }
    return null;  
    }
    

    public void addToComboBox(String name) {
        ChooseShape.addItem(name);
       
    }
   public void removeFromComboBox(String name) {
    ChooseShape.removeItem(name);
}

    public JPanel getBoard() {
       return Board;
    }

   
    }
    

