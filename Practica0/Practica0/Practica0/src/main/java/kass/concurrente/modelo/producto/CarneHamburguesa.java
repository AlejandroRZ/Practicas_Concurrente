package kass.concurrente.modelo.producto;

/**
* Clase que modela una pieza de carne para hamburguesa.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class CarneHamburguesa extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una sola pieza de carne
   * con un precio base. 
   **/ 
   public CarneHamburguesa(){
      super.nombre = "Carne para hamburguesa";
      super.precio = 10.0;
      super.cantidad = 1;
   }        

}