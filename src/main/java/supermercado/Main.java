/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.Collections;

/**
 * 1ºCrear productos
 * 2ºCrear una caja con id a elección
 * 3ºAñadir a la cinta de la caja anteriormente creada los productos anteriores
 * 4ºGenerar un ticket con los productos e imprimirlo
 */
public class Main {
    public static void main(String[] args) {
        
        Cinta cinta = new Cinta();
        cinta.anadirProducto(new Producto("leche", 1, 2, 10));
        cinta.anadirProducto(new Producto("natilla", 3, 3, 4));
        cinta.anadirProducto(new Producto("champú", 3.5, 1, 21));
        cinta.anadirProducto(new Producto("servilletas", 0.75, 2, 21));
        cinta.anadirProducto(new Producto("patatas", 1.5, 2, 4));
        cinta.anadirProducto(new Producto("aguacate", 2.75, 3, 10));
        cinta.anadirProducto(new Producto("arroz", 0.99, 1, 4));
        
        System.out.println("Añadir productos-------------------------------------------------------------");
        Caja caja = new Caja(1, cinta);
        
        System.out.println(cinta);
        
        System.out.println("Borrar un produco------------------------------------------------------------");
        cinta.borrarProducto(new Producto("arroz", 0.99, 1, 4));
        System.out.println(cinta);
        
        System.out.println("¿La lista está vacía?: " + cinta.comprobarSiEstaVacia());
        System.out.println("");
        
        System.out.println("Generar un ticket--------------------------------------------------------------");
        Ticket ticket = caja.generarTicket();
        ticket.mostrarTicket();
    }
}
