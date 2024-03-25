/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz;

import Objetos.hastTable;

/**
 *
 * @author yangel
 */
public class Búsqueda extends javax.swing.JFrame {

    /**
     * Creates new form Búsqueda
     */
    
  private hastTable data;  // Instance of your hash table
  private TableModel dataTable;  // Your JTable component
    public Búsqueda() {
        this.setSize(507, 309);
        this.setTitle("Busqueda de Clientes");
        this.setLocationRelativeTo(null);
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        BTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableModel = new javax.swing.JTable();
        BBoton = new javax.swing.JButton();
        Last_nameF = new javax.swing.JTextField();
        L_nameF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        exitB = new javax.swing.JButton();
        VolverB = new javax.swing.JButton();

        BTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(BTable);

        jLabel1.setText("Busqueda de Clientes");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(585, 6, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 656, 415, -1));

        jLabel2.setText("Busqueda de Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 130, -1));

        TableModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TableModel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, 140));

        BBoton.setText("Buscar");
        getContentPane().add(BBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));

        Last_nameF.setText("Apellido");
        getContentPane().add(Last_nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 90, -1));

        L_nameF.setText("Nombre");
        getContentPane().add(L_nameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 100, -1));

        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 60, -1));

        jLabel4.setText("Nombre:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 20));

        exitB.setText("X");
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });
        getContentPane().add(exitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        VolverB.setText("Volver");
        VolverB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverBActionPerformed(evt);
            }
        });
        getContentPane().add(VolverB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitBActionPerformed

    private void VolverBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverBActionPerformed
        // TODO add your handling code here:
        Menú ventana = new Menú();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_VolverBActionPerformed

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
            java.util.logging.Logger.getLogger(Búsqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Búsqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Búsqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Búsqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Búsqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BBoton;
    private javax.swing.JTable BTable;
    private javax.swing.JTextField L_nameF;
    private javax.swing.JTextField Last_nameF;
    private javax.swing.JTable TableModel;
    private javax.swing.JButton VolverB;
    private javax.swing.JButton exitB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
