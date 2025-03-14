package kass.concurrente.modelo.producto;
import java.util.ArrayList;

/**
* Clase que modela una hamburguesa.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class Hamburguesa extends Platillo{

    /**
    * Constructor vació que asigna un precio, un tiempo de cocción
    * un nombre y una lista de ingredientes al platillo. 
    **/ 
    public Hamburguesa(){
        ArrayList<Producto> ingredientes = new ArrayList<Producto>();
        ingredientes.add(new Bimbollo());
        ingredientes.add(new CarneHamburguesa());        
        ingredientes.add(new HojitaLechuga());
        ingredientes.add(new RebanadaTomate());
        ingredientes.add(new RebanadaCebolla());
        ingredientes.add(new PorcionSalsa());
        super.productosRequeridos = ingredientes;
        super.precio = super.calculaPrecio();
        super.tiempoCoccion = 25000;
        super.nombre = "Hamburguesa";       
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