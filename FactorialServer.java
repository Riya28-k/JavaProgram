import java.io.*;
import java.net.*;

public class FactorialServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server started. Waiting for client...");

            while (true) {
                Socket socket = serverSocket.accept();
                DataInputStream in = new DataInputStream(socket.getInputStream());
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                int number = in.readInt();
                long factorial = 1;
                for (int i = 1; i <= number; i++) {
                    factorial *= i;
                }

                out.writeLong(factorial);
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
