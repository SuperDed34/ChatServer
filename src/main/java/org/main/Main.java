package org.main;

import org.server.ServerController;

import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        ServerController serverController = new ServerController();
        serverController.start();
    }
}