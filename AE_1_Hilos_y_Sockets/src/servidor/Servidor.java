import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import cliente.EntradaCliente;
import cliente.EntradaVentas;
import cliente.Login;
import cliente.LoginVentas;
import objeto.Clientes;
import objeto.DataRequest;
import objeto.VideoTeca; 
import objeto.DataRetriever; // Importa la clase DataRequest
import objeto.Empleados;

public class Servidor {
    private ServerSocket servidorSocket; 
    private Socket socket;
    private ObjectInputStream in;
    private ObjectOutputStream out;

    public Servidor() {
        try {
            servidorSocket = new ServerSocket(5000); // Crea un nuevo ServerSocket

            while (true) { 
                socket = servidorSocket.accept(); 

                out = new ObjectOutputStream(socket.getOutputStream());
                in = new ObjectInputStream(socket.getInputStream());

                Object receivedObject = in.readObject();

                if (receivedObject instanceof EntradaCliente) {
                    EntradaCliente entradaCliente = (EntradaCliente) receivedObject;
                    // Procesa el objeto EntradaCliente recibido...
                    // Envía una respuesta al cliente...
                    out.writeObject("EntradaCliente procesado");
                } else if (receivedObject instanceof EntradaVentas) {
                    EntradaVentas entradaventas = (EntradaVentas) receivedObject;
                    // Procesa el objeto EntradaVentas recibido...
                    // Envía una respuesta al cliente...
                    out.writeObject("EntradaVentas procesado");
                } else if (receivedObject instanceof Login) {
                    Login login = (Login) receivedObject;
                    // Procesa el objeto Login recibido...
                    // Envía una respuesta al cliente...
                    out.writeObject("Login procesado");
                } else if (receivedObject instanceof LoginVentas) {
                    LoginVentas loginVentas = (LoginVentas) receivedObject;
                    // Procesa el objeto LoginVentas recibido...
                    // Envía una respuesta al cliente...
                    out.writeObject("LoginVentas procesado");
                }
                    
                else if (receivedObject instanceof DataRequest) {
                    DataRequest dataRequest  = (DataRequest) receivedObject;
                    if (dataRequest.getRequestType().equals("VideoTeca")) {
                        ArrayList<VideoTeca> listaPeliculas = DataRetriever.getListaPeliculas();
                        out.writeObject(listaPeliculas);
                    }
                    // Maneja otros tipos de solicitudes...
                } else if (receivedObject instanceof DataRetriever) {
                    DataRequest dataRequest  = (DataRequest) receivedObject;
                    if (dataRequest.getRequestType().equals("VideoTeca")) {
                        ArrayList<VideoTeca> listaPeliculas = DataRetriever.getListaPeliculas();
                        out.writeObject(listaPeliculas);
                    } else if (dataRequest.getRequestType().equals("Clientes")) {
                        ArrayList<Clientes> listaClientes = DataRetriever.getListaClientes();
                        out.writeObject(listaClientes);
                    } else if (dataRequest.getRequestType().equals("Empleados")) {
                        ArrayList<Empleados> listaEmpleados = DataRetriever.getListaEmpleados();
                        out.writeObject(listaEmpleados);
                    }
                } else {
                    // Maneja un tipo de objeto inesperado
                    System.out.println("Recibió un objeto de tipo inesperado");
                }

                out.flush(); // Hace
