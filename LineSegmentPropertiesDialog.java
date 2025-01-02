
package Frontend;

import Backend.MainEngine;
import Backend.LineSegment;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class LineSegmentPropertiesDialog extends javax.swing.JDialog {
   private LineSegment line;
   private MainEngine engine;
   private MainWindow main;
    public LineSegmentPropertiesDialog(MainWindow mainWindow,MainEngine drawingEngine) {
        super((java.awt.Frame)null, true);
        initComponents();
        this.main=mainWindow;
        this.engine=drawingEngine;
        line=new LineSegment();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        StartXField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StartYField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        EndXField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EndYField = new javax.swing.JTextField();
        DrawButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LineSegment Properties");

        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setText("Start X:");

        StartXField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        StartXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartXFieldActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 0, 255));
        jLabel2.setText("Start Y:");

        StartYField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        StartYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartYFieldActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(153, 0, 255));
        jLabel3.setText("End X:");

        EndXField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        EndXField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndXFieldActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(153, 0, 255));
        jLabel4.setText("End Y:");

        EndYField.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 255)));
        EndYField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EndYFieldActionPerformed(evt);
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(StartYField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(StartXField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndXField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EndYField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StartYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EndXField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EndYField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartXFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartXFieldActionPerformed

    private void StartYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartYFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StartYFieldActionPerformed

    private void EndXFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndXFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndXFieldActionPerformed

    private void EndYFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EndYFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EndYFieldActionPerformed

    private void DrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrawButtonActionPerformed
    int bWidth = main.getBoardWidth();
        int bHeight = main.getBoardHeight();
        try {
            if (StartXField.getText().isEmpty() || StartYField.getText().isEmpty() || EndXField.getText().isEmpty() || EndYField.getText().isEmpty()) {
                throw new IllegalArgumentException("Some Fields are Empty !!");
            }
            int startX = Integer.parseInt(StartXField.getText());
            int startY = Integer.parseInt(StartYField.getText());
            int endX = Integer.parseInt(EndXField.getText());
            int endY = Integer.parseInt(EndYField.getText());

            if (startX < 0 || startX > bWidth || startY < 0 || startY > bHeight || endX < 0 || endX > bWidth || endY < 0 || endY > bHeight) {
                throw new IllegalArgumentException("Position is out of bounds.");
            }

            line.setPosition(new Point(startX, startY));
            Map<String, Double> properties = new HashMap<>();
            properties.put("EndX", (double) endX);
            properties.put("EndY", (double) endY);
            line.setProperties(properties);
            engine.addShape(line);
            Graphics g=main.getBoard().getGraphics();
            engine.refresh(g);
            dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for positions.", "Input Error", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JTextField EndXField;
    private javax.swing.JTextField EndYField;
    private javax.swing.JTextField StartXField;
    private javax.swing.JTextField StartYField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
