package objeto;

import java.util.ArrayList;

public class DataRetriever {

    public static ArrayList<VideoTeca> getListaPeliculas() {
        return Tienda.listaPeliculas();
    }

    public static ArrayList<Clientes> getListaClientes() {
        return Tienda.listaClientes();
    }

    public static ArrayList<Empleados> getListaEmpleados() {
        return Tienda.listaEmpleados();
    }
}


