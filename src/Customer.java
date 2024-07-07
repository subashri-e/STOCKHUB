import dao.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Customer extends javax.swing.JFrame {

    private int customerpk = 0;

    public Customer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private boolean validateFields() {
        if (!txtcname.getText().equals("") && !txtcmobno.getText().equals("") && !txtcemail.getText().equals("")) {
            return false;
        } else {
            return true;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcmobno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcemail = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel1.setText("MANAGE CUSTOMER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 14, 371, -1));

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOBILE.NO.", "EMAIL"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 77, -1, 504));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 126, 55, -1));
        getContentPane().add(txtcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 162, 327, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("MOBILE NO.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 202, 97, -1));

        txtcmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcmobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 238, 327, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("EMAIL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 278, 71, -1));
        getContentPane().add(txtcemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 314, 327, -1));

        btnsave.setBackground(new java.awt.Color(255, 204, 255));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 408, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 204, 255));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 408, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 204, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 408, -1, -1));

        btnclose.setBackground(new java.awt.Color(255, 204, 255));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(764, 408, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allpg_bg.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jLabel5ComponentShown(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
                                  
    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String name = txtcname.getText();
        String mobileno = txtcmobno.getText();
        String email = txtcemail.getText();
        if(validateFields()){
            JOptionPane.showMessageDialog(null, "All fields are required !!");
        }
        else
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("update customer set c_name=? , c_mobno=?, c_email=? where customer_pk = ?");
                ps.setString(1,name);
                ps.setString(2,mobileno);
                ps.setString(3,email);
                ps.setInt(4,customerpk);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer updated successfully !!");
                setVisible(false);
                new Customer().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
       setVisible(false);
       new Customer().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void txtcmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmobnoActionPerformed

    }//GEN-LAST:event_txtcmobnoActionPerformed

    private void jLabel5ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jLabel5ComponentShown
       
    }//GEN-LAST:event_jLabel5ComponentShown

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
 
        DefaultTableModel model =(DefaultTableModel)tableCustomer.getModel();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer ");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("customer_pk"),rs.getString("c_name"),rs.getString("c_mobno"),rs.getString("c_email")});
            }            
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
            btnupdate.setEnabled(false);
    }//GEN-LAST:event_formComponentShown

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        String name = txtcname.getText();
        String mobileno = txtcmobno.getText();
        String email = txtcemail.getText();
        if(validateFields()){
            JOptionPane.showMessageDialog(null, "All fields are required !!");
        }
        else
            try{
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into customer(c_name,c_mobno,c_email) values (?,?,?)");
                ps.setString(1,name);
                ps.setString(2,mobileno);
                ps.setString(3,email);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Customer added successfully !!");
                setVisible(false);
                new Customer().setVisible(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked

        int index = tableCustomer.getSelectedRow();
        TableModel model = tableCustomer.getModel();
        String id = model.getValueAt(index,0).toString();
        customerpk = Integer.parseInt(id);
        
        String name = model.getValueAt(index,1).toString();
        txtcname.setText(name);
        
        String mobileno = model.getValueAt(index,2).toString();
        txtcmobno.setText(mobileno);    
        
        String email = model.getValueAt(index,3).toString();
        txtcemail.setText(email);
        
        btnsave.setVisible(true);
        btnsave.setEnabled(false);
        btnupdate.setVisible(true);
        btnupdate.setEnabled(true);
    }//GEN-LAST:event_tableCustomerMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtcemail;
    private javax.swing.JTextField txtcmobno;
    private javax.swing.JTextField txtcname;
    // End of variables declaration//GEN-END:variables
}
