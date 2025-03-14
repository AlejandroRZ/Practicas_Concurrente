package kass.concurrente;

import java.util.ArrayList;
import kass.concurrente.modelo.cuchillo.CuchilloBasico;
import kass.concurrente.modelo.cuchillo.CuchilloPremium;
import kass.concurrente.modelo.persona.Chef;
import kass.concurrente.modelo.persona.Cliente;
import kass.concurrente.modelo.producto.Producto;
import kass.concurrente.modelo.producto.ProductoExtra;
import kass.concurrente.modelo.producto.ProductoInventario;
import kass.concurrente.modelo.producto.Platillo;
import kass.concurrente.modelo.producto.CarneHamburguesa;
import kass.concurrente.modelo.producto.Salchicha;
import kass.concurrente.modelo.producto.Bimbollo;
import kass.concurrente.modelo.producto.HojitaLechuga;
import kass.concurrente.modelo.producto.MediaNoche;
import kass.concurrente.modelo.producto.PorcionCebollaPicada;
import kass.concurrente.modelo.producto.PorcionTomatePicado;
import kass.concurrente.modelo.producto.PorcionSalsa;
import kass.concurrente.modelo.producto.RebanadaCebolla;
import kass.concurrente.modelo.producto.RebanadaTomate;
import kass.concurrente.modelo.producto.Tocino;
import kass.concurrente.modelo.producto.Jamon;
import kass.concurrente.modelo.producto.Queso;
import kass.concurrente.modelo.producto.CondimentosEspeciales;
import kass.concurrente.modelo.producto.Hamburguesa;
import kass.concurrente.modelo.producto.HotDog;

/**
 * Clase Main.
 * Simulación de una serie de ventas en la cafeteria y su corte de caja. 
 * @author Kassandra Mirael
 * @author Alejandro Rivera
 * @version 1.1
 */
public class Main {

