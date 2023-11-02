package servidor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorSocket {
    private ServerSocket serverSocket;
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public ServidorSocket(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void acceptConnection() throws IOException {
        socket = serverSocket.accept();
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
    }

    public Object readObject() throws IOException, ClassNotFoundException {
        return in.readObject();
    }

    public void writeObject(Object obj) throws IOException {
        out.writeObject(obj);
        out.flush(); // Make sure the response is sent
    }

    public void close() throws IOException {
        if (socket != null) {
            socket.close();
        }
        if (in != null) {
            in.close();
        }
        if (out != null) {
            out.close();
        }
    }
}
