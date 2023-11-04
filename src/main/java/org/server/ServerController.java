package org.server;

import org.objects.Message;
import org.objects.User;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerController {
    private ServerSocket server = new ServerSocket(4040);
    private Socket client;
    private Message msg = new Message();
    private ArrayList<User> userList= new ArrayList<>();
    private ArrayList<ServerThreader> connectionList = new ArrayList<ServerThreader>();


    public ServerController() throws IOException {
        System.out.println(msg.getTechFormattedMessage("Server started"));
    }

    public void start() throws IOException {
        while (true){
            client = server.accept();
            System.out.println(msg.getTechFormattedMessage("User " + client.getInetAddress()+ "connected"));
            connectionList.add(new ServerThreader(client));
            userList.add(new User("test", client.getInetAddress(), "test"));
        }
    }

}
