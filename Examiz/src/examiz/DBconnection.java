
package examiz;
import java.sql.*;


public class DBconnection {
    static final String DB_URL = "jdbc:mysql://localhost:3306/examiz";
    static final String USER = "root";
    static final String PASS = "";
    
    public static Connection connectDB()
    {
        Connection conn = null;

        try
        {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
         return conn;   
            
        }catch(Exception ex)
        {
        System.out.println("There were error while connectiing to db.");
        return null;
        }
    }
}