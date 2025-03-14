package kass.concurrente.modelo.producto;
import java.util.ArrayList;

/**
* Clase que modela un hotdog.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class HotDog extends Platillo{ 

    /**
    * Constructor vació que asigna un precio, un tiempo de cocción
    * un nombre y una lista de ingredientes al platillo. 
    **/ 
    public HotDog(){
        ArrayList<Producto> ingredientes = new ArrayList<Producto>();
        ingredientes.add(new MediaNoche());
        ingredientes.add(new Salchicha());       
        ingredientes.add(new PorcionTomatePicado());
        ingredientes.add(new PorcionCebollaPicada());
        ingredientes.add(new PorcionSalsa());        
        super.productosRequeridos = ingredientes;
        super.precio = super.calculaPrecio();
        super.tiempoCoccion = 18000;
        super.nombre = "HotDog";          
    }       
    
    /**
    * Método para obtener el nombre del platillo.
    * @return una cadena con el nombre asignado al platillo.
    **/ 
    public String getNombre(){
        return super.getNombre();
    }

    /**
    * Este metodo calcula el precio sobre el precio de los items, se ignora
    * el precio base.
    * @return El precio de la suma de cada item utilizado.
    **/
    public Double calculaPrecio(){
        return super.calculaPrecio();
    }

}