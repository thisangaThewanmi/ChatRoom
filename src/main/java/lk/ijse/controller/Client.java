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


}
