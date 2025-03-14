package kass.concurrente.modelo.producto;

/**
* Clase que modela un producto.
* @author Kassandra Mirael
* @author Alejandro Rivera
*/
public class Producto {
    protected String nombre;
    protected Double precio;     
    
    /**  Constructor vacio.
    * Inicializa un producto fantasma(con atributos "cero").
    **/
    public Producto(){
        nombre = "";
        precio = 0.0;        
    }

    /**
    * Constructor completo.    
    * @param nombre cadena que nos indica el nombre.
    * @param precio objeto tipo double con el precio por unidad del producto.
    **/
    public Producto(String nombre, Double precio){
        this.nombre = nombre;
        this.precio = precio;        
    }       
    
    /**
    * Método para obtener el precio del producto.
    * @return un objeto Double con el precio individual asignado al producto.
    **/ 
    public Double getPrecio(){
    	return precio;
    }       

    /**
    * Método para obtener el precio del producto.
    * @param nuevoPrecio un objeto Double con el nuevo precio individual asignado al producto.
    **/ 
    public void setPrecio(Double nuevoPrecio){
        precio = nuevoPrecio;
    }

    /**
    * Método para obtener el nombre del producto.
    * @return una cadena con el nombre asignado al producto.
    **/ 
    public String getNombre(){
        return nombre;
    }

    /**
    * Este metodo calcula el precio sobre el precio individual del producto,
    * considerando su cantidad.
    * @return El precio de la suma de cada item utilizado.
    **/
    public Double calculaPrecio(){
        return precio;
    }   


}
