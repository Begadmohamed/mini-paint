
package Frontend;

import Backend.MainEngine;
import Backend.Shape;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class SquareAndCircleResize extends javax.swing.JDialog {

   private MainWindow main;
   private Shape shape;
   private MainEngine engine; 
    public SquareAndCircleResize(MainWindow mainWindow,Shape selectedShape,MainEngine mainEngine) {
        super((java.awt.Frame) null, true);
        initComponents();
        main=mainWindow;
        shape=selectedShape;
        engine=mainEngine;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LengthField = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        ResizeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize");

        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("New Radius or Side length");

        LengthField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        LengthField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LengthFieldActionPerformed(evt);
            }
        });

        CancelButton.setForeground(new java.awt.Color(153, 51, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        ResizeButton.setForeground(new java.awt.Color(153, 51, 255));
        ResizeButton.setText("Resize");
        ResizeButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        ResizeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResizeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LengthField))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ResizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LengthField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(ResizeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void LengthFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LengthFieldActionPerformed
        
    }//GEN-LAST:event_LengthFieldActionPerformed

    private void ResizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResizeButtonActionPerformed
     int bWidth=main.getBoardWidth();
     int bHeight=main.getBoardHeight();
     try{
     if(LengthField.getText().isEmpty())
          throw new IllegalArgumentException("The field is Empty !!");
        double l=Double.parseDouble(LengthField.getText()); //new side length or radius
        if(l<0||l+shape.getPosition().x>bWidth ||l+shape.getPosition().y>bHeight)
            throw new IllegalArgumentException("Position is out of bounds.");
     shape.resize(l, 0); //resize circle or square
     main.getBoard().repaint();
     Graphics g=main.getBoard().getGraphics();
     engine.refresh(g);
     dispose();
         } 
     catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for position and radius.", "Input Error", JOptionPane.ERROR_MESSAGE);

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ResizeButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField LengthField;
    private javax.swing.JButton ResizeButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
