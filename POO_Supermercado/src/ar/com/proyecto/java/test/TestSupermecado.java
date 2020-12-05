package ar.com.proyecto.java.test;

import ar.com.proyecto.java.entities.Bebida;
import ar.com.proyecto.java.entities.Cosmetico;
import ar.com.proyecto.java.entities.Fruta;
import ar.com.proyecto.java.entities.Producto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author ricardo
 */
public class TestSupermecado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciación de objetos.
        Bebida bebida1=new Bebida("Coca-Cola Zero", 1.5 , 20);
        Bebida bebida2=new Bebida("Coca Cola", 1.5 ,18);
        Cosmetico cosmetico=new Cosmetico("Shampoo Sedal", 500, 19);
        Fruta fruta = new Fruta("Frutilla", 64, "kilo");
        
        //Se instancia la clase para crear una lista que admite objetos de las
        //clases hijas de Producto
        List<Producto> listaProductos=new ArrayList();
        
        //Se agregan los productos a la lista.
        listaProductos.add(bebida1);
        listaProductos.add(bebida2);
        listaProductos.add(cosmetico);
        listaProductos.add(fruta);
        
        listaProductos.forEach(System.out::println);
        
        //Se invoca al método static sort que ordena la lista de productos.
        Collections.sort(listaProductos);
        System.out.println("===============================");
        //Se muestra el producto más caro habiendo ordenado la lista por precio.
        System.out.println("Producto más caro: "+listaProductos.get(listaProductos.size()-1).getNombre());
        //Se muestra el producto más barato de la lista de productos.
        System.out.println("Producto más barato: "+listaProductos.get(0).getNombre());

    }
    
}
