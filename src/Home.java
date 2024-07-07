import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
    public Home() {
        initComponents();
    }
   public Home(String role) {
        initComponents();
        setLocationRelativeTo(null);
        if(role.equals("Admin")){
            btnuser.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnuser = new javax.swing.JButton();
        btncategory = new javax.swing.JButton();
        btnproduct = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btnorder = new javax.swing.JButton();
        btnvieworder = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnuser.setBackground(new java.awt.Color(204, 204, 255));
        btnuser.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnuser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Users.png"))); // NOI18N
        btnuser.setText("USER");
        btnuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuserActionPerformed(evt);
            }
        });
        getContentPane().add(btnuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 160, -1));

        btncategory.setBackground(new java.awt.Color(204, 204, 255));
        btncategory.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btncategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/category.png"))); // NOI18N
        btncategory.setText("CATEGORY");
        btncategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryActionPerformed(evt);
            }
        });
        getContentPane().add(btncategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        btnproduct.setBackground(new java.awt.Color(204, 204, 255));
        btnproduct.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnproduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/product.png"))); // NOI18N
        btnproduct.setText("PRODUCT");
        btnproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnproductActionPerformed(evt);
            }
        });
        getContentPane().add(btnproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 390, 160, -1));

        btncustomer.setBackground(new java.awt.Color(204, 204, 255));
        btncustomer.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btncustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/customers.png"))); // NOI18N
        btncustomer.setText("CUSTOMER");
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        getContentPane().add(btncustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 270, 172, -1));

        btnorder.setBackground(new java.awt.Color(204, 204, 255));
        btnorder.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Orders.png"))); // NOI18N
        btnorder.setText("ORDER");
        btnorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnorderActionPerformed(evt);
            }
        });
        getContentPane().add(btnorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 172, -1));

        btnvieworder.setBackground(new java.awt.Color(204, 204, 255));
        btnvieworder.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnvieworder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/View-orders.png"))); // NOI18N
        btnvieworder.setText("VIEW ORDER");
        btnvieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvieworderActionPerformed(evt);
            }
        });
        getContentPane().add(btnvieworder, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 500, -1, -1));

        btnlogout.setBackground(new java.awt.Color(204, 204, 255));
        btnlogout.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Exit.png"))); // NOI18N
        btnlogout.setText("LOGOUT");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bg_home.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuserActionPerformed
        new User().setVisible(true);
    }//GEN-LAST:event_btnuserActionPerformed

    private void btncategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryActionPerformed
        new Category().setVisible(true);
    }//GEN-LAST:event_btncategoryActionPerformed

    private void btnproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnproductActionPerformed
        new Product().setVisible(true);
    }//GEN-LAST:event_btnproductActionPerformed

    private void btnvieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvieworderActionPerformed
        new ViewOrders().setVisible(true);
    }//GEN-LAST:event_btnvieworderActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int a = JOptionPane.showConfirmDialog(null,"Do you want to logout the application ","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new Login().setVisible(true);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
        // TODO add your handling code here:
        new Customer().setVisible(true);
    }//GEN-LAST:event_btncustomerActionPerformed

    private void btnorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnorderActionPerformed
        // TODO add your handling code here:
        new Order().setVisible(true);
    }//GEN-LAST:event_btnorderActionPerformed
    public static void main(String args[]) { 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncategory;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnproduct;
    private javax.swing.JButton btnuser;
    private javax.swing.JButton btnvieworder;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
