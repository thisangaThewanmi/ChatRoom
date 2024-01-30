package lk.ijse.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerFormController {

    private static ArrayList<Client> clientsArrayList = new ArrayList<>();

    public static  void Server() throws IOException {
       ServerSocket serverSocket = new ServerSocket(5000);
       Socket socket;
       int count =1;
        System.out.println("Waiting fo the client");
        socket=serverSocket.accept();
        System.out.println("client"+1+"connected");
        Client client = new Client(socket,clientsArrayList);
        clientsArrayList.add(client);
       // client.start();
        count++;

    }
}
