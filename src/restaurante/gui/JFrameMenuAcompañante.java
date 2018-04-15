/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.gui;

import restaurante.logica.Plato;
import restaurante.logica.acompañante.Acompañante;
import restaurante.logica.acompañante.Ensalada;

/**
 *
 * @author GOLDS
 */
public class JFrameMenuAcompañante extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenuAcompañante
     */
    private boolean rep;
    private boolean hb;
    private boolean zn;
    Acompañante a;
    String e;

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }
    
    
    public JFrameMenuAcompañante() {
        initComponents();
        rep=true;
        hb=true;
        zn=true;
        Plato p=new Plato();
        p.setA(a);
        a=new Ensalada();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonRp = new javax.swing.JButton();
        jButtonHb = new javax.swing.JButton();
        jButtonZn = new javax.swing.JButton();
        jTextRes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonRp.setText("Ensalda De Repollo");
        jButtonRp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRpActionPerformed(evt);
            }
        });

        jButtonHb.setText("Ensalda De Habichuelas");
        jButtonHb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHbActionPerformed(evt);
            }
        });

        jButtonZn.setText("Ensalada De Zanahoria");
        jButtonZn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRp, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonZn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHb, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jTextRes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonRp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonHb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonZn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextRes)))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRpActionPerformed
        rep=false;
        hb=true;
        zn=true;
        this.e=a.getRepollo();
        jTextRes.setText(a.getRepollo());
    }//GEN-LAST:event_jButtonRpActionPerformed

    private void jButtonHbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHbActionPerformed
        rep=true;
        hb=false;
        zn=true;
        this.e=a.getHabichuela();
        jTextRes.setText(a.getHabichuela());
    }//GEN-LAST:event_jButtonHbActionPerformed

    private void jButtonZnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZnActionPerformed
        rep=true;
        hb=true;
        zn=false;
        this.e=a.getZanahoria();
        jTextRes.setText(a.getZanahoria());
    }//GEN-LAST:event_jButtonZnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAcompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAcompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAcompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAcompañante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuAcompañante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButtonHb;
    javax.swing.JButton jButtonRp;
    javax.swing.JButton jButtonZn;
    javax.swing.JTextField jTextRes;
    // End of variables declaration//GEN-END:variables
}
