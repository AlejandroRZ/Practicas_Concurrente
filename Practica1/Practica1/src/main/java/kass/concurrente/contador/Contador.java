package kass.concurrente.contador;

/**
 * Clase que implementa un contador utilizando hilos y sincronización.
 * Cada hilo incrementa el contador en su turno controlado por un mecanismo de permisos.
 * @author Alejandro Rivera
 * @version 1.0
 */

public class Contador implements Runnable {
    public static final int RONDAS = 10000;
    private int valor;
    private volatile boolean[] permisoHilos;

    /**
    * Constructor que inicializa el contador y el arreglo de permisos.
    * @param numHilos número de hilos que participarán en la operación.
    */
    public Contador(int numHilos) {
        this.valor = 0;
        this.permisoHilos = new boolean[numHilos];
        for (int i = 0; i < numHilos; i++) {
            permisoHilos[i] = (i == 0); 
        }
    }

    /**
    * Constructor por defecto que inicializa el contador y el arreglo de permisos con 2 hilos.
    */
    public Contador() {
        int numHilos = 2;
        this.valor = 0;
        this.permisoHilos = new boolean[numHilos];
        for (int i = 0; i < numHilos; i++) {
            permisoHilos[i] = (i == 0); 
        }
    }

    /**
     * Metodo que obtiene el valor.
     * @return el valor
     */
    public int getValor() {
        return valor;
    }

    /**
    * Metodo que asigna un nuevo valor.
    * @param valor el nuevo valor
    */
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        System.out.println("DENTRO RUN");
        suma();
    }

    /**
    * Método que realiza la operación de suma controlada por el mecanismo de permisos.
    */
    public void suma() {
        int numHilos = permisoHilos.length;
        int idHilo = Integer.parseInt(Thread.currentThread().getName());

        for (int i = 0; i < RONDAS; ++i) {
            try {
                Thread.sleep(1); // Simulación de una operación que requiere tiempo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            while (!permisoHilos[idHilo - 1]) {/*Esperando*/}

            valor += 1;

            // Actualiza los permisos para el próximo hilo
            permisoHilos[idHilo - 1] = false;
            permisoHilos[(idHilo % numHilos)] = true;
        }
    }

    /**
    * Método principal que crea, inicia y espera a que todos los hilos terminen.
    * Imprime el valor final del contador.    
    * @param args argumentos de línea de comandos (no utilizado en este caso).
    * @throws InterruptedException excepción lanzada en caso de interrupción durante la espera de los hilos.
    */
    public static void main(String[] args) throws InterruptedException {
        int numHilos = 3; 
        Contador c = new Contador(numHilos);

        Thread[] hilos = new Thread[numHilos];
        for (int i = 0; i < numHilos; i++) {
            hilos[i] = new Thread(c, String.valueOf(i + 1));
            hilos[i].start();
        }

        for (int i = 0; i < numHilos; i++) {
            hilos[i].join();
        }

        System.out.println("EL VALOR ES: " + c.getValor());
    }
}