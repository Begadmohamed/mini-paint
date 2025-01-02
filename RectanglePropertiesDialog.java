
package Frontend;

import Backend.MainEngine;
import Backend.Rectangle;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class RectanglePropertiesDialog extends javax.swing.JDialog {
   private Rectangle rectangle; 
   private MainEngine engine;
   private MainWindow main;
    public RectanglePropertiesDialog(MainWindow mainWindow,MainEngine drawingEngine) {
        super((java.awt.Frame)null, true);
        initComponents();
        this.main=mainWindow;
        this.engine=drawingEngine;
        rectangle=new Rectangle();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        XpositionField = new javax.swing.JTextField();
        YPositionField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        WidthField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        HeightField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        DrawButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Rectangle Properties");

        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("X Position:");

        XpositionField.setForeground(new java.awt.Color(204, 0, 255));
        XpositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        XpositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XpositionFieldActionPerformed(evt);
            }
        });

        YPositionField.setForeground(new java.awt.Color(204, 0, 255));
        YPositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        YPositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YPositionFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Y Position:");

        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Width:");

        WidthField.setForeground(new java.awt.Color(204, 0, 255));
        WidthField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        WidthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthFieldActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("Height:");

        HeightField.setForeground(new java.awt.Color(204, 0, 255));
        HeightField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        HeightField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightFieldActionPerformed(evt);
            }
        });

        CancelButton.setForeground(new java.awt.Color(153, 0, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        DrawButton.setForeground(new java.awt.Color(153, 0, 255));
        DrawButton.setText("Draw");
        DrawButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(43, 43, 43))
                    .addComponent(WidthField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(YPositionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(XpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(HeightField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YPositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WidthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeightField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XpositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XpositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XpositionFieldActionPerformed

    private void YPositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YPositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YPositionFieldActionPerformed

    private void WidthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WidthFieldActionPerformed

    private void HeightFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HeightFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
     dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
     int bWidth = main.getBoardWidth();
        int bHeight = main.getBoardHeight();
        try {
            if (XpositionField.getText().isEmpty() || YPositionField.getText().isEmpty() || WidthField.getText().isEmpty() || HeightField.getText().isEmpty()) {
                throw new IllegalArgumentException("Some Fields are Empty !!");
            }
            int x = Integer.parseInt(XpositionField.getText());
            int y = Integer.parseInt(YPositionField.getText());
            int width = Integer.parseInt(WidthField.getText());
            int height = Integer.parseInt(HeightField.getText());

            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Width and Height must be positive numbers.");
            }
            if (x < 0 || x + width > bWidth || y < 0 || y + height > bHeight) {
                throw new IllegalArgumentException("Rectangle is out of bounds.");
            }

            rectangle.setPosition(new Point(x, y));
            Map<String, Double> properties = new HashMap<>();
            properties.put("Width", (double) width);
            properties.put("Height", (double) height);
            rectangle.setProperties(properties);
            engine.addShape(rectangle);
            Graphics g=main.getBoard().getGraphics();
            engine.refresh(g);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for position, width, and height.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DrawButtonActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DrawButton;
    private javax.swing.JTextField HeightField;
    private javax.swing.JTextField WidthField;
    private javax.swing.JTextField XpositionField;
    private javax.swing.JTextField YPositionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
