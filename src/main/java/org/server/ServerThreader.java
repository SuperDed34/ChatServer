package org.server;

import org.objects.Message;

import java.io.*;
import java.net.Socket;

public class ServerThreader extends Thread{
    private Socket client;
    private BufferedReader in;
    private BufferedWriter out;

    public ServerThreader(Socket client) throws IOException{
        this.client = client;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        start();
    }

    @Override
    public void run() {
        Message msg = new Message();
        while (true){
            try {
                System.out.println(msg.getTechFormattedMessage(in.readLine()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
