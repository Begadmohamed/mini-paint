
package Frontend;

import Backend.MainEngine;
import Backend.Shape;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class RecAndLineResize extends javax.swing.JDialog {

   private MainWindow main;
   private Shape shape;
   private MainEngine engine; 
    public RecAndLineResize(MainWindow mainWindow,Shape selectedShape,MainEngine mainEngine) {
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
        WidthXfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        HeightYfield = new javax.swing.JTextField();
        ResizeButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Resize");

        jLabel1.setForeground(new java.awt.Color(153, 51, 255));
        jLabel1.setText("New Width or New X");

        WidthXfield.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        WidthXfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WidthXfieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 51, 255));
        jLabel2.setText("New Height or New Y");

        HeightYfield.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
        HeightYfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HeightYfieldActionPerformed(evt);
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

        CancelButton.setForeground(new java.awt.Color(153, 51, 255));
        CancelButton.setText("Cancel");
        CancelButton.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 51, 255)));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HeightYfield, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(WidthXfield, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel2)))))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ResizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(WidthXfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HeightYfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResizeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void WidthXfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WidthXfieldActionPerformed
        
    }//GEN-LAST:event_WidthXfieldActionPerformed

    private void HeightYfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HeightYfieldActionPerformed
        
    }//GEN-LAST:event_HeightYfieldActionPerformed

    private void ResizeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResizeButtonActionPerformed
     int bWidth=main.getBoardWidth();
     int bHeight=main.getBoardHeight();
     try{
         if(WidthXfield.getText().isEmpty()||HeightYfield.getText().isEmpty())
             throw new IllegalArgumentException("Some Fields are Empty !!");
         double x=Double.parseDouble(WidthXfield.getText()); //new width or x2
         double y=Double.parseDouble(HeightYfield.getText()); //new height or y2
        if(x<0 || x+shape.getPosition().x>bWidth || y<0 || y+shape.getPosition().y>bHeight)
            throw new IllegalArgumentException("Position is out of bounds.");
        shape.resize(x, y); //for rec and line
        main.getBoard().repaint();
        Graphics g=main.getBoard().getGraphics();
        engine.refresh(g);
        dispose();
     }catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Please enter valid numbers for position and radius.", "Input Error", JOptionPane.ERROR_MESSAGE);

    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_ResizeButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField HeightYfield;
    private javax.swing.JButton ResizeButton;
    private javax.swing.JTextField WidthXfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
