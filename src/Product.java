
import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Product extends javax.swing.JFrame {
    
    private int productpk = 0;
    private int totalQuantity = 0;

    public Product() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void getAllCategory(){
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category ");
            txtpcategory.removeAllItems();
            while(rs.next()){
                txtpcategory.addItem(rs.getString("category_pk")+" - "+rs.getString("name"));
            }            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private boolean validateFields(String formtype) {
        if (formtype.equals("edit") && !txtpname.getText().equals("") && !txtpprice.getText().equals("") && !txtpdesc.getText().equals("")) {
            return false;
        } 
        else if (formtype.equals("new") && !txtpname.getText().equals("") && !txtpprice.getText().equals("") && !txtpdesc.getText().equals("") && !txtpquantity.getText().equals("")) {
            return false;
        } 
        else {
            return true;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtpquantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtpprice = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpdesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtpcategory = new javax.swing.JComboBox<>();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("MANAGE PRODUCT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(258, 6, 342, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "QTY", "PRICE", "DESCRIPTION", "CATEGORY ID", "CATEGORY NAME"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduct);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 500));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 106, 84, -1));
        getContentPane().add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 142, 344, -1));

        lblQuantity.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        lblQuantity.setForeground(new java.awt.Color(204, 204, 204));
        lblQuantity.setText("QUANTITY");
        getContentPane().add(lblQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 182, 96, -1));
        getContentPane().add(txtpquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 218, 344, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 258, 71, -1));
        getContentPane().add(txtpprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 294, 344, -1));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("DESCRIPTION");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 334, 132, -1));
        getContentPane().add(txtpdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 370, 344, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("CATEGORY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 410, 98, -1));

        txtpcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(txtpcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 446, 344, -1));

        btnsave.setBackground(new java.awt.Color(255, 204, 255));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 515, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 204, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 515, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 204, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(666, 515, -1, -1));

        btnclose.setBackground(new java.awt.Color(255, 204, 255));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 515, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allpg_bg.png"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String name = txtpname.getText();
        String quantity = txtpquantity.getText();
        String price = txtpprice.getText();
        String description = txtpdesc.getText();
        String category = (String) txtpcategory.getSelectedItem();
        String categoryId[] = category.split(" - ",0);
        
        if(validateFields("new")){
            JOptionPane.showMessageDialog(null,"All fields are required !!");
        }
        else{
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into product(p_name,p_quantity,p_price,p_description,category_fk) values (?,?,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,quantity);
                ps.setString(3,price);
                ps.setString(4,description);
                ps.setString(5,categoryId[0]);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product added successfully !!");
                setVisible(false);
                new Product().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Product().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        getAllCategory();
        DefaultTableModel model =(DefaultTableModel)tableProduct.getModel();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Product inner join category on Product.category_fk = category.category_pk ");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("product_pk"),rs.getString("p_name"),rs.getString("p_quantity"),rs.getString("p_price"),rs.getString("p_description"),rs.getString("category_fk"),rs.getString("name")});
            }            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        btnupdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked
        // TODO add your handling code here:
        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index,0).toString();
        productpk = Integer.parseInt(id);
        
        String name = model.getValueAt(index,1).toString();
        txtpname.setText(name);
        
        String quantity = model.getValueAt(index,2).toString();
        totalQuantity = 0;
        lblQuantity.setText("Add Quantity");
        totalQuantity = Integer.parseInt(quantity);    
        
        String price = model.getValueAt(index,3).toString();
        txtpprice.setText(price);
        
        String description = model.getValueAt(index,4).toString();
        txtpdesc.setText(description);
        
        txtpcategory.removeAllItems();
        String categoryId = model.getValueAt(index,5).toString();
        String categoryName = model.getValueAt(index,6).toString();
        txtpcategory.addItem(categoryId +" - "+categoryName);
        
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from category ");
            while(rs.next()){
                if(Integer.parseInt(categoryId) != rs.getInt(1))
                txtpcategory.addItem(rs.getString("category_pk")+" - "+rs.getString("name"));
            }            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        btnsave.setVisible(true);
        btnsave.setEnabled(false);
        btnupdate.setVisible(true);
        btnupdate.setEnabled(true);
    }//GEN-LAST:event_tableProductMouseClicked

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        String name = txtpname.getText();
        String quantity = txtpquantity.getText();
        String price = txtpprice.getText();
        String description = txtpdesc.getText();
        String category = (String) txtpcategory.getSelectedItem();
        String categoryId[] = category.split(" - ",0);
        
        if(validateFields("edit")){
            JOptionPane.showMessageDialog(null,"All fields are required !!");
        }
        else{
            try{
                if(!quantity.equals("")){
                    totalQuantity = totalQuantity + Integer.parseInt(quantity);
                }
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update Product set p_name=? ,p_quantity=? ,p_price=? ,p_description=? ,category_fk=? where product_pk=?");
                ps.setString(1,name);
                ps.setInt(2,totalQuantity);
                ps.setString(3,price);
                ps.setString(4,description);
                ps.setString(5,categoryId[0]);
                ps.setInt(6,productpk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Product updated successfully !!");
                setVisible(false);
                new Product().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
        }       
    }//GEN-LAST:event_btnupdateActionPerformed

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JTable tableProduct;
    private javax.swing.JComboBox<String> txtpcategory;
    private javax.swing.JTextField txtpdesc;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpprice;
    private javax.swing.JTextField txtpquantity;
    // End of variables declaration//GEN-END:variables
}
