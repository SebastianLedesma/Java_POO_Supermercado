/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.proyecto.java.entities;

/**
 *
 * @author ricardo
 */
//Clase que hereda de Producto
public class Fruta extends Producto{
    //Atributo de instancia
    private String unidadVenta;

    /**
     * Constructor para instanciar una Fruta.
     * @param nombre Nombre de la fruta.
     * @param precio Precio de la fruta.
     * @param unidadVenta Unidad de venta de la fruta:kilo,gramos,etc.
     */
    public Fruta(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    /**
     * Getter del atributo unidadVenta
     * @return Unidad de venta de la fruta.
     */
    public String getUnidadVenta() {
        return unidadVenta;
    }

    /**
     * Sobreescritura del toString que retorna el estado de la fruta.
     * @return Cadena de caracteres con el valor de los atributos de la fruta.
     */
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// "+super.toString()+" /// Unidad de venta: "+this.getUnidadVenta();
    }
}
