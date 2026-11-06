import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5000);
            System.out.println("Server is waiting for client...");

            Socket s = ss.accept();
            System.out.println("Client connected.");

            DataInputStream dis =
                new DataInputStream(s.getInputStream());
            DataOutputStream dos =
                new DataOutputStream(s.getOutputStream());

            String msg = dis.readUTF();
            System.out.println("Client says: " + msg);

            dos.writeUTF("Hello Client, message received!");

            dis.close();
            dos.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

