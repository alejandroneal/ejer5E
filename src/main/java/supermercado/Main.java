/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 * 1ºCrear productos
 * 2ºCrear una caja con id a elección
 * 3ºAñadir a la cinta de la caja anteriormente creada los productos anteriores
 * 4ºGenerar un ticket con los productos e imprimirlo
 */
public class Main {
    public static void main(String[] args) {
        
        Producto champu = new Producto("champú", 3.5, 1, 21);
        Producto leche = new Producto("leche", 0.9, 2, 10);
        Producto natilla = new Producto("natilla", 3, 3, 4);
        Producto servilletas = new Producto("servilletas", 0.75, 2, 21);
        
        Cinta cinta = new Cinta();
        cinta.anadirProducto(leche);
        cinta.anadirProducto(natilla);
        cinta.anadirProducto(champu);
        cinta.anadirProducto(servilletas);
        
        Caja caja = new Caja(1, cinta);
        
        System.out.println(cinta);
        
//        System.out.println("Borrar un producto------------------------------------------------------------");
//        cinta.borrarProducto(leche);
//        System.out.println(cinta);
        
        System.out.println("Generar un ticket--------------------------------------------------------------");
        Ticket ticket = caja.generarTicket();
        ticket.mostrarTicket();
    }
}
