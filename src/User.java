import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import dao.ConnectionProvider;
import java.awt.Color;
import javax.swing.table.TableModel;
public class User extends javax.swing.JFrame {
    private int appuser_pk = 0;  
    public User() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private boolean validateFields(String formType){
        if (formType.equals("edit") && !txtname.getText().equals("") && !txtmobno.getText().equals("") && !txtemail.getText().equals("") && !txtaddress.getText().equals("")){
            return false;
        }
        else if(formType.equals("new") && !txtname.getText().equals("") && !txtmobno.getText().equals("") && !txtemail.getText().equals("") && !txtaddress.getText().equals("") && !txtpass.getText().equals("")){
            return false;
        }
        else{
            return true;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableUser = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmobno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtpass = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

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
        jLabel1.setText("MANAGE USER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 19, 260, -1));

        tableUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOBILE NO.", "EMAIL", "ADDRESS", "STATUS"
            }
        ));
        tableUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableUser);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 96, -1, 484));

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 71, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 129, 341, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("MOBILE NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 110, -1));

        txtmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtmobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 190, 341, -1));

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 71, -1));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 251, 341, -1));

        jLabel5.setBackground(new java.awt.Color(204, 204, 204));
        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 71, -1));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 318, 341, -1));

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("STATUS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 62, -1));

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive" }));
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
            }
        });
        getContentPane().add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 341, -1));

        jLabel7.setBackground(new java.awt.Color(204, 204, 204));
        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("PASSWORD");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 84, -1));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, 341, -1));

        btnsave.setBackground(new java.awt.Color(255, 204, 255));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 508, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 204, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(578, 508, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 204, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 508, -1, -1));

        btnclose.setBackground(new java.awt.Color(255, 204, 255));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 508, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allpg_bg.png"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown

        DefaultTableModel model =(DefaultTableModel)tableUser.getModel();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from appuser where userRole ='Admin' ");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("appuser_pk"),rs.getString("name"),rs.getString("mobileno"),rs.getString("email"),rs.getString("address"),rs.getString("status")});
            }           
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
        btnupdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed

    }//GEN-LAST:event_txtstatusActionPerformed

    private void txtmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobnoActionPerformed

    }//GEN-LAST:event_txtmobnoActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int index = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        
        String id = model.getValueAt(index,0).toString();
        appuser_pk = Integer.parseInt(id);
        
        String name = txtname.getText();
        String mobileno = txtmobno.getText();
        String email = txtemail.getText();
        String address = txtaddress.getText();
        String status = (String) txtstatus.getSelectedItem();
        
        if(validateFields("edit")){
            JOptionPane.showMessageDialog(null, "All fields are required !!");
        }
        else
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update appuser set name=?,mobileno=?,email=?,address=?,status=? where appuser_pk=?");
                ps.setString(1,name);
                ps.setString(2,mobileno);
                ps.setString(3,email);
                ps.setString(4,address);
                ps.setString(5,status);
                ps.setString(6,id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User updated successfully !!");
                setVisible(false);
                new User().setVisible(true);
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    }                                      
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String name = txtname.getText();
        String mobileno = txtmobno.getText();
        String email = txtemail.getText();
        String password = txtpass.getText();
        String address = txtaddress.getText();
        String status = (String) txtstatus.getSelectedItem();
        
        if(validateFields("new")){
            JOptionPane.showMessageDialog(null, "All fields are required !!");
        }
        else
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into appuser(userRole,name,mobileno,email,password,address,status) values ('Admin',?,?,?,?,?,?)");
                ps.setString(1,name);
                ps.setString(2,mobileno);
                ps.setString(3,email);
                ps.setString(4,password);
                ps.setString(5,address);
                ps.setString(6,status);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "User added successfully !!");
                setVisible(false);
                new User().setVisible(true);
            }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null,e);
                    }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed

        setVisible(false);
        new User().setVisible(true);     
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void tableUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableUserMouseClicked

        int index = tableUser.getSelectedRow();
        TableModel model = tableUser.getModel();
        
        String id = model.getValueAt(index,0).toString();
        appuser_pk = Integer.parseInt(id);
        
        String name = model.getValueAt(index,1).toString();
        txtname.setText(name);
        
        String mobileno = model.getValueAt(index,2).toString();
        txtmobno.setText(mobileno);
        
        String email = model.getValueAt(index,3).toString();
        txtemail.setText(email);
        
        String address = model.getValueAt(index,4).toString();
        txtaddress.setText(address);
        
        String status = model.getValueAt(index,5).toString();
        txtstatus.removeAllItems();
        if(status.equals("Active")){
            txtstatus.addItem("Active");
            txtstatus.addItem("Inactive");
        }
        else{
            txtstatus.addItem("Inactive");
            txtstatus.addItem("Active");
        }
        
        txtpass.setEditable(false);
        txtpass.setBackground(Color.LIGHT_GRAY);
        
        btnsave.setEnabled(true);
        btnupdate.setEnabled(true);
    }//GEN-LAST:event_tableUserMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableUser;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtmobno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables
}
