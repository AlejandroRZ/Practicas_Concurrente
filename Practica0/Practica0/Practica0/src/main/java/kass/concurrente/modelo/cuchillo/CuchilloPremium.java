package kass.concurrente.modelo.cuchillo;

/**
* Clase que define un cuchillo de adamantium que acelera
* la producción de alimentos en un 25%.
* @author Alejandro Rivera
* @version 1.0
*/
public class CuchilloPremium implements Cuchillo{

    /**
    * Método que permite acelerar la producción de alimentos.
    * @return El tiempo que reduce al usar dicho item (porcentaje del total).
    */
    public Integer corta(){
        return 25;
    }
}
