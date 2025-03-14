package kass.concurrente.modelo.producto;

/**
* Clase que modela una pieza de pan para hotdog.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class MediaNoche extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola pieza de pan
   * con un precio base. 
   **/ 
   public MediaNoche(){
      super.nombre = "Pan para hotdog";
      super.precio = 4.0;
      super.cantidad = 1;
   }        

}