
package Frontend;

import Backend.MainEngine;
import Backend.Square;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class SquarePropertiesDialog extends javax.swing.JDialog {
    private Square square;
    private MainEngine engine;
    private MainWindow main;
    public SquarePropertiesDialog(MainWindow mainWindow,MainEngine drawingEngine) {
        super((java.awt.Frame)null, true);
        initComponents();
         this.main=mainWindow;
         this.engine=drawingEngine;
         square=new Square();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        XpositionField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        YpositionField = new javax.swing.JTextField();
        SideLength = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Draw = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Square Properties");

        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("X Position:");

        XpositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        XpositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XpositionFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Y Position:");

        YpositionField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        YpositionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YpositionFieldActionPerformed(evt);
            }
        });

        SideLength.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        SideLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SideLengthActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("Side Length:");

        Draw.setForeground(new java.awt.Color(153, 0, 255));
        Draw.setText("Draw");
        Draw.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        Draw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrawActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(YpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SideLength, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(28, 28, 28)
                                    .addComponent(jLabel1))
                                .addComponent(XpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Draw, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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
                .addComponent(YpositionField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SideLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Draw, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void XpositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XpositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_XpositionFieldActionPerformed

    private void YpositionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YpositionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YpositionFieldActionPerformed

    private void SideLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SideLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SideLengthActionPerformed

    private void DrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawActionPerformed
          int bWidth = main.getBoardWidth();
        int bHeight = main.getBoardHeight();
        try {
            if (XpositionField.getText().isEmpty() || YpositionField.getText().isEmpty() || SideLength.getText().isEmpty()) {
                throw new IllegalArgumentException("Some Fields are Empty !!");
            }
            int x = Integer.parseInt(XpositionField.getText());
            int y = Integer.parseInt(YpositionField.getText());
            int side = Integer.parseInt(SideLength.getText());

            if (side <= 0) {
                throw new IllegalArgumentException("Side length must be a positive number.");
            }
            if (x < 0 || x + side > bWidth || y < 0 || y + side > bHeight) {
                throw new IllegalArgumentException("Square is out of bounds.");
            }

            square.setPosition(new Point(x, y));
            Map<String, Double> properties = new HashMap<>();
            properties.put("Side", (double) side);
            square.setProperties(properties);
            engine.addShape(square);
            Graphics g=main.getBoard().getGraphics();
            engine.refresh(g);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for position and side length.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DrawActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton Draw;
    private javax.swing.JTextField SideLength;
    private javax.swing.JTextField XpositionField;
    private javax.swing.JTextField YpositionField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
