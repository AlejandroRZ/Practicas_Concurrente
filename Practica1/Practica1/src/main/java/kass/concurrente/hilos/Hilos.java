package kass.concurrente.hilos;

import java.util.ArrayList; 
import java.util.List;

public class Hilos implements Runnable {
    
    @Override
    public void run() { //Sobrescribimos el metodo run
        int a = 10;
        int b = 12;
        int ID = Integer.parseInt(Thread.currentThread().getName());
        if(ID == 1){
            System.out.println("Soy el hilo 1");
        }else{
            System.out.println("Hola soy el hilo: "+ Thread.currentThread().getName());//Pedimos el nombre del hilo pidiendo primero que se seleccione el Hilo
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Hilos h = new Hilos();//Se crea una instancia de la clase
        Thread t1 = new Thread(h,"1");//Creamos un hilo, le pasamos de parametro la instancia de la clase y un nombre
        Thread t2 = new Thread(h,"2");
        Thread t3 = new Thread(h,"25");
        Thread t4 = new Thread(h,"45");
        
        ArrayList<Thread> hilos = new ArrayList<Thread>();       //Estructura para guardar 10 hilos
        
        for(int i=0; i< 10; i++){
            hilos.add(new Thread(h, "" + (i + 3)));  //Creamos e iniciamos 10 hilos
            hilos.get(i).start();
        }       

        t1.start();t2.start();t3.start();t4.start(); //Se inicializan los hilos para comenzar su ejecucion

        t1.join();t2.join();t3.join();t4.join();//????
        for(int i=0; i<10; i++){
            hilos.get(i).join();    //"Cerramos" los 10 hilos que creamos
        }
    }
}
