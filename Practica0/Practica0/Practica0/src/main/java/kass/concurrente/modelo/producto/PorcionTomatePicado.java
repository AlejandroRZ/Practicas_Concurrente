package kass.concurrente.modelo.producto;

/**
* Clase que modela una porción jitomate en cuadros.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class PorcionTomatePicado extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una porcion
   * de tomate picado. 
   **/ 
   public PorcionTomatePicado(){
      super.nombre = "Porcion de cubitos de tomate";
      super.precio = 1.0;
      super.cantidad = 1;
   }        

}