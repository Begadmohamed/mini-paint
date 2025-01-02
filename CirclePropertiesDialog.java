
package Frontend;

import Backend.MainEngine;
import Backend.Circle;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class CirclePropertiesDialog extends javax.swing.JDialog {
 private Circle circle;
 private MainEngine engine;
 private MainWindow main;
  public CirclePropertiesDialog(MainWindow mainWindow,MainEngine drawingEngine) {
    super((java.awt.Frame) null, true);  
    initComponents();
    this.main= mainWindow;
    circle=new Circle();
    this.engine=drawingEngine;
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        XpositionField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        YpositionField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RadiusField = new javax.swing.JTextField();
        DrawButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Circle Properties");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("X position:");

        XpositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        XpositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XpositionFieldActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("Y position:");

        YpositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        YpositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YpositionFieldActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(153, 51, 255));
        jLabel3.setText("Radius:");

        RadiusField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        RadiusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadiusFieldActionPerformed(evt);
            }
        });

        DrawButton.setForeground(new java.awt.Color(153, 51, 255));
        DrawButton.setText("Draw");
        DrawButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        DrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawButtonActionPerformed(evt);
            }
        });

        CancelButton.setForeground(new java.awt.Color(153, 51, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(RadiusField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(YpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(YpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RadiusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrawButton)
                    .addComponent(CancelButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XpositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XpositionFieldActionPerformed

    }//GEN-LAST:event_XpositionFieldActionPerformed

    private void YpositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YpositionFieldActionPerformed
        
    }//GEN-LAST:event_YpositionFieldActionPerformed

    private void RadiusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadiusFieldActionPerformed
       
    }//GEN-LAST:event_RadiusFieldActionPerformed

    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
       int bWidth=main.getBoardWidth();
       int bHeight=main.getBoardHeight();
        try{
       if(XpositionField.getText().isEmpty()||YpositionField.getText().isEmpty()||RadiusField.getText().isEmpty())
           throw new IllegalArgumentException("Some Fields are Empty !!");
       int x=Integer.parseInt(XpositionField.getText());
       int y=Integer.parseInt(YpositionField.getText());
       double radius=Double.parseDouble(RadiusField.getText());
       if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be a positive number.");
        }
       if (x < 0 || x > bWidth || y < 0 || y > bHeight) {
            throw new IllegalArgumentException("Position is out of bounds.");
        }
       if ((x - radius < 0) || (x + radius > bWidth) || (y - radius < 0) || (y + radius > bHeight)) {
            throw new IllegalArgumentException("Circle with this radius is out of bounds.");
        }
       circle.setPosition(new Point(x,y));
       Map<String, Double> properties = new HashMap<>();
       properties.put("Radius", radius);
       circle.setProperties(properties);
       engine.addShape(circle);
       Graphics g=main.getBoard().getGraphics();
       engine.refresh(g);
       dispose();
     }
       catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for position and radius.", "Input Error", JOptionPane.ERROR_MESSAGE);

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
       

    }//GEN-LAST:event_DrawButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
     dispose();        
    }//GEN-LAST:event_CancelButtonActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton DrawButton;
    private javax.swing.JTextField RadiusField;
    private javax.swing.JTextField XpositionField;
    private javax.swing.JTextField YpositionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

   
}
