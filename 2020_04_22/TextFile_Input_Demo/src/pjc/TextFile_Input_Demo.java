// Steps for file i/o
//
// 1. Create file object for input or output, or both
// 2. Open the file
// 3. Do task or tasks on the file (such reading data or writing data)
// 4. Close the file
//

package pjc;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextFile_Input_Demo {

    public static void main(String[] args) {
        String filename;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of the file to read: ");
        filename = kb.nextLine();
        
        float total;
        float min, max;
        int count = 0;
        
        try {
            FileInputStream inputFile = new FileInputStream(filename);
            Scanner inputFileScan = new Scanner(inputFile);
            
            float value = inputFileScan.nextFloat();
            min = value;
            max = value;
            total = value;
            count++;
            
            while( inputFileScan.hasNext() )
            {
                value = inputFileScan.nextFloat();
                
                if ( value < min ) min = value;
                if ( value > max ) max = value;
                total = total + value;
                count++;
            }
            
            System.out.printf("All data has been read from the file, data count is %d data values%n", count);
            inputFile.close();
            
            // output simple stats
            System.out.printf("Total: %f%n", total);
            System.out.printf("  Max: %f%n", max);
            System.out.printf("  Min: %f%n", min);
            System.out.printf("  Avg: %f%n", total / count);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(TextFile_Input_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ioe)
        {
            Logger.getLogger(TextFile_Input_Demo.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
