package servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import objeto.VideoTeca;


public class Hilo implements Runnable {
    private Socket socket;

    public Hilo(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            String request = (String) in.readObject();

            // Process the request
            if (request.equals("Request for peliculas")) {
                VideoTeca listadoVideoTeca =  getPeliculas();

                // Send the response to the client
                ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
                out.writeObject(getPeliculas());
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private VideoTeca getPeliculas() {
        // Retrieve the Peliculas object from your database or other data source here
        return new VideoTeca();
    }
}