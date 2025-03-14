package kass.concurrente.herencia;

/**
 * En esta clase, debes crear un contador extendiendo de la clase Thread
 * @author Kassandra Mirael
 * @version 1.1
 */
public class Hilos extends Thread {
    public static final Integer HILOS = 3;
    public static final Integer RONDAS = 10000;
    private static int contador = 0;
    private int id_hilo;

    /**
    * Constructor de la clase Hilos.
    * @param id Identificador único asignado al hilo.
    */
    public Hilos(int id) {
        id_hilo = id;
    }

    /**
    * Método para obtener el valor actual del contador.
    * @return valor actual del contador compartido.
    */
    public static int getContador() {
        return contador;
    }

    /**
    * Método run, implementado por la clase Thread. Se ejecuta al iniciar un hilo.
    */
    @Override
    public void run() {
        System.out.println("Hilo " + id_hilo + " corriendo");
        suma();
    }

    /**
    * Método que realiza la suma controlada por el hilo, mediante rondas de incremento y sincronización.
    */
    public void suma() {
        for (int i = 0; i < RONDAS; ++i) {
            try {
                Thread.sleep(1); // Simulación de una operación que requiere tiempo
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            
            // Sincronización para que cada hilo incremente el contador en su turno
            while (i % HILOS != id_hilo - 1) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException exception1) {
                    exception1.printStackTrace();
                }
            }

            contador += 1;

            // Cede el control del procesador a otros hilos
            Thread.yield();
        }
    }

    /**
    * Método principal que crea, inicia y espera a que todos los hilos terminen.
    * Imprime el valor final del contador.
    * 
    * @param args Argumentos de línea de comandos (no utilizado en este caso).
    * @throws InterruptedException Excepción lanzada en caso de interrupción durante la espera de los hilos.
    */
    public static void main(String[] args) throws InterruptedException {
        Hilos[] hilos = new Hilos[HILOS];
        for (int i = 0; i < HILOS; i++) {
            hilos[i] = new Hilos(i + 1);
            hilos[i].start();
        }

        for (int i = 0; i < HILOS; i++) {
            hilos[i].join();
        }

        System.out.println("El contador quedo en: " + getContador());
    }
}
