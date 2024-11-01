package control;

import dominio.Producto;

import java.util.ArrayList;
import java.util.Scanner;
import dominio.Bien;
import dominio.Catalogo;
import dominio.Servicio;

/**
 * Clase que gestiona las operaciones sobre el catálogo de productos.
 */
public class Gestor{
//Métodos
    /**
     * Da de alta un bien en el catálogo.
     * @param catalogo El catálogo donde se añadirá el bien.
     */
    public static void altaBien (Catalogo catalogo) {
        Bien bien = new Bien();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del bien: ");
        bien.setIdProducto(scanner.nextLine());
        System.out.print("Introduce el nombre del bien: ");
        bien.setNombre(scanner.nextLine());
        System.out.print("Introduce el precio del bien: ");
        bien.setPrecio(scanner.nextFloat());
        System.out.print("Introduce la cantidad: ");
        bien.setCantidad(scanner.nextInt());
        catalogo.add(bien);
    }
    /**
     * Da de alta un servicio en el catálogo.
     * @param catalogo El catálogo donde se añadirá el servicio.
     */
    public static void altaServicio (Catalogo catalogo) {
        Servicio servicio = new Servicio();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el ID del servicio: ");
        servicio.setIdProducto(scanner.nextLine());
        System.out.print("Introduce el nombre del servicio: ");
        servicio.setNombre(scanner.nextLine());
        System.out.print("Introduce el precio del servicio: ");
        servicio.setPrecio(scanner.nextFloat());
        System.out.print("Introduce el tiempo del servicio: ");
        servicio.setTiempo(scanner.nextInt());
        catalogo.add(servicio);
    }

    /**
     * Da de baja un producto del catálogo.
     * Actualmente, esta funcionalidad no está implementada.
     */
    public static void baja () {
        System.out.println("Funcionalidad por implementar");

    }

    /**
     * Modifica un producto en el catálogo.
     * Actualmente, esta funcionalidad no está implementada.
     * @param idProducto El ID del producto a modificar.
     */
    public static void modificar (String idProducto) {
        System.out.println("Funcionalidad por implementar");
    }

    /**
     * Muestra todos los productos del catálogo.
     * @param catalogo El catálogo cuyos productos se mostrarán.
     */
    public static void mostrar (Catalogo catalogo) {
        System.out.println("Catálogo de productos\n---------------------");
        for (Producto producto : catalogo.getProductos()) {
            System.out.println(producto.toString());
        }
    }

}
