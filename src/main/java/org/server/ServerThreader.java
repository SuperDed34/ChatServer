package org.server;

import org.objects.Message;
import java.io.*;
import java.net.Socket;

public class ServerThreader extends Thread{
    private Socket client;
    private BufferedReader in;
    private BufferedWriter out;
    private Message msg = new Message();

    public ServerThreader(Socket client) throws IOException{
        this.client = client;
        in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        out = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
        start();
    }

    @Override
    public void run() {
        Message msg = new Message();
        String inp;
        while (true){
            try {
                inp = msg.getTechFormattedMessage(in.readLine());
                System.out.println(inp);
                for(ServerThreader vr : ServerController.connectionList){
                    vr.send(inp);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private void send(String text) {
        try {
            out.write(msg.getFormattedMessage(text)+ "\n");
            out.flush();
        } catch (IOException ignored) {}
    }
}
