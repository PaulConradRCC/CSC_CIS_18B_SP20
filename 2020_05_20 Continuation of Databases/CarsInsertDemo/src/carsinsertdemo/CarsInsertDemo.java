
package carsinsertdemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class CarsInsertDemo {

    public static void main(String[] args) {
        final String DATABASE_URL = "jdbc:derby://localhost:1527/Cars";
        final String QUERY = "INSERT INTO CONRAD.CarsTable (CarMake,CarModel,CarYear,CarMileage) VALUES (?,?,?,?)";
        
        System.out.print("Enter car make: ");
        String make = new Scanner(System.in).next();
        
        System.out.print("Enter car model: ");
        String model = new Scanner(System.in).next();
        
        System.out.print("Enter car year: ");
        String year = new Scanner(System.in).next();
        
        System.out.print("Enter car mileage: ");
        String mileage = new Scanner(System.in).next();
        
        try
        {
            Connection conn = DriverManager.getConnection(
                DATABASE_URL, "conrad", "conrad");
            
            PreparedStatement insertNewCar = conn.prepareStatement(QUERY);
            insertNewCar.setString(1,make);
            insertNewCar.setString(2,model);
            insertNewCar.setString(3,year);
            insertNewCar.setString(4,mileage);
            
            insertNewCar.executeUpdate();
        }
        catch(Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
    
}
