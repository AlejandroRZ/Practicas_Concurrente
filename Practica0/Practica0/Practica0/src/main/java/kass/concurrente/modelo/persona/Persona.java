package kass.concurrente.modelo.persona;

/**
 * Clase que modela una persona.
 * @author Kassandra Mirael.
 * @author Alejandro Rivera.
 * @version 1.1
 */
public class Persona {
    protected String nombre;

    /**
    * Método para obtener el nombre de la persona.
    * @return cadena con el nombre del individuo.
    **/
    public String getNombre(){
    	return nombre;
    }

    /**
    * Método para ajustar el nombre de la persona.
    * @param nuevoNombre cadena con el nuevo nombre del individuo.
    **/
    public void setNombre(String nuevoNombre){
    	nombre = nuevoNombre;
    }
}
