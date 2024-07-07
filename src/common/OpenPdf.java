package common;

import dao.InventoryUtils;
import java.io.File;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class OpenPdf {
    
    public static void OpenById(String id){
        try {   
            String filePath = InventoryUtils.billPath + id + ".pdf";
            File file = new File(filePath);
            
            if(file.exists()){
                Process p = Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + filePath);
            }
            else {
                JOptionPane.showMessageDialog(null, "File does not exist!");
            }
        } catch(IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }
}

    
    