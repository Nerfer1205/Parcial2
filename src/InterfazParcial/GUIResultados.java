/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazParcial;

/**
 *
 * @author Usuario
 */
public class GUIResultados extends javax.swing.JFrame {

    /**
     * Creates new form GUIResultados
     */
    public GUIResultados() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbChina = new javax.swing.JLabel();
        lbEspaña = new javax.swing.JLabel();
        lbItalia = new javax.swing.JLabel();
        lbFrancia = new javax.swing.JLabel();
        lbEEUU = new javax.swing.JLabel();
        lbOtros = new javax.swing.JLabel();
        lbNumOtros = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbNumIta = new javax.swing.JLabel();
        lbNumFran = new javax.swing.JLabel();
        lbNumEEUU = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbChina.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbChina.setText("China :");
        getContentPane().add(lbChina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        lbEspaña.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEspaña.setText("España :");
        getContentPane().add(lbEspaña, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        lbItalia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbItalia.setText("Italia :");
        getContentPane().add(lbItalia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        lbFrancia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFrancia.setText("Francia:");
        getContentPane().add(lbFrancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        lbEEUU.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbEEUU.setText("EE.UU:");
        getContentPane().add(lbEEUU, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        lbOtros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbOtros.setText("Otros:");
        getContentPane().add(lbOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        lbNumOtros.setText("Numero");
        getContentPane().add(lbNumOtros, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        jLabel2.setText("Numero:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, -1, -1));
        jLabel2.getAccessibleContext().setAccessibleName("lbNumChi");

        jLabel3.setText("Numero");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, -1, -1));
        jLabel3.getAccessibleContext().setAccessibleName("lbNumEsp");

        lbNumIta.setText("Numero");
        getContentPane().add(lbNumIta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        lbNumFran.setText("Numero");
        getContentPane().add(lbNumFran, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, -1, -1));

        lbNumEEUU.setText("Numero");
        getContentPane().add(lbNumEEUU, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUIResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbChina;
    private javax.swing.JLabel lbEEUU;
    private javax.swing.JLabel lbEspaña;
    private javax.swing.JLabel lbFrancia;
    private javax.swing.JLabel lbItalia;
    private javax.swing.JLabel lbNumEEUU;
    private javax.swing.JLabel lbNumFran;
    private javax.swing.JLabel lbNumIta;
    private javax.swing.JLabel lbNumOtros;
    private javax.swing.JLabel lbOtros;
    // End of variables declaration//GEN-END:variables
}
