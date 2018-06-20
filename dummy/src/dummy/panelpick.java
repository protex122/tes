package dummy;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class panelpick extends javax.swing.JPanel {
    
    //Unit u = new Unit();
    Unit u;
    
    public panelpick() {
        initComponents();
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xsize = (int) tk.getScreenSize().getWidth();
        int ysize = (int) tk.getScreenSize().getHeight();
        this.setSize(xsize, ysize);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        archer = new javax.swing.JButton();
        masuk = new javax.swing.JButton();
        priest = new javax.swing.JButton();

        archer.setText("archer");
        archer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archerActionPerformed(evt);
            }
        });

        masuk.setText("masuk");
        masuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukActionPerformed(evt);
            }
        });

        priest.setText("priest");
        priest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masuk)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(archer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priest)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archer)
                    .addComponent(priest))
                .addGap(18, 18, 18)
                .addComponent(masuk)
                .addContainerGap(123, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void archerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archerActionPerformed
        Unit u = new Unit();
        u.setJob(1);
        //JOptionPane.showMessageDialog(null, u.getClass().getSimpleName());
    }//GEN-LAST:event_archerActionPerformed

    private void masukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukActionPerformed
        Frame f = (Frame)this.getParent().getParent().getParent().getParent();
        JOptionPane.showMessageDialog(null, "Masuk");
        f.goGame(u);
    }//GEN-LAST:event_masukActionPerformed

    private void priestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priestActionPerformed
        Unit u = new Unit();
        u.setJob(2);
    }//GEN-LAST:event_priestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archer;
    private javax.swing.JButton masuk;
    private javax.swing.JButton priest;
    // End of variables declaration//GEN-END:variables
}
