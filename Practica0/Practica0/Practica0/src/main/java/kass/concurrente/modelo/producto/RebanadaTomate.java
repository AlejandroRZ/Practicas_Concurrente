package kass.concurrente.modelo.producto;

/**
* Clase que modela una rebanada de jitomate.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class RebanadaTomate extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola rebanada de tomate saladette. 
   **/ 
   public RebanadaTomate(){
      super.nombre = "Rebanada de jitomate";
      super.precio = 1.0;
      super.cantidad = 1;
   }        

}