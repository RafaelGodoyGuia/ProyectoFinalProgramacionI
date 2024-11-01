package dominio;

import java.io.Serializable;

/**
 * Clase que representa un servicio, que es un tipo de producto.
 */
public class Servicio extends Producto implements Serializable {
    //Atributos
    /**
     * Tiempo del servicio.
     */
    private int tiempo;

    //Métodos
        //Getters
            //Atributos
    /**
     * Obtiene el tiempo del servicio.
     * @return Tiempo del servicio.
     */
    public int getTienpo () {
        return (this.tiempo);
    }
        //Setters
            //Objeto
    /**
     * Establece los atributos del servicio.
     * @param idProducto ID del producto.
     * @param nombre Nombre del producto.
     * @param precio Precio del producto.
     * @param tiempo Tiempo del servicio.
     */
    public void setServicio (String idProducto, String nombre, float precio, int tiempo) {
        setProducto(idProducto, nombre, precio);
        this.tiempo = tiempo;
    }
            //Atributos
    /**
     * Establece el tiempo del servicio.
     * @param tiempo Tiempo del servicio.
     */
    public void setTiempo (int tiempo) {
        this.tiempo = tiempo;
    }
                //toString
    @Override
    public String toString () {
        return ("ID: " + this.getIdProducto() + " Nombre: " + this.getNombre() + " Precio: " + this.getPrecio() + " Cantidad: " + this.tiempo);
    }

}
