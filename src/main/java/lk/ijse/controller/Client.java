package lk.ijse.controller;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;

public class Client {

    private Socket socket;
    private ArrayList<Client> clientsArrayList;

    DataInputStream dataInputStream;

    DataOutputStream dataOutputStream;

     private BufferedReader bufferedReader;

     private PrintWriter writer;

     public Client(Socket socket, ArrayList<Client> clientsArrayList) throws IOException {
         this.socket=socket;
         this.clientsArrayList=clientsArrayList;
         this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
         this.writer = new PrintWriter(socket.getOutputStream(), true);
     }

    public void run() {
        try {
            String msg;
            while ((msg = bufferedReader.readLine()) != null) {
                if (msg.equalsIgnoreCase( "exit")) {
                    break;
                }
                for (Client client : clientsArrayList) {
                    client.writer.println(msg);
                }
            }
        } catch (Exception e) {
            // e.printStackTrace();
        }
        finally {
            try {
                bufferedReader.close();
                writer.close();
                socket.close();
            } catch (IOException e) {
                // e.printStackTrace();
            }
        }
    }

}
