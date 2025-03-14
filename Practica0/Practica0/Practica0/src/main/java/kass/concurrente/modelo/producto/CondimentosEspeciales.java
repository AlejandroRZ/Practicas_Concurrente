package kass.concurrente.modelo.producto;

/**
* Clase que modela condimentos que le darán mucho sabor a los platillos.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class CondimentosEspeciales extends ProductoExtra{ 

   /**
   * Constructor decorador.
   * @param prodContenido producto a ser complementado. 
   **/
   public CondimentosEspeciales(Producto prodContenido){
     super.nombre = "Condimentos finos";
     super.precio = 2.0;
     super.cantidad = 1;
     super.contenido = prodContenido;     
   }  

   /**
   * Método para obtener el nombre del producto.
   * @return una cadena con el nombre asignado al producto.
   **/ 
   public String getNombre(){
      return super.getNombre();
   }      

   /**
   * Este método decorador calcula el precio sobre el precio acumulado de los items.
   * @return El precio de la suma de cada item utilizado y del platillo base si lo hay.
   **/
   public Double calculaPrecio(){
      return super.calculaPrecio();
   }

   /**
   * Método para obtener la cantidad de productos especiales modelados por el objeto.
   * @return un objeto Integer con la cantidad de complementos.
   **/
   public Integer getCantidad(){
      return super.getCantidad();
   }     

   /**
   * Método para ajustar la cantidad de productos especiales modelados por el objeto.
   * @param nuevaCantidad un objeto Integer con la nueva cantidad de complementos.
   **/
   public void setCantidad(Integer nuevaCantidad){
      super.setCantidad(nuevaCantidad);
   }  

   /**
   * Método para obtener al producto envuelto por el decorador.
   * @return el producto que es decorado.
   **/
   public Producto getContenido(){
     return super.getContenido();
   }  

   /**
   * Método para ajustar al producto envuelto por el decorador.
   * @param nuevoContenido el nuevo producto a decorar.
   **/
   public void setContenido(Producto nuevoContenido){
     super.setContenido(nuevoContenido);
   }    
   
}