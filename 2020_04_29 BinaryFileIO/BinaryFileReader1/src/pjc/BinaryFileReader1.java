package pjc;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BinaryFileReader1 {
    public static void main(String[] args) {
        // this example project reads the binary file named binary_data.dat
        // that was created in BinaryFileWriter1 project.
        
        try {
            DataInputStream inputFile = new DataInputStream( new FileInputStream("binary_data.dat") );
            
            byte a_byte;
            int an_int;
            boolean a_bool_1, a_bool_2;
            short a_short;
            long a_long;
            float a_float;
            double a_double;
            String a_string;
            
            a_byte = inputFile.readByte();  // reads in 110
            a_bool_1 = inputFile.readBoolean(); // reads in 'true'
            a_bool_2 = inputFile.readBoolean(); // reads in 'false'
            a_short = inputFile.readShort(); // reads in 28150
            an_int = inputFile.readInt(); // reads in 1234567890
            a_long = inputFile.readLong(); // reads in 1234567890123L
            a_float = inputFile.readFloat(); // reads in 3.14159265F
            a_double = inputFile.readDouble(); // reads in 3.14159265D
            a_string = inputFile.readUTF(); // reads in the string
            
            inputFile.close();
            
            System.out.printf("File: binary_data.dat successfully read.%n");
            System.out.printf("Here is all of the data that was read in:%n");
            
            System.out.printf("        Byte: %d%n", a_byte);
            System.out.printf("     Boolean: %b%n", a_bool_1);
            System.out.printf("     Boolean: %b%n", a_bool_2);
            System.out.printf("   Short Int: %d%n", a_short);
            System.out.printf("  32 bit Int: %d%n", an_int);
            System.out.printf("  64 bit Int: %d%n", a_long);
            System.out.printf("32 bit Float: %.8f%n", a_float);
            System.out.printf("64 bit Float: %.8f%n", a_double);
            System.out.printf("UTF-8 String: %s%n", a_string);
        }
        catch(IOException ioe)
        {
            System.err.printf("Exception: %s caught%n", ioe.getMessage());
        }
    }
    
}
