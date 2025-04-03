// Write a program to implement a simple chat application using sockets.

import java.io.*;
import java.net.*;

public class lp89 {
    public static void main(String[] args) throws IOException {
        Socket socket = args.length == 0 ? new ServerSocket(5000).accept() : new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        new Thread(() -> in.lines().forEach(System.out::println)).start();
        new BufferedReader(new InputStreamReader(System.in)).lines().forEach(out::println);
        socket.close();
    }
}

// Output-:
// Hello, this is a message!