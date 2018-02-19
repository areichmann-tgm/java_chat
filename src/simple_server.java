import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class simple_server extends Thread{
	
	public simple_server() {
		try (
			    Socket echoSocket = new Socket(hostName, portNumber);
			    PrintWriter out =
			        new PrintWriter(echoSocket.getOutputStream(), true);
			    BufferedReader in =
			        new BufferedReader(
			            new InputStreamReader(echoSocket.getInputStream()));
			    BufferedReader stdIn =
			        new BufferedReader(
			            new InputStreamReader(System.in))
			)
	}
	
	public void run() {
        
    }

}
