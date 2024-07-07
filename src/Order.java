import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import common.OpenPdf;
import dao.ConnectionProvider;
import dao.InventoryUtils;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Order extends javax.swing.JFrame {

    private int customerpk = 0;
    private int productpk = 0;
    private int finalTotalPrice = 0;
    private String orderId = "";

    public Order() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private void clearProductFields(){
        productpk = 0;
        txtpname.setText("");
        txtpprice.setText("");
        txtpdesc.setText("");
        txtorderqty.setText("");
    }
    
    public String getUniqueId(String prefix){
        return prefix + System.nanoTime();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableProduct = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableCart = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcmobno = new javax.swing.JTextField();
        txtcemail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtpprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtpdesc = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtorderqty = new javax.swing.JTextField();
        btncart = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        lbltotalprice = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

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
        jLabel1.setText("MANAGE ORDER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 15, 295, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("CUSTOMER LIST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 78, 140, -1));

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "MOBILE NO.", "EMAIL"
            }
        ));
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableCustomer);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 106, 353, 272));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 204, 255));
        jLabel3.setText("PRODUCT LIST");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 78, 130, -1));

        tableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "PRICE", "QTY", "DESC", "CAT_ID", "CAT_NAME"
            }
        ));
        tableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableProduct);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 106, 479, 272));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 204, 255));
        jLabel4.setText("CART");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1129, 78, 60, -1));

        tableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRO_ID", "NAME", "QTY", "PRICE", "DESC", "SUB_TOTAL"
            }
        ));
        tableCart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCartMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableCart);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(955, 106, 377, 272));

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("SELECTED CUSTOMER :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 409, 190, -1));

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("NAME :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 464, 59, -1));
        getContentPane().add(txtcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 462, 238, -1));

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("MOBILE NO.");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 504, 103, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("EMAIL :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 544, 75, -1));

        txtcmobno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcmobnoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcmobno, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 502, 238, -1));
        getContentPane().add(txtcemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 542, 238, -1));

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("SELECTED PRODUCT :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 409, 207, -1));

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("PRODUCT NAME :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 442, 149, -1));

        txtpname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpnameActionPerformed(evt);
            }
        });
        getContentPane().add(txtpname, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 440, 258, -1));

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("PRODUCT PRICE :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 484, 149, -1));
        getContentPane().add(txtpprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 480, 258, -1));

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("PRODUCT DESCRIPTION :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 522, 199, -1));

        txtpdesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpdescActionPerformed(evt);
            }
        });
        getContentPane().add(txtpdesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 520, 258, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("ORDER QUANTITY : ");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 562, 170, -1));
        getContentPane().add(txtorderqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 560, 258, -1));

        btncart.setBackground(new java.awt.Color(255, 204, 255));
        btncart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncart.setText("ADD  TO  CART");
        btncart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncartActionPerformed(evt);
            }
        });
        getContentPane().add(btncart, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 133, -1));

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("TOTAL AMOUNT : Rs.");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(991, 406, 218, -1));

        lbltotalprice.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        lbltotalprice.setForeground(new java.awt.Color(255, 255, 255));
        lbltotalprice.setText("00000");
        getContentPane().add(lbltotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 406, 76, -1));

        btnsave.setBackground(new java.awt.Color(255, 204, 255));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnsave.setText("SAVE ORDER DETAILS");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(1083, 456, -1, -1));

        btnreset.setBackground(new java.awt.Color(255, 204, 255));
        btnreset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnreset.setText("RESET");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        getContentPane().add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 509, 148, -1));

        btnclose.setBackground(new java.awt.Color(255, 204, 255));
        btnclose.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnclose.setText("CLOSE");
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1089, 560, 148, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgorder.png"))); // NOI18N
        jLabel16.setText("jLabel16");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        txtcname.setEditable(false);
        txtcmobno.setEditable(false);
        txtcemail.setEditable(false);
        
        txtpname.setEditable(false);
        txtpprice.setEditable(false);
        txtpdesc.setEditable(false);
        
        DefaultTableModel model =(DefaultTableModel)tableCustomer.getModel();
        DefaultTableModel productmodel =(DefaultTableModel)tableProduct.getModel();
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from customer ");
            while(rs.next()){
                model.addRow(new Object[]{rs.getString("customer_pk"),rs.getString("c_name"),rs.getString("c_mobno"),rs.getString("c_email")});
            }  
            rs=st.executeQuery("select * from Product inner join category on Product.category_fk = category.category_pk ");
            while(rs.next()){
                productmodel.addRow(new Object[]{rs.getString("product_pk"),rs.getString("p_name"),rs.getString("p_price"),rs.getString("p_quantity"),rs.getString("p_description"),rs.getString("category_fk"),rs.getString("name")});
            }
        }
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
    }//GEN-LAST:event_formComponentShown

    private void txtcmobnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcmobnoActionPerformed

    }//GEN-LAST:event_txtcmobnoActionPerformed

    private void txtpdescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpdescActionPerformed

    }//GEN-LAST:event_txtpdescActionPerformed

    private void txtpnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpnameActionPerformed

    }//GEN-LAST:event_txtpnameActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        if(finalTotalPrice !=0 && !txtcname.getText().equals("")){
            orderId = getUniqueId("Bill-");
            
            DefaultTableModel dtm =(DefaultTableModel) tableCart.getModel();
            if(tableCart.getRowCount()!=0){
                for(int i=0;i<tableCart.getRowCount();i++){
                    try{
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        st.executeUpdate("update Product set p_quantity = p_quantity-"+Integer.parseInt(dtm.getValueAt(i, 2).toString())+ " where product_pk="+Integer.parseInt(dtm.getValueAt(i,0).toString()));       
                    }
                    catch(Exception e){
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            }
            try{
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                Connection con = ConnectionProvider.getCon();
                PreparedStatement ps = con.prepareStatement("insert into orderDetail(orderId,customer_fk,orderDate,totalPaid) values(?,?,?,?)");
                ps.setString(1,orderId);
                ps.setInt(2,customerpk);
                ps.setString(3,myFormat.format(cal.getTime()));
                ps.setInt(4,finalTotalPrice);
                ps.executeUpdate();
                             
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
        
            com.itextpdf.text.Document doc = new com.itextpdf.text.Document();
            try{
                SimpleDateFormat myFormat = new SimpleDateFormat("dd-MM-yyyy");
                Calendar cal = Calendar.getInstance();
                
                PdfWriter.getInstance(doc,new FileOutputStream(InventoryUtils.billPath+""+orderId+".pdf"));
                doc.open();
                
                Paragraph projectName = new Paragraph("                                                                       STOCKHUB");
                doc.add(projectName);
                Paragraph starLine = new Paragraph("***************************************************************************************************************");
                doc.add(starLine);
                Paragraph details = new Paragraph("\tOrder Id : "+orderId +"\nDate : "+myFormat.format(cal.getTime())+"\nTotal Amount Paid : Rs."+finalTotalPrice+"\n" );
                doc.add(details);
                doc.add(starLine);
                PdfPTable tb1 = new PdfPTable(5);
                PdfPCell nameCell = new PdfPCell(new Phrase("Name"));
                PdfPCell descCell = new PdfPCell(new Phrase("Description"));
                PdfPCell priceCell = new PdfPCell(new Phrase("Price per unit"));
                PdfPCell qtyCell = new PdfPCell(new Phrase("Quantity"));
                PdfPCell subtotalCell = new PdfPCell(new Phrase("Sub Total Price"));
                
                BaseColor backgroundColor = new BaseColor(102,102,255);
                nameCell.setBackgroundColor(backgroundColor);
                descCell.setBackgroundColor(backgroundColor);
                priceCell.setBackgroundColor(backgroundColor);
                qtyCell.setBackgroundColor(backgroundColor);
                subtotalCell.setBackgroundColor(backgroundColor);
                
                tb1.addCell(nameCell);
                tb1.addCell(descCell);
                tb1.addCell(priceCell);
                tb1.addCell(qtyCell);
                tb1.addCell(subtotalCell);
                
                for(int i=0;i<tableCart.getRowCount();i++){
                    tb1.addCell(tableCart.getValueAt(i,1).toString());
                    tb1.addCell(tableCart.getValueAt(i,4).toString());
                    tb1.addCell(tableCart.getValueAt(i,3).toString());
                    tb1.addCell(tableCart.getValueAt(i,2).toString());
                    tb1.addCell(tableCart.getValueAt(i,5).toString());
                }
                
                doc.add(tb1);
                doc.add(starLine);
                Paragraph thanksmsg = new Paragraph("Thank you , Please visit again.");
                doc.add(thanksmsg);
                OpenPdf.OpenById(orderId);
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            doc.close();
            setVisible(false);
            new Order().setVisible(true);
        }     
        else
        {
            JOptionPane.showMessageDialog(null, "Please add some product to cart or select customer");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed

        setVisible(false);
        new Order().setVisible(true);
    }//GEN-LAST:event_btnresetActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed

        setVisible(false);
    }//GEN-LAST:event_btncloseActionPerformed

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
        

    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductMouseClicked

        int index = tableProduct.getSelectedRow();
        TableModel model = tableProduct.getModel();
        String id = model.getValueAt(index,0).toString();
        productpk = Integer.parseInt(id);
        
        String pname = model.getValueAt(index,1).toString();
        txtpname.setText(pname);
        
        String pprice = model.getValueAt(index,2).toString();
        txtpprice.setText(pprice);
        
        String description = model.getValueAt(index,4).toString();
        txtpdesc.setText(description);

    }//GEN-LAST:event_tableProductMouseClicked

    private void btncartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncartActionPerformed

        String no_units = txtorderqty.getText();
        if(!no_units.equals("")){
            String pname = txtpname.getText();
            String pdesc = txtpdesc.getText();
            String pprice = txtpprice.getText();
            
            int totalprice = Integer.parseInt(txtorderqty.getText())*Integer.parseInt(pprice);
            
            int checkstock = 0;
            int checkProductexistsincart = 0;
            
            try{
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from Product where product_pk="+productpk+" ");
                while(rs.next()){
                   if(rs.getInt("p_quantity")>=Integer.parseInt(no_units)){
                       checkstock = 1;
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"Product is out of stock. Only "+rs.getInt("p_quantity")+" Left");
                   }
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null,e);
            }
            
            if(checkstock==1){
                DefaultTableModel model = (DefaultTableModel) tableCart.getModel();
                if(tableCart.getRowCount()!=0){
                    for(int i=0;i<tableCart.getRowCount();i++){
                        if(Integer.parseInt(model.getValueAt(i, 0).toString())==productpk){
                            checkProductexistsincart = 1;
                            JOptionPane.showMessageDialog(null,"Product already exist in cart !!");
                        }
                    }
                }
                if(checkProductexistsincart == 0){
                    model.addRow(new Object[]{productpk,pname,no_units,pprice,pdesc,totalprice});
                    finalTotalPrice = finalTotalPrice +totalprice;
                    lbltotalprice.setText(String.valueOf(finalTotalPrice));
                    JOptionPane.showMessageDialog(null,"Added Successfully");
                }
                clearProductFields();
           }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"No of Quantity and product field is required !!");
        }
    }//GEN-LAST:event_btncartActionPerformed

    private void tableCartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCartMouseClicked
        // TODO add your handling code here:
        int index = tableCart.getSelectedRow();
        int a = JOptionPane.showConfirmDialog(null,"Do you want to remove this product ","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            TableModel model = tableCart.getModel();
            String subtotal = model.getValueAt(index,5).toString();
            finalTotalPrice = finalTotalPrice - Integer.parseInt(subtotal);
            lbltotalprice.setText(String.valueOf(finalTotalPrice));
            ((DefaultTableModel) tableCart.getModel()).removeRow(index);
        
        }
    }//GEN-LAST:event_tableCartMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncart;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbltotalprice;
    private javax.swing.JTable tableCart;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTable tableProduct;
    private javax.swing.JTextField txtcemail;
    private javax.swing.JTextField txtcmobno;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtorderqty;
    private javax.swing.JTextField txtpdesc;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtpprice;
    // End of variables declaration//GEN-END:variables
}
