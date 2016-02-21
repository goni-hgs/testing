package tcp;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author : Goni of Berlin 
 * @Date   : 1/27/16
 */
public class TCPServer {
	public static void main(String argv[]) throws Exception {
		ServerSocket welcomeSocket = new ServerSocket(30202);
		while (true) {
			Socket connectionSocket = welcomeSocket.accept();
			DataInputStream dis = new DataInputStream(new BufferedInputStream(connectionSocket.getInputStream()));

			byte[] b = new byte[204];
			int readSize = dis.read(b);

			System.out.println("Read Size : " + readSize);
			System.out.println("Received: [" + new String(b) + "]");

			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(connectionSocket.getOutputStream()));
			dos.write(b);
			dos.flush();

			dis.close();
			dos.close();
			connectionSocket.close();
		}
	}
}
