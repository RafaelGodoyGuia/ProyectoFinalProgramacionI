package dominio;

import java.io.Serializable;

/**
 * Clase que representa un bien, que es un tipo de producto.
 */
public class Bien extends Producto implements Serializable {
//Atributos
    /**
     * Cantidad del bien.
     */
    private int cantidad;

//Constructores

    /**
     * Constructor por defecto.
     */
    public Bien () {}

    /**
     * Constructor con parámetros.
     * @param idProducto ID del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad del bien.
     */
    public Bien (String idProducto, String nombre, float precio, int cantidad) {
        super (idProducto, nombre, precio);
        this.cantidad = cantidad;
    }
//Métodos
    //Getters
        //Atributos
    /**
     * Obtiene la cantidad del bien.
     * @return Cantidad del bien.
     */
    public int getCantidad () {
        return (this.cantidad);
    }
    //Setters
        //Objeto
    /**
     * Establece los atributos del bien.
     * @param idProducto ID del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param cantidad Cantidad del bien.
     */
    public void setBien (String idProducto, String nombre, float precio, int cantidad) {
        setProducto(idProducto, nombre, precio);
        this.cantidad = cantidad;
    }
    /**
     * Devuelve una representación en cadena del objeto Bien.
     * @return Una cadena que representa el bien.
     */
        //Atributos
    /**
     * Establece la cantidad del bien.
     * @param cantidad Cantidad del bien.
     */
    public void setCantidad (int cantidad) {
        this.cantidad = cantidad;
    }

    //toString
    @Override
    public String toString () {
        return ("ID: " + this.getIdProducto() + " Nombre: " + this.getNombre() + " Precio: " + this.getPrecio() + " Cantidad: " + this.cantidad);
    }
}
