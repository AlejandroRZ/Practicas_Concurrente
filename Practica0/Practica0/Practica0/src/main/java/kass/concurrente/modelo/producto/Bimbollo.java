package kass.concurrente.modelo.producto;

/**
* Clase que modela un pan para hamburguesa.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class Bimbollo extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola pieza de pan
   * con un precio base. 
   **/ 
   public Bimbollo(){
      super.nombre = "Bimbollo";
      super.precio = 5.0;
      super.cantidad = 1;
   }        

}