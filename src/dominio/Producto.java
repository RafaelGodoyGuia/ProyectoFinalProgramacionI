package dominio;

import java.io.Serializable;

/**
 * Clase que representa un producto.
 */
public class Producto implements Serializable {
    //Atributos
    /**
     * ID del producto.
     */
    private String idProducto;

    /**
     * Nombre del producto.
     */
    private String nombre;

    /**
     * Precio del producto.
     */
    private float precio;

    //Constructores
    /**
     * Constructor por defecto.
     */
    public Producto () {}

    /**
     * Constructor con parámetros.
     * @param idProducto ID del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public Producto (String idProducto, String nombre, float precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
    //Métodos
        //Getters
            //Atributos
    /**
     * Obtiene el ID del producto.
     * @return ID del producto.
     */
    public String getIdProducto () {
        return (this.idProducto);
    }

    /**
     * Obtiene el nombre del producto.
     * @return Nombre del producto.
     */
    public String getNombre () {
        return (this.nombre);
    }

    /**
     * Obtiene el precio del producto.
     * @return Precio del producto.
     */
    public float getPrecio () {
        return (this.precio);
    }
        //Setters
            //Objeto
    /**
     * Establece los atributos del producto.
     * @param idProducto ID del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     */
    public void setProducto (String idProducto, String nombre, float precio) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }
            //Atributos
    /**
     * Establece el ID del producto.
     * @param idProducto ID del producto.
     */
    public void setIdProducto (String idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * Establece el nombre del producto.
     * @param nombre Nombre del producto.
     */
    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el precio del producto.
     * @param precio Precio del producto.
     */
    public void setPrecio (Float precio) {
        this.precio = precio;
    }
}
