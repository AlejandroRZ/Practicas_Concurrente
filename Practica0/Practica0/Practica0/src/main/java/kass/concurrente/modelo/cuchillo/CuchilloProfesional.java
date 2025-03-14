package kass.concurrente.modelo.cuchillo;

/**
* Clase que define un cuchillo de acero inoxidable de alta densidad
* que acelera la producción de alimentos en un 12%.
* @author Alejandro Rivera
* @version 1.0
*/
public class CuchilloProfesional implements Cuchillo{

    /**
    * Método que permite acelerar la producción de alimentos.
    * @return El tiempo que reduce al usar dicho item (porcentaje del total).
    */
    public Integer corta(){
        return 12;
    }
}
