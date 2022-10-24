package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    private static final int PORT = 8080;
    private static final String localHost = "127.0.0.1";

    public static void main(String[] args) {
        try (Socket clientSocket = new Socket(localHost, PORT);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);//поток вывода
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) //поток ввода
        {
            out.println();
            System.out.println(in.readLine());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
