/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante.gui;

import restaurante.logica.Plato;
import restaurante.logica.acompañante.Acompañante;
import restaurante.logica.bebida.Bebida;
import restaurante.logica.bebida.Gaseosa;



/**
 *
 * @author GOLDS
 */
public class JFrameMenuBebida2 extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMenuBebida2
     */
    private boolean gs;
    private boolean gp;
    private boolean gc;
    String gg;

    public String getGg() {
        return gg;
    }

    public void setGg(String gg) {
        this.gg = gg;
    }
    
    Bebida bb;
    
    
    public JFrameMenuBebida2() {
        initComponents();
        gs=true;
        gp=true;
        gc=true;
        Plato p= new Plato();
        p.setBb(bb);
        bb=new Gaseosa();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSp = new javax.swing.JButton();
        jButtonPp = new javax.swing.JButton();
        jButtonCc = new javax.swing.JButton();
<<<<<<< HEAD
=======
        jTextRes = new javax.swing.JTextField();
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSp.setText("Sprite");
        jButtonSp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpActionPerformed(evt);
            }
        });

        jButtonPp.setText("Pepsi");
        jButtonPp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPpActionPerformed(evt);
            }
        });

        jButtonCc.setText("Coca-cola");
        jButtonCc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonCc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
<<<<<<< HEAD
                .addContainerGap(223, Short.MAX_VALUE))
=======
                .addGap(46, 46, 46)
                .addComponent(jTextRes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
<<<<<<< HEAD
                .addComponent(jButtonSp)
                .addGap(18, 18, 18)
                .addComponent(jButtonPp)
                .addGap(18, 18, 18)
                .addComponent(jButtonCc)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextRes)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSp)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPp)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCc)))
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpActionPerformed
        
        gs=false;
        gp=true;
        gc=true;
        this.gg=bb.getSprite();
<<<<<<< HEAD
         this.dispose();
=======
        jTextRes.setText(bb.getSprite());
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
    }//GEN-LAST:event_jButtonSpActionPerformed

    private void jButtonPpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPpActionPerformed
       
        gs=true;
        gp=false;
        gc=true;
        this.gg=bb.getPepsi();
<<<<<<< HEAD
         this.dispose();;
=======
        jTextRes.setText(bb.getPepsi());
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
    }//GEN-LAST:event_jButtonPpActionPerformed

    private void jButtonCcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCcActionPerformed
        gs=true;
        gp=true;
        gc=false;
        this.gg=bb.getCocacola();
<<<<<<< HEAD
         this.dispose();
=======
        jTextRes.setText(bb.getCocacola());
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
    }//GEN-LAST:event_jButtonCcActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenuBebida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuBebida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuBebida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuBebida2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuBebida2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jButtonCc;
    javax.swing.JButton jButtonPp;
    javax.swing.JButton jButtonSp;
<<<<<<< HEAD
=======
    javax.swing.JTextField jTextRes;
>>>>>>> 71340cbac9663791270459dcd5de4737d75f82e7
    // End of variables declaration//GEN-END:variables
}
