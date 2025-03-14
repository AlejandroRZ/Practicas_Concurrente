package kass.concurrente.modelo.cuchillo;

/**
* Interfaz que simulara un cuchillo.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
*/
public interface Cuchillo {

    /**
    * Método que hace que cocine mas rapido al usar el cuchillo.
    * @return El tiempo que reduce al usar dicho item en milisegundos.
    */
    public Integer corta();
}
