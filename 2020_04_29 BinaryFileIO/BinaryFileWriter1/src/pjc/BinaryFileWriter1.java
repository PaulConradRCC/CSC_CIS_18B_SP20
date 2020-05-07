package pjc;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileWriter1 {

    public static void main(String[] args) {

        // this example project creates a binary file named binary_data.dat
        // we will use: https://hexed.it to help us examine the binary data
        
        try {
            DataOutputStream outputFile = new DataOutputStream( new FileOutputStream("binary_data.dat") );
            outputFile.writeByte(110);          // write 110 out as byte
            outputFile.writeBoolean(true);      // write 'true' as binary
            outputFile.writeBoolean(false);     // write 'false' as binary
            outputFile.writeShort(28150);       // write binary of 28150 to file
            outputFile.writeInt(1234567890);    // write 1234567890 as binary to file
            outputFile.writeLong(1234567890123L); // write 1234567890123 as binary to file
            outputFile.writeFloat(3.14159265F); // write PI out as binary to file
            outputFile.writeDouble(3.14159265D); // write PI out as binary to file
            //outputFile.writeBytes("This is writing bytes as the string type"); // write out a string as bytes
            //outputFile.writeChars("This is writing chars as the string type"); // write out a string as chars
            outputFile.writeUTF("This is writing a string out as UTF-8"); // write out a string as UTF-8
            outputFile.close();
            System.out.printf("File: binary_data.dat successfully written.%n%n");
            
            // we discovered that lines 24 and 25 writeBytes and writeChars do not have corresponding
            // readBytes or readChars??? Let's research this one later...
        }
        catch(IOException ioe)
        {
            System.err.printf("Exception: %s caught%n", ioe.getMessage());
        }
    }
    
}
