
package DBConnection;

import com.mysql.jdbc.Connection;
//import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class database {
    
    public static Connection connect(){
        Connection conn=null;
       
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
     return conn;
    
    }
}
