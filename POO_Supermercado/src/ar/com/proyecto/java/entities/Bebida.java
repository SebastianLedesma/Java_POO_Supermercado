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
//Clase que hereda de Producto.
public class Bebida extends Producto{
    
    //Atributo
    private double cantLitros;

    /**
     * Constructor que instancia la clase Bebida.
     * @param nombre Nombre de la bebida.Puede ser una marca.
     * @param cantLitros Cantidad de contenido de la bebida.
     * @param precio Precio de la bebida.
     */
    public Bebida(String nombre, double cantLitros, double precio) {
        super(nombre, precio);
        this.cantLitros = cantLitros;
    }

    /**
     * Getter del atributo cantLitros
     * @return Cantidad de litros de la bebida.
     */
    public double getCantLitros() {
        return cantLitros;
    }

    /**
     * Sobreescritura del toString que retorna el estado de la bebida.
     * @return Cadena de caracteres con los valores de los atributos de la bebida.
     */
    @Override
    public String toString() {
        return "Nombre: "+this.getNombre()+" /// Litros: "+this.cantLitros+" /// "+super.toString();
    }
    
}
