package kass.concurrente.modelo.producto;
import java.util.ArrayList;

/**
* Clase que modela un platillo.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class Platillo extends Producto{    
    protected Integer tiempoCoccion;
    protected ArrayList<Producto> productosRequeridos;

    /**  Constructor vacio.
    * Inicializa un platillo fantasma(con atributos "cero").
    **/
    public Platillo(){
        super.nombre = "";
        super.precio = 0.0;        
        this.tiempoCoccion = 0;       
        this.productosRequeridos = new ArrayList<>();        
    }

    /**
    * Constructor completo.
    * @param ingredientes lista de productos que se emplearan en la elaboración del platillo.
    * @param precio objeto de tipo Double que nos indica cuantos pumadoalres cuesta el platillo.
    * @param tiempoCoccion objeto tipo Integer que nos indica los milisegundos que dura la preparación del platillo.
    * @param nombre cadena que nos indica el nombre.
    **/
    public Platillo(ArrayList<Producto> ingredientes, Double precio, Integer tiempoCoccion, String nombre){
        super.nombre = nombre;
        super.precio = precio;       
        this.productosRequeridos = ingredientes;                
        this.tiempoCoccion = tiempoCoccion;                
    }

    /**
    * Constructor parcial, inicializa todos los atributos del platillo en "ceros" salvo nombre y tiempo de cocción.   
    * @param nombre cadena que nos indica el nombre.
    * @param cookingTime objeto tipo Integer que nos indica los milisegundos que dura la preparación del platillo.
    **/
    public Platillo(String name, Integer cookingTime){
        super.nombre = name;
        super.precio = 0.0;        
        tiempoCoccion = cookingTime;
        productosRequeridos = new ArrayList<Producto>();
    }
    
    /**
    * Método para obtener el tiempo de cocción del platillo.
    * @return un dato Integer con el tiempo de cocción en milisegundos.
    **/
    public Integer getTiempoCoccion(){
        return tiempoCoccion;
    }

    /**
    * Método para ajustar el tiempo de cocción del platillo.
    * @param nuevoTiempo un objeto tipo Integer con el tiempo de cocción en milisegundos.
    **/
    public void setTiempoCoccion(Integer nuevoTiempo){
        tiempoCoccion = nuevoTiempo;
    }

    /**
    * Método para obtener la lista de ingredientes del platillo.
    * @return un ArrayList con los productos necesarios para preparar el platillo.
    **/
    public ArrayList<Producto> getProductosRequeridos(){
        return productosRequeridos;
    }

    /**
    * Método para ajustar la lista de ingredientes del platillo.
    * @param nuevosProductos ArrayList con los productos necesarios para preparar el platillo.
    **/
    public void setProductosRequeridos(ArrayList<Producto> nuevosProductos){
        productosRequeridos = nuevosProductos;
    }
   
    /**
    * Método para obtener el nombre del platillo.
    * @return una cadena con el nombre asignado al platillo.
    **/ 
    public String getNombre(){
        return super.nombre;
    }

    /**
    * Este metodo calcula el precio sobre el precio de los items, se ignora
    * el precio base.
    * @return El precio de la suma de cada item utilizado.
    **/
    public Double calculaPrecio(){
        Double precioTotal = 0.;
        for(int i=0; i< productosRequeridos.size(); i++){
            precioTotal += productosRequeridos.get(i).getPrecio();
        }
        return precioTotal;
    }


}
