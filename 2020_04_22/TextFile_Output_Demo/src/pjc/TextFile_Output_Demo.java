// Steps for file i/o
//
// 1. Create file object for input or output, or both
// 2. Open the file
// 3. Do task or tasks on the file (such reading data or writing data)
// 4. Close the file
//

package pjc;

import java.lang.NumberFormatException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TextFile_Output_Demo {

    public static void main(String[] args) {
        String filename;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter name of the file to write: ");
        filename = kb.nextLine();
        FileWriter outputFile = null;
        
        try {
            outputFile = new FileWriter(filename,true);
            Formatter outputFormat = new Formatter(outputFile);
            
            String input = "";
            
            do {
                System.out.print("Enter a floating point number (type 'stop' when done): ");
                input = kb.next();
                
                if ( input.equalsIgnoreCase("stop") ) break;
                
                float value = Float.parseFloat(input);  // attempt to convert input into a float pt value
                
                outputFormat.format("%f%n", value);
                                
            } while (true);
            
            System.out.println("Successfully wrote the file: "+filename);
            outputFile.close();            
        }
        catch (NumberFormatException nfe)
        {
            Logger.getLogger(TextFile_Output_Demo.class.getName()).log(Level.WARNING, null, nfe);
        }
        catch (FileNotFoundException ex)
        {
            Logger.getLogger(TextFile_Output_Demo.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ioe)
        {
            Logger.getLogger(TextFile_Output_Demo.class.getName()).log(Level.SEVERE, null, ioe);
        }
    }
}
