package kass.concurrente.modelo.persona;
import kass.concurrente.modelo.cuchillo.Cuchillo;

/**
* Clase que modela a un cocinero experto.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
*/
public class Chef extends Persona{
	private Cuchillo cuchillin;
	private Integer experiencia;

	/**
	* Constructor completo para crear un chef.
	* @param name cadena con el nombre del chef.
	* @param exp puntos de experiencia del chef.
	* @param cuch  cuchillo a emplear por el chef.
	**/
	public Chef(String name, Integer exp, Cuchillo cuch){
		nombre = name;		
		experiencia = exp;
		cuchillin = cuch;
	}

	/**
	* Método para obtener el cuchillo que se encuentra utilizando el chef. 
	* @return el cuchillo empleado por el chef.
	**/
	public Cuchillo getCuchillo(){
		return cuchillin;
	} 

	/**
	* Método para obtener los puntos de experiencia del chef. 
	* @return objeto Integer con los puntos de experiencia del chef.
	**/
	public Integer getExperiencia(){
		return experiencia;
	}

	/**
	* Método para cambiar el cuchillo que se encuentra utilizando el chef. 
	* @param navaja el nuevo cuchillo que será empleado por el chef.
	**/
	public void setCuchillo(Cuchillo navaja){
		cuchillin = navaja;
	}

	/**
	* Método para ajustar los puntos de experiencia del chef. 
	* @param nuevaExp objeto Integer con los nuevos puntos de experiencia del chef.
	**/
	public void setExperiencia(Integer nuevaExp){
		experiencia = nuevaExp;
	}

}
