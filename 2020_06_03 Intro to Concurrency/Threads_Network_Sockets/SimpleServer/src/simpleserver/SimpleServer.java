package simpleserver;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.InetAddress;
import com.sun.net.httpserver.*;

public class SimpleServer {
    
    public SimpleServer() {
        try {
            int port = 2000;
            HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
            server.createContext("/",new MyHttpHandler());
            server.setExecutor(null);
            server.start();
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static void main(String[] args) {
        SimpleServer server = new SimpleServer(); 
    }
    
    public class MyHttpHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println(t.getRequestBody());
            String hostname = "localhost";
            
            InetAddress address = InetAddress.getByName(hostname);
            //String response = address.toString();
            String response = "<H1>Hello from SimpleServer!</H1>";
            
	    t.getResponseHeaders().add("Content-Type","text/html");
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            System.out.println(response.toString());
            os.close();
        }
    }
}
