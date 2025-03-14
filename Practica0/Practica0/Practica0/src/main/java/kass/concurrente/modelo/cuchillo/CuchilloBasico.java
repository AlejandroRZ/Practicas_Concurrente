package kass.concurrente.modelo.cuchillo;

/**
* Clase que define un cuchillo básico comprado en tienda UNAM.
* Sólo acelera la producción en un 1%.
* @author Alejandro Rivera
* @version 1.0
*/
public class CuchilloBasico implements Cuchillo{

    /**
    * Método que permite acelerar la producción de alimentos.
    * @return El tiempo que reduce al usar dicho item (porcentaje del total).
    */
    public Integer corta(){
        return 1;
    }
}
