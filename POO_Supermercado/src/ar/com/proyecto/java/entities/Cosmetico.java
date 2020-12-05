/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.proyecto.java.entities;

import java.text.DecimalFormat;

/**
 *
 * @author ricardo
 */
//Clase que hereda de Producto.
public class Cosmetico extends Producto{
    
    //Atributo
    private double contenidoMililitros;

    /**
     * Constructor para instanciar la clase Cosmetico.
     * @param nombre Nombre del cosmético.Puede ser la marca del producto.
     * @param contenidoMililitros Contenido del envase.
     * @param precio Precio del cosmético.
     */
    public Cosmetico(String nombre, double contenidoMililitros, double precio) {
        super(nombre, precio);
        this.contenidoMililitros = contenidoMililitros;
    }

    /**
     * Getter del atributo contenidoMlililitros.
     * @return Cantidad de mililitros del envase del cosmético.
     */
    public double getContenidoMililitros() {
        return contenidoMililitros;
    }

    /**
     * Sobreescritura del toString que retorna el estado del cosmético.
     * @return Cadena de caracteres con los valores de los atributos del cosmético.
     */
    @Override
    public String toString() {
        DecimalFormat formato=new DecimalFormat("####.##");
        return "Nombre: "+this.getNombre()+" /// "
                + "Contenido: "+formato.format(this.getContenidoMililitros())
                + "ml /// "+super.toString();
    }
}
