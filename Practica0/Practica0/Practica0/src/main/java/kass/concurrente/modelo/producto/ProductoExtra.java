package kass.concurrente.modelo.producto;

/**
* Clase abstracta a implementar por las clases que modelan un producto especial 
* para añadir como extra a los platillos. Dichos productos sirven como decoradores.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
*/
public abstract class ProductoExtra extends Producto{
    protected Integer cantidad;
    protected Producto contenido;    

    /**
    * Método para obtener la cantidad de productos especiales modelados por el objeto.
    * @return un objeto Integer con la cantidad de complementos.
    **/
    public Integer getCantidad(){
    	return cantidad;
    }     

    /**
    * Método para ajustar la cantidad de productos especiales modelados por el objeto.
    * @param nuevaCantidad un objeto Integer con la nueva cantidad de complementos.
    **/
    public void setCantidad(Integer nuevaCantidad){
    	cantidad = nuevaCantidad;
    }  

    /**
    * Método para obtener al producto envuelto por el decorador.
    * @return el producto que es decorado.
    **/
    public Producto getContenido(){
        return contenido;
    }  

    /**
    * Método para ajustar al producto envuelto por el decorador.
    * @param nuevoContenido el nuevo producto a decorar.
    **/
    public void setContenido(Producto nuevoContenido){
        contenido = nuevoContenido;
    } 

    /**
    * Método decorador para obtener el nombre del producto y del posible producto al que envuelve.
    * @return una cadena con el nombre compuesto del producto.
    **/ 
    public String getNombre(){
        return contenido.getNombre() + " + " + super.getNombre();
    }

    /**
    * Este metodo decorador calcula el precio sobre el precio acumulado de los items.
    * @return El precio de la suma de cada item utilizado y del platillo base si lo hay.
    **/
    public Double calculaPrecio(){
        return cantidad*(super.precio) + contenido.calculaPrecio();
    }


}
