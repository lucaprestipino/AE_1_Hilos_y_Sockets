package cliente;

import java.io.*;
import java.net.*;

public class ClienteSocket {
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ClienteSocket(String host, int port) {
        try {
            // Crea una nueva conexión de socket al host y puerto dados
            socket = new Socket(host, port);

            // Crea un ObjectOutputStream en el socket
            out = new ObjectOutputStream(socket.getOutputStream());

            // Crea un ObjectInputStream en el socket
            in = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendObject(Object obj) {
        try {
            // Escribe un objeto en el ObjectOutputStream
            out.writeObject(obj);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Object receiveObject() {
        try {
            // Lee un objeto del ObjectInputStream
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void close() {
        try {
            if (socket != null) {
                socket.close(); // Cierra el socket
            }
            if (in != null) {
                in.close(); // Cierra el flujo de entrada
            }
            if (out != null) {
                out.close(); // Cierra el flujo de salida
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
