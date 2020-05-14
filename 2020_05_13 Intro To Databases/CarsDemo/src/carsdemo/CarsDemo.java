package carsdemo;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class CarsDemo {

    public static void main(String[] args) {
        
        final String DATABASE_URL = "jdbc:derby://localhost:1527/Cars";
        final String QUERY = "SELECT * FROM CONRAD.CarsTable";
        
        try
        {
            Connection conn = DriverManager.getConnection(
                DATABASE_URL, "conrad", "conrad"); 
            
            Statement st = conn.createStatement();
            ResultSet result = st.executeQuery(QUERY);
            
            ResultSetMetaData metaData = result.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            System.out.printf("Number of columns: %d%n", numberOfColumns);
            
            for (int i = 1; i <= numberOfColumns; i++)
                System.out.printf("%-8s\t", metaData.getColumnName(i));
            System.out.println();
                        
            while (result.next()) 
            {
               for (int i = 1; i <= numberOfColumns; i++)
                  System.out.printf("%-8s\t", result.getObject(i));
               System.out.println();
            } 
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
}
