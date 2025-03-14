package kass.concurrente.modelo.producto;
/**
* Clase que modela una hoja de lechuga pequeña.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
**/
public class HojitaLechuga extends ProductoInventario{ 

   /**
   * Constructor vacío, inicializa una hoja de lechuga
   * con un precio base. 
   **/ 
    public HojitaLechuga(){
       super.nombre = "Hoja de lechuga pequeña";
       super.precio = 2.0;
       super.cantidad = 1;
    }        

}