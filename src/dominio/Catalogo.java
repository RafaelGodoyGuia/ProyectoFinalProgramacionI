package dominio;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Clase que representa un catálogo de productos.
 */
public class Catalogo implements Serializable {
    //Atributos
    /**
     * Lista de productos en el catálogo.
     */
    private ArrayList<Producto> productos;

    /**
     * Constructor por defecto que inicializa el catálogo con una lista vacía de productos.
     */
    public Catalogo () {
        this.productos = new ArrayList<>();
    }

    /**
     * Constructor que inicializa el catálogo con una lista de productos proporcionada.
     * @param productos La lista de productos con la que se inicializará el catálogo.
     */
    public Catalogo (ArrayList<Producto> productos) {
        this.productos = productos;
    }
    //Constructores

    //Métodos
        //Setters
    /**
     * Establece la lista de productos del catálogo.
     * @param productos La lista de productos a establecer.
     */
    public void setCatalogo (ArrayList<Producto> productos) {
        this.productos = productos;
    }
    //Getters
    /**
     * Obtiene la lista de productos del catálogo.
     * @return La lista de productos.
     */
    public ArrayList<Producto> getProductos () {
        return (this.productos);
    }
    /**
     * Obtiene la lista de productos del catálogo.
     * @return La lista de productos.
     */
    /**
     * Añade un producto al catálogo.
     * @param producto El producto a añadir.
     */
    public void add (Producto producto) {
        productos.add(producto);
    }
}
