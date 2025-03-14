package kass.concurrente.modelo.producto;

/**
* Clase que modela una salchicha para hotdog.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class Salchicha extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola salchicha
   * con un precio base. 
   **/ 
   public Salchicha(){
      super.nombre = "Salchicha";
      super.precio = 6.0;
      super.cantidad = 1;
   }        

}