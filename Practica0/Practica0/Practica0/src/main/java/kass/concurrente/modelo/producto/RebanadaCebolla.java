package kass.concurrente.modelo.producto;

/**
* Clase que modela una rebanada de cebolla.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class RebanadaCebolla extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola rebanada de cebolla morada. 
   **/ 
   public RebanadaCebolla(){
      super.nombre = "Rebanada de cebolla";
      super.precio = 1.0;
      super.cantidad = 1;
   }        

}