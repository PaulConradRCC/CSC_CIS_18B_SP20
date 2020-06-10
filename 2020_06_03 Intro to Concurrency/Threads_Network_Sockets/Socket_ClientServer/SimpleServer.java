// A Java program for a Server
import java.net.*;
import java.io.*;
 
public class SimpleServer
{
    //initialize socket and input stream
    private Socket          socket   = null;
    private ServerSocket    server   = null;
    private DataInputStream in       = null;
    private DataOutputStream out     = null;
 
    // constructor with port
    public SimpleServer(int port)
    {
	while(true) {
        // starts server and waits for a connection
        try
        {
            server = new ServerSocket(port);
            System.out.println("Server started");
 
            System.out.println("Waiting for a client ...");
 
            socket = server.accept();
            System.out.println("Client accepted");
 
            // takes input from the client socket
            in = new DataInputStream(
                 new BufferedInputStream(socket.getInputStream()));
 
            String line = "";
 
            // reads message from client until "Over" is sent
            while (!line.equals("Over"))
            {
                try
                {
                    line = in.readUTF();
                    System.out.println("Client said: "+line);
		    
		    // sends output to the socket
		    out = new DataOutputStream(socket.getOutputStream());
		    out.writeUTF("Thank you client for: "+line);
 
                }
                catch(IOException i)
                {
                    System.out.println(i);
                }
            }
            System.out.println("Closing connection");
 
            // close connection
            socket.close();
            in.close();
	    break;
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
	}
    }
 
    public static void main(String args[])
    {
        SimpleServer server = new SimpleServer(5000);
    }
}
