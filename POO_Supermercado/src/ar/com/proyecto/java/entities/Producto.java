package ar.com.proyecto.java.entities;

import java.text.DecimalFormat;

/**
 * 
 * @author ricardo
 */

//Clase que no se puede instanciar.Se usa como clase base.Implementa la interface Comparable.
public abstract class Producto implements Comparable<Producto>{
    
    //Atributos
    private String nombre;
    private double precio;

    /**
     * Constructor para construir internamente un producto.
     * @param nombre Nombre del producto.Puede ser una marca.
     * @param precio Precio de producto.Puede tener centavos.
     */
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Getter del atributo nombre.
     * @return Nombre del producto.Puede ser la marca.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del atributo precio.
     * @return Precio del producto.Puede incluir centavos.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Implementación del método de la interface Comparable para establcer un 
     * criterio de orden de los productos. Se comparan los precios.
     * @param o Producto a comparar.
     * @return Resultado de la comparación entre Productos. La lógica aplicada hace que se
     * ordenen los productos en orden ascendente.
     */
    @Override
    public int compareTo(Producto o) {
        int respuesta;
        
        if (this.precio > o.precio) {
            respuesta= 1;
        }else if (this.precio < o.precio) {
            respuesta = -1;
        }else{
            respuesta=0;
        }
        return respuesta;
    }

    /**
     * Sobreescritura del toString para que retorne el precio de l producto.
     * Se aplica un formato para que no muestre los centavos si el valor es entero.
     * @return Cadena con el atributo precio formateado.
     */
    @Override
    public String toString() {
        DecimalFormat formato=new DecimalFormat("####.##");
        return "Precio: $"+formato.format(this.getPrecio());
    }
}
