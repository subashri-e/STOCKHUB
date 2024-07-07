package dao;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class tables { 
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;
        try{
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(50), name varchar(200), mobileno varchar(50), email varchar(200), password varchar(50), address varchar (200), status varchar(50))");
            JOptionPane.showMessageDialog(null, "Table created successfully");
            st.executeUpdate("insert into appuser (userRole,name,mobileno,email,password,address,status) values('SuperAdmin', 'Mithra','9876543210','mithra@gmail.com','12345','India','Active')");

            st.executeUpdate("create table category(category_pk int AUTO_INCREMENT primary key,name varchar(200))");
            JOptionPane.showMessageDialog(null, "Table created successfully");

            st.executeUpdate("create table customer(customer_pk int AUTO_INCREMENT primary key,c_name varchar(200),c_mobno varchar(50),c_email varchar(200))");
            JOptionPane.showMessageDialog(null, "Table created successfully");

            st.executeUpdate("create table Product(product_pk int AUTO_INCREMENT primary key,p_name varchar(200),p_quantity int,p_price int,p_description varchar(500),category_fk int)");
            JOptionPane.showMessageDialog(null, "Table created successfully");

            st.executeUpdate("create table orderDetail(order_pk int AUTO_INCREMENT primary key,orderId varchar(200),customer_fk int,orderDate varchar(200),totalpaid int)");
            JOptionPane.showMessageDialog(null, "Table created successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close(); 
            }
            catch(Exception e){    
            }
        }
    }   
}
