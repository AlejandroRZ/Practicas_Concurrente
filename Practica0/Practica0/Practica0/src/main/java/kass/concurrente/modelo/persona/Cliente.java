package kass.concurrente.modelo.persona;

/**
* Clase que modela a un cliente de la cafetería.
* @author Kassandra Mirael.
* @author Alejandro Rivera.
* @version 1.1
*/
public class Cliente extends Persona{    
    private Double saldo;

    /**
    * Constructor completo para crear un cliente.
    * @param name cadena con el nombre del chef.
    * @param saldo cantidad de puma dolares cons los que cuenta el cliente.
    **/
    public Cliente(String nombre, Double saldo){
        super.nombre = nombre;
        this.saldo = saldo;
    }
    
    /**
    * Método para obtener el saldo del cleinte. 
    * @return objeto Double con la cantidad de puma dolares en la cartera del cliente.
    **/
    public Double getSaldo(){
        return saldo;
    }

    /**
    * Método para ajustar el saldo del cleinte. 
    * @param nuevoSaldo objeto Double con la cantidad nueva de puma dolares en la cartera del cliente.
    **/
    public void setSaldo(Double nuevoSaldo){
        saldo = nuevoSaldo;
    }
}