    private static final Integer tiempoEspera = 5000;

    
    public static void main(String[] args) {

        //Inicia la creación y llenado del inventario.
        CarneHamburguesa carneHamb = new CarneHamburguesa();
        carneHamb.setCantidad(10);
        Salchicha salchicha = new Salchicha();
        salchicha.setCantidad(10);
        Bimbollo panHamburguesa = new Bimbollo();
        panHamburguesa.setCantidad(10);
        HojitaLechuga lechuga = new HojitaLechuga();
        lechuga.setCantidad(10);
        MediaNoche panHotDog = new MediaNoche();
        panHotDog.setCantidad(10);
        PorcionCebollaPicada cebollaPicada = new PorcionCebollaPicada();
        cebollaPicada.setCantidad(10);
        PorcionTomatePicado tomatePicado = new PorcionTomatePicado();
        tomatePicado.setCantidad(10);
        PorcionSalsa salsa = new PorcionSalsa();
        salsa.setCantidad(10);
        RebanadaCebolla cebollaRebanada = new RebanadaCebolla();
        cebollaRebanada.setCantidad(10);
        RebanadaTomate tomateRebanada = new RebanadaTomate();
        tomateRebanada.setCantidad(10);
        Tocino tocino = new Tocino(new Producto());
        tocino.setCantidad(10);
        Jamon jamon = new Jamon(new Producto());
        jamon.setCantidad(10);
        Queso queso = new Queso(new Producto());
        queso.setCantidad(10);
        CondimentosEspeciales condiEspe = new CondimentosEspeciales(new Producto());
        condiEspe.setCantidad(10);

        //Inventario de productos básicos.
        ArrayList<ProductoInventario> inventarioBasicos = new ArrayList<ProductoInventario>();
        inventarioBasicos.add(carneHamb);
        inventarioBasicos.add(salchicha);
        inventarioBasicos.add(panHamburguesa);
        inventarioBasicos.add(lechuga);
        inventarioBasicos.add(panHotDog);
        inventarioBasicos.add(cebollaPicada);
        inventarioBasicos.add(tomatePicado);
        inventarioBasicos.add(salsa);
        inventarioBasicos.add(cebollaRebanada);
        inventarioBasicos.add(tomateRebanada);

        //Inventario de complementos.
        ArrayList<ProductoExtra> inventarioExtras = new ArrayList<ProductoExtra>();
        inventarioExtras.add(tocino);
        inventarioExtras.add(jamon);
        inventarioExtras.add(queso);
        inventarioExtras.add(condiEspe);     

        //Creación del chef con un cuchillo estándar.
        CuchilloBasico cuchilloSimple = new CuchilloBasico();        
        Chef cocinero = new Chef("Gordon Ramsay", 20, cuchilloSimple);
        Hamburguesa hamburPrueba = new Hamburguesa();
        HotDog perroPrueba = new HotDog();

        //Construcción de un menú para visualizar los productos del inventario y sus precios.

        String listaPrecios = "Básico                 Precio ";
        for (int i = 0; i<inventarioBasicos.size(); i++){
            String producto = inventarioBasicos.get(i).getNombre();
            String precioso = inventarioBasicos.get(i).getPrecio().toString();
            listaPrecios = listaPrecios + "\n" +  producto + "                 " + precioso;
        }

        String complementos = "Complemento                 Precio";
        for (int i = 0; i<inventarioExtras.size(); i++){
            String producto = inventarioExtras.get(i).getNombre();
            String precioso = inventarioExtras.get(i).getPrecio().toString();
            complementos = complementos + "\n" +  producto + "                 " + precioso;
        }


        System.out.println("\nBienvenidos al restaurante Diamond dogs" + "\n"
                            + "\nDe momento contamos con Hamburguesas y Hot Dogs "
                            + "\nCosto de una hamburguesa básica: "+hamburPrueba.calculaPrecio()
                            + "\nCosto de un hotdog básico: "+perroPrueba.calculaPrecio() + "\n"
                            + "\nSe les pueden añadir los siguientes complementos: " + "\n"
                            + "\n" + complementos + "\n"
                            + "\nTambién vendemos nuestros ingredientes a granel (básicos y complementos): " + "\n"
                            + "\n" + listaPrecios);

        //Creación de los clientes
        Cliente juanito = new Cliente("Juanito", 1000.0);
        Cliente pedrito = new Cliente("Pedrito", 1000.0);
        Cliente luisito = new Cliente("Luisito", 1000.0);
        System.out.println("\nSe han presentado 3 clientes en la cafetería\n");

        //Pedido de juanito
        Hamburguesa hamburgruesa = new Hamburguesa();
        HotDog hotdoge = new HotDog();
        HotDog hotdoge2 = new HotDog();
        ArrayList<Producto> orden1 = new ArrayList<Producto>();
        orden1.add(hamburgruesa);
        orden1.add(hotdoge);
        orden1.add(hotdoge2);

        //Pedido de pedrito
        HojitaLechuga lechugubas = new HojitaLechuga();
        lechugubas.setCantidad(10);
        CarneHamburguesa carnecitas = new CarneHamburguesa();
        carnecitas.setCantidad(12);
        ArrayList<Producto> orden2 = new ArrayList<Producto>();
        orden2.add(lechugubas);
        orden2.add(carnecitas);

        //Pedido de luisito    
        Hamburguesa hamburguesaEspecial = new Hamburguesa();
        Tocino tocinin = new Tocino(hamburguesaEspecial);
        Jamon jamoncito = new Jamon(tocinin);
        Queso quecho = new Queso(jamoncito);
        CondimentosEspeciales superHamburguesa = new CondimentosEspeciales(quecho);
        ArrayList<Producto> orden3 = new ArrayList<Producto>();
        orden3.add(superHamburguesa);
            
        //Visualización de las 3 ordenes.
        String listaOrden1 = "\n" + juanito.getNombre() + "\n" +
                             (orden1.get(0).getNombre() + "              " + "1" + "\n"
                             + orden1.get(1).getNombre() + "              " + "2");

        String listaOrden2 = "\n" + pedrito.getNombre() + "\n" +
                             (orden2.get(0).getNombre() + "              " + 
                             ((ProductoInventario)orden2.get(0)).getCantidad() 
                             + "\n" + orden2.get(1).getNombre() + "              " + 
                             ((ProductoInventario)orden2.get(1)).getCantidad());

        String listaOrden3 = "\n" + luisito.getNombre() + "\n" +
                             orden3.get(0).getNombre() + "              " + "1";
        

        System.out.println("\nSus ordenes son:\n" + listaOrden1 + "\n" + listaOrden2 + "\n"
                           + listaOrden3 + "\n");                            
        
        //El chef comienza a atender a los clientes.


        //Se surte el primer pedido.
        Integer tiempoOrd1 = ((Platillo)orden1.get(0)).getTiempoCoccion() + 
                             ((Platillo)orden1.get(1)).getTiempoCoccion()*2;
        Float porcentajeOrd1 = ((tiempoOrd1 / 100.0f) * cocinero.getCuchillo().corta());
        tiempoOrd1 = (int)(tiempoOrd1 - porcentajeOrd1);        
        
        System.out.println("El chef atendera a " + juanito.getNombre() + "\n" +
                          "Tiempo estimado de preparación: " + tiempoOrd1.toString() + " milisegundos");


        try { 
            inventarioBasicos.get(0).setCantidad(inventarioBasicos.get(0).getCantidad() -1);
            inventarioBasicos.get(2).setCantidad(inventarioBasicos.get(2).getCantidad() -1);
            inventarioBasicos.get(3).setCantidad(inventarioBasicos.get(3).getCantidad() -1);
            inventarioBasicos.get(7).setCantidad(inventarioBasicos.get(7).getCantidad() -1);
            inventarioBasicos.get(8).setCantidad(inventarioBasicos.get(8).getCantidad() -1);
            inventarioBasicos.get(9).setCantidad(inventarioBasicos.get(9).getCantidad() -1);
            inventarioBasicos.get(1).setCantidad(inventarioBasicos.get(1).getCantidad() -2);
            inventarioBasicos.get(4).setCantidad(inventarioBasicos.get(4).getCantidad() -2);
            inventarioBasicos.get(5).setCantidad(inventarioBasicos.get(5).getCantidad() -2);
            inventarioBasicos.get(6).setCantidad(inventarioBasicos.get(6).getCantidad() -2);
            inventarioBasicos.get(7).setCantidad(inventarioBasicos.get(7).getCantidad() -2);           
            Thread.sleep((long)tiempoOrd1);            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("¡Listo!");


        //Se surte el segundo pedido.

        Integer tiempoOrd2 = tiempoEspera;
        Float porcentajeOrd2 = ((tiempoOrd2 / 100.0f) * cocinero.getCuchillo().corta());
        tiempoOrd2 = (int)(tiempoOrd2 - porcentajeOrd2);

        System.out.println("El chef atendera a " + pedrito.getNombre() + "\n" +
                          "Tiempo estimado de preparación: " + tiempoOrd2.toString() + " mili segundos");


        try { 
            Integer faltantes1 = inventarioBasicos.get(3).getCantidad() 
                                 - ((ProductoInventario)orden2.get(0)).getCantidad();
            if(faltantes1 < 0){
                System.out.println("Falta " + orden2.get(0).getNombre() + " espera 5 segundos más");
                inventarioBasicos.get(3).setCantidad(10);
                System.out.println("Reabasteceremos nuestras existencias de " + orden2.get(0).getNombre());
                tiempoOrd2 += tiempoEspera;
            } 

            Integer faltantes2 = inventarioBasicos.get(0).getCantidad() 
                                 - ((ProductoInventario)orden2.get(1)).getCantidad();
            if(faltantes2 < 0){
                System.out.println("Falta " + orden2.get(1).getNombre() + " espera 5 segundos más");
                inventarioBasicos.get(0).setCantidad(10);
                System.out.println("Reabasteceremos nuestras existencias de " + orden2.get(1).getNombre());
                tiempoOrd2 += tiempoEspera;
            } 
            Thread.sleep((long)tiempoOrd2);            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("¡Listo!");

        //Se surte el tercer pedido.

        CuchilloPremium cuchilloGod = new CuchilloPremium();
        cocinero.setCuchillo(cuchilloGod);        
        Integer tiempoOrd3 = hamburguesaEspecial.getTiempoCoccion();
        Float porcentajeOrd3 = ((tiempoOrd3 / 100.0f) * cocinero.getCuchillo().corta());
        tiempoOrd3 = (int)(tiempoOrd3 - porcentajeOrd3);

        System.out.println("El chef atendera a " + luisito.getNombre() + "\n" +
                          "Tiempo estimado de preparación: " + tiempoOrd3.toString() + " mili segundos");


        try { 
            inventarioBasicos.get(0).setCantidad(inventarioBasicos.get(0).getCantidad() -1);
            inventarioBasicos.get(2).setCantidad(inventarioBasicos.get(2).getCantidad() -1);
            inventarioBasicos.get(3).setCantidad(inventarioBasicos.get(3).getCantidad() -1);
            inventarioBasicos.get(7).setCantidad(inventarioBasicos.get(7).getCantidad() -1);
            inventarioBasicos.get(8).setCantidad(inventarioBasicos.get(8).getCantidad() -1);
            inventarioBasicos.get(9).setCantidad(inventarioBasicos.get(9).getCantidad() -1);

            for(int i=0; i<inventarioExtras.size();i++){
                inventarioExtras.get(i).setCantidad(inventarioExtras.get(i).getCantidad() - 1);
            }       

            Thread.sleep((long)tiempoOrd3);            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("¡Listo!");

        Double ventaOrd1 = ((Platillo)orden1.get(0)).calculaPrecio() + ((Platillo)orden1.get(1)).calculaPrecio()*2;
        Double ventaOrd2 = ((ProductoInventario)orden2.get(0)).calculaPrecio() 
                           + ((ProductoInventario)orden2.get(1)).calculaPrecio();
        Double ventaOrd3 = ((ProductoExtra)orden3.get(0)).calculaPrecio();

        //Corte de caja.

        Double ventaTotal = ventaOrd1 + ventaOrd2 +ventaOrd3;
        System.out.println("------------------------------------Cierre de operaciones------------------------------------");
        System.out.println("Venta total del día: " + ventaTotal.toString());        

        String saldoBasicos = "Básico                 Cantidad ";
        for (int i = 0; i<inventarioBasicos.size(); i++){
            String producto = inventarioBasicos.get(i).getNombre();
            String cantidad = inventarioBasicos.get(i).getCantidad().toString();
            saldoBasicos = saldoBasicos + "\n" +  producto + "                 " + cantidad;
        }

        String saldoComplementos = "Complemento                 Cantidad";
        for (int i = 0; i<inventarioExtras.size(); i++){
            String producto = inventarioExtras.get(i).getNombre();
            String cantidad = inventarioExtras.get(i).getCantidad().toString();
            saldoComplementos = saldoComplementos + "\n" +  producto + "                 " + cantidad;
        }
        
        System.out.println("Saldo todal del inventario: " + "\n" +
                         saldoBasicos + "\n" + "\n" + saldoComplementos); 

        juanito.setSaldo(juanito.getSaldo() - ventaOrd1);
        pedrito.setSaldo(pedrito.getSaldo() - ventaOrd2);
        luisito.setSaldo(luisito.getSaldo() - ventaOrd3);        

    }
}