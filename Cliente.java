package cliente;

import java.io.*;
import java.net.*;

import objeto.DataRequest;
import objeto.DataRetriever;

public class Cliente {
	private Socket socket;
	private ObjectInputStream in;
	private ObjectOutputStream out;
	

	public Cliente() {
		try {
			socket = new Socket("localhost", 5000); // Crea un nuevo socket

			out = new ObjectOutputStream(socket.getOutputStream());
			in = new ObjectInputStream(socket.getInputStream());

			DataRequest dataRequest = new DataRequest("VideoTeca"); // Crea una nueva solicitud de datos
			out.writeObject(dataRequest); // Envía la solicitud de datos al servidor
			out.flush(); // Limpia el flujo de salida

			DataRetriever listaPeliculas = (DataRetriever) in.readObject(); // Lee la lista de películas del servidor
			EntradaCliente entradaCliente = new EntradaCliente(listaPeliculas); // Crea una nueva entrada de cliente

			EntradaVentas entradaventas = new EntradaVentas(listaPeliculas); // Crea una nueva entrada de ventas
			Login login = new Login(); // Crea un nuevo inicio de sesión
			LoginVentas loginVentas = new LoginVentas(); // Crea un nuevo inicio de sesión de ventas

			synchronized (this) {
				out.writeObject(entradaCliente); // Envía la entrada del cliente al servidor
				System.out.println("Envió entradaCliente al servidor");

				out.writeObject(entradaventas); // Envía la entrada de ventas al servidor
				System.out.println("Envió entradaventas al servidor");

				out.writeObject(login); // Envía el inicio de sesión al servidor
				System.out.println("Envió login al servidor");

				out.writeObject(loginVentas); // Envía el inicio de sesión de ventas al servidor
				System.out.println("Envió loginVentas al servidor");

				out.flush(); // Limpia el flujo de salida

				notify(); // Notifica a cualquier hilo que esté esperando este objeto

				// Después de notificar al servidor...
				Object receivedObject = in.readObject(); // Lee el objeto recibido del servidor
				System.out.println("Recibió objeto del servidor");
				// Procesa el objeto recibido...
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
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
}
