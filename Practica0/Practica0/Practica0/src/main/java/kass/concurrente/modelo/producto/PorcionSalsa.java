package kass.concurrente.modelo.producto;

/**
* Clase que modela una porción de salsa de la casa.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class PorcionSalsa extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una porción
   * de salsa patentada por Snake. 
   **/ 
   public PorcionSalsa(){
      super.nombre = "Porcion de salsa de la casa";
      super.precio = 1.0;
      super.cantidad = 1;
   }        

}