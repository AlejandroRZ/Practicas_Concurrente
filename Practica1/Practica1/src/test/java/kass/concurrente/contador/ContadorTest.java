package kass.concurrente.contador;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContadorTest {
    Thread[] hilos;
    Contador contador;

    @BeforeEach
    void setup(){
        contador = new Contador();
        hilos = new Thread[2];
        hilos[0] = new Thread(contador, "1"); //Le puse nombre a los hilos, a la grande le puse Cuca.
        hilos[1] = new Thread(contador, "2");
    }

    @Test
    void ContadorTest() throws InterruptedException{
        hilos[0].start();
        hilos[1].start();
        hilos[0].join();
        hilos[1].join();
        System.out.println("CONTADOR: " + contador.getValor());
        int cinco = cincoPorciento();
        assertTrue(contador.getValor() >= Contador.RONDAS*hilos.length - cinco && contador.getValor() <=  Contador.RONDAS*hilos.length + cinco);
    }

    /**
     * Metodo que calcula el 5 porciente
     * @return El 5 porciento del total
     */
    int cincoPorciento(){
        return (int) ((Contador.RONDAS*hilos.length)*.05);
    }
}
