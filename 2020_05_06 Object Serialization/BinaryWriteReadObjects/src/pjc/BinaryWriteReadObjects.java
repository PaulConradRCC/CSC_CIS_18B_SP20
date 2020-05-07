
package pjc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinaryWriteReadObjects {
    public static void main(String[] args) {
        
        // Note: if you are using string literals for storing paths, you have to escape
        // sequence the \ in the path or the program will not compile.
        // If you are having your user enter a filename and (path if they include one)
        // from a prompt, there is no need for escape sequencing the \.
        
        //String filename = "C:\\Users\\pconrad\\Documents\\some_class.dat";
        String filename;
        
        System.out.print("Enter filename to write (can have path): ");
        filename = new java.util.Scanner(System.in).nextLine();
        
        System.out.println("Creating object named 'a' of the type SomeClass...");
        SomeClass a = new SomeClass();
        
        System.out.printf("Creating binary file called: %s...",filename);
        try (ObjectOutputStream outFile = new ObjectOutputStream(new FileOutputStream(filename))) {
                outFile.writeObject(a);
                System.out.printf("Writing binary from SomeClass object 'a' to file: %s...",filename);
                outFile.close();
                System.out.printf("File: %s successfully written.",filename);                        
        }        
        catch(IOException e)
        {
            System.out.printf("Exception: %s caught%n",e.getMessage());
        }       
        
        ////////////////////////////////////////////////////////////////////
        /// Now, let's read it back in, and put binary data into another ///
        /// object and compare...                                        ///
        ////////////////////////////////////////////////////////////////////
        try (ObjectInputStream inFile = new ObjectInputStream(new FileInputStream(filename))) {
            SomeClass b = (SomeClass)inFile.readObject();
            inFile.close();
            System.out.printf("Binary content of the %s file:%n%n%s%n", filename, b.toString());
        }        
        catch(IOException e)
        {
            System.out.printf("Exception: %s caught%n",e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BinaryWriteReadObjects.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
