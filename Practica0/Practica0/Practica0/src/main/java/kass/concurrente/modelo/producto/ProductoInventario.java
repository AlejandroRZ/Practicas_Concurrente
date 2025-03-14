package kass.concurrente.modelo.producto;

/**
 * Clase que modela un producto de un inventario.
 * @author Kassandra Mirael.
 * @author Alejandro Rivera.
 * @version 1.1
 */
public class ProductoInventario extends Producto{
    protected Integer cantidad;               

    /**
    * Constructor parcial, inicializa solo el nombre y el precio individual del producto.   
    * @param nombre cadena que nos indica el nombre.
    * @param precio objeto tipo Double que nos indica el precio individual del producto.
    **/
    public ProductoInventario(String nombre,Double precio){
        super.nombre = nombre;
        super.precio = precio;
        cantidad = 1;        
    }

    /**
    * Constructor completo.   
    * @param nombre cadena que nos indica el nombre.
    * @param precio objeto tipo Double que nos indica el precio individual del producto.
    * @param cantidad objeto tipo Integer que nos indica el número de piezas disponibles en inventario.
    **/
    public ProductoInventario(String nombre,Double precio, Integer cantidad){
        super.nombre = nombre;
        super.precio = precio;
        this.cantidad = cantidad;        
    }

    /**  Constructor vacio.
    * Inicializa un producto fantasma(con atributos "cero").
    **/
    public ProductoInventario(){
        super.nombre = "";
        super.precio = 0.0;
        cantidad = 1;        
    }

    /**
    * Método para obtener el número de piezas del producto en el inventario.
    * @return un objeto Integer con la cantidad de complementos.
    **/
    public Integer getCantidad(){
    	return cantidad;
    }     

    /**
    * Método para obtener el número de piezas del producto en el inventario.
    * @param nuevaCantidad objeto Integer con la nueva cantidad de unidades del producto.
    **/
    public void setCantidad(Integer nuevaCantidad){
    	cantidad = nuevaCantidad;
    }      

    /**
    * Método para obtener el nombre del producto.
    * @return una cadena con el nombre asignado al producto.
    **/ 
    public String getNombre(){
        return nombre;
    }

    /**
    * Este método calcula el precio sobre el precio de los items, 
    * se obtiene al multiplicar la cantidad de unidades por el precio individual.
    * @return El precio del total de unidades del producto.
    **/
    public Double calculaPrecio(){
        return cantidad*(super.precio);
    }  
    

}
