// A Java program for a Client
import java.net.*;
import java.io.*;
 
public class SimpleClient
{
    // initialize socket and input output streams
    private Socket socket            = null;
    private java.util.Scanner input  = null;
    private DataOutputStream out     = null;
 
    // constructor to put ip address and port
    public SimpleClient(String address, int port)
    {
        // establish a connection
        try
        {
            socket = new Socket(address, port);
            System.out.println("Connected");
 
            // takes input from terminal
            input  = new java.util.Scanner(System.in);
 
            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        }
        catch(UnknownHostException u)
        {
            System.out.println(u);
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
 
        // string to read message from input
        String line = "";
 
        // keep reading until "Over" is input
        while (!line.equals("Over"))
        {
            try
            {
	    	System.out.print("> ");
                line = input.nextLine();
                out.writeUTF(line);
            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }
 
        // close the connection
        try
        {
            input.close();
            out.close();
            socket.close();
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
 
    public static void main(String args[])
    {
        SimpleClient client = new SimpleClient("127.0.0.1", 5000);
    }
}
