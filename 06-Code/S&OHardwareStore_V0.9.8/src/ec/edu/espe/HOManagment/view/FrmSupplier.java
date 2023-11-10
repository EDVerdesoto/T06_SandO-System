package ec.edu.espe.HOManagment.view;

import ec.edu.espe.HOManagment.controller.SupplierController;
import ec.edu.espe.HOManagment.controller.Connection;
import ec.edu.espe.HOManagment.model.Supplier;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author  Code Warriors, DCCO-ESPE
 */
public class FrmSupplier extends javax.swing.JFrame {

    public class centerFrame extends javax.swing.JFrame {

        public centerFrame() {
            initComponents();

            setLocationRelativeTo(null);
        }
    }

    private SupplierController supplierController;

    /**
     * Creates new form FrmSupplier
     */
    public FrmSupplier() {
        initComponents();
        Connection.connectionDataBase();
        supplierController = new SupplierController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnBackToMenu = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtinvoiceNumber = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPendingPayment = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        btnAddSupplier = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(105, 145, 172));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBackToMenu.setText("Volver");
        btnBackToMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackToMenuActionPerformed(evt);
            }
        });
        jPanel3.add(btnBackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 51));
        jLabel7.setText("Proveedor");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel9.setForeground(new java.awt.Color(0, 51, 51));
        jLabel9.setText("Número:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        txtinvoiceNumber.setBorder(null);
        txtinvoiceNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinvoiceNumberActionPerformed(evt);
            }
        });
        txtinvoiceNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtinvoiceNumberKeyTyped(evt);
            }
        });
        jPanel3.add(txtinvoiceNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 256, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 256, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 256, 10));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 256, 10));

        jLabel6.setForeground(new java.awt.Color(0, 51, 51));
        jLabel6.setText("Dirección");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel4.setForeground(new java.awt.Color(0, 51, 51));
        jLabel4.setText("Pago Pendiente");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));
        jPanel3.add(txtPendingPayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 260, -1));

        txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumberKeyTyped(evt);
            }
        });
        jPanel3.add(txtNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 260, -1));

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        jPanel3.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 260, -1));

        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, -1));

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 260, -1));

        btnAddSupplier.setText("Agregar");
        btnAddSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddSupplierActionPerformed(evt);
            }
        });
        jPanel3.add(btnAddSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, -1, -1));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 256, 10));

        jLabel1.setText("Número de factura");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddSupplierActionPerformed

        String name;
        String number;
        double pendingPayment;
        String appointment;
        String address;
        String invoiceNumber;

        name = txtName.getText();
        number = txtNumber.getText();
        pendingPayment = Double.parseDouble(txtPendingPayment.getText());
        
        address = txtAddress.getText();
        invoiceNumber= txtinvoiceNumber.getText();

        Supplier supplier = new Supplier(name, number, pendingPayment, address, invoiceNumber);

        supplierController.create(supplierController.buildDocument(supplier));
        Document result = supplierController.read(supplierController.buildDocument(supplier));
        if (result != null) {
            JOptionPane.showMessageDialog(null, "Successfully created");
        } else {
            JOptionPane.showMessageDialog(null, "A problem has occurred");
        }
    }//GEN-LAST:event_btnAddSupplierActionPerformed

    private void btnBackToMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackToMenuActionPerformed
        FrmHardwareStoreMenu frmStylesirelia;
        frmStylesirelia = new FrmHardwareStoreMenu();
        frmStylesirelia.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnBackToMenuActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
      char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");}  // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumberKeyTyped
       char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");} // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
       char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");}  // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void txtinvoiceNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtinvoiceNumberKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo numeros \n Enter only numbers");}
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinvoiceNumberKeyTyped

    private void txtinvoiceNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinvoiceNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinvoiceNumberActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSupplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSupplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddSupplier;
    private javax.swing.JButton btnBackToMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    private javax.swing.JTextField txtPendingPayment;
    private javax.swing.JTextField txtinvoiceNumber;
    // End of variables declaration//GEN-END:variables
}
