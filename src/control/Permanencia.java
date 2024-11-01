package control;

import dominio.Producto;

import java.io.*;
import java.util.ArrayList;

/**
 * Clase que gestiona la persistencia de los datos del catálogo de productos.
 */
public class Permanencia implements Serializable {
//Métodos
    /**
     * Escribe en un archivo la lista de productos serializada.
     * @param productos La lista de productos a serializar.
     * @param nombreArchivo El nombre del archivo donde se guardarán los datos.
     */
    public static void escribir (ArrayList<Producto> productos, String nombreArchivo) {
        try (FileOutputStream archivoSalida = new FileOutputStream(nombreArchivo);
             ObjectOutputStream salida = new ObjectOutputStream(archivoSalida)) {
            salida.writeObject(productos);
            System.out.println("Gestor serializado y guardado en " + nombreArchivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Lee de un archivo la lista de productos serializada.
     * @param nombreArchivo El nombre del archivo de donde se leerán los datos.
     * @return La lista de productos deserializada.
     */
    public static ArrayList<Producto> leer (String nombreArchivo) {
        ArrayList<Producto> productos = new ArrayList<>();
        try (FileInputStream entradaArchivo = new FileInputStream(nombreArchivo);
             ObjectInputStream entrada = new ObjectInputStream(entradaArchivo)) {
            productos = (ArrayList<Producto>) entrada.readObject();
    } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (productos);
    }
}
