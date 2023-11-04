package org.server;

import org.objects.Message;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerController {
    private ServerSocket server = new ServerSocket(4040);
    private Message msg = new Message();


    public ServerController() throws IOException {
        System.out.println(msg.getTechFormattedMessage("Server started"));
    }

    public void start() throws IOException {
        while (true){
            server.accept();

        }
    }

}
