package principal;

import control.Permanencia;
import dominio.Catalogo;
import dominio.Producto;
import presentacion.Interfaz;
import java.io.File;
import java.util.ArrayList;

/**
 * Clase principal que inicia la aplicación
 */
public class Main {
    /**
     * Nombre del archivo donde se guardarán los datos serializados.
     */
    private static final String ARCHIVO_DATOS = "datos.ser";
    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de la línea de comandos.
     */

    public static void main(String[] args) {
        try {
            // Inicialización del catálogo
            Catalogo catalogo = new Catalogo();

            // Intentar cargar datos existentes
            File archivo = new File(ARCHIVO_DATOS);
            if (archivo.exists()) {
                try {
                    catalogo.setCatalogo(Permanencia.leer(ARCHIVO_DATOS));
                    System.out.println("Datos cargados correctamente");
                } catch (Exception e) {
                    System.out.println("Error al cargar los datos: " + e.getMessage());
                    System.out.println("Se iniciará con un catálogo vacío");
                }
            } else {
                System.out.println("No se encontró archivo de datos. Se iniciará con un catálogo vacío");
            }

            // Bucle principal
            boolean continuar;
            do {
                continuar = Interfaz.interfaz(catalogo);
            } while (continuar);

            // Guardar datos
            try {
                Permanencia.escribir(catalogo.getProductos(), ARCHIVO_DATOS);
                System.out.println("Datos guardados correctamente");
            } catch (Exception e) {
                System.out.println("Error al guardar los datos: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Error fatal en la aplicación: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
