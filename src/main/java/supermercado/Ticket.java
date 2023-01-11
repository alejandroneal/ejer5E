/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;

/**
 * Está clase deberá de tener fecha y una lista de todos los productos 
 * contenidos en la clase cinta
 * En el método toSrting debe aparecer los nombres, cantidades, ivas, precio sin iva
 * y la cantidad total ordenados de menor a mayor según su iva.
 * A su vez deberá aparecer la cantidad de productos según según su iva, el precio del conjunto sin
 * iva y el precio con iva
 */
public class Ticket {
    
    private LocalDate fechaGenerado;
    private Cinta cinta;

    public Ticket() {
    }

    public Ticket(Cinta cinta) {
        this.cinta = cinta;
    }

    public LocalDate getFechaGenerado() {
        return fechaGenerado;
    }
    
    public void mostrarTicket(){
        
        System.out.println("                          Supermercado Paqui");
        System.out.println("Fecha: " +  cinta.getFecha()); //fecha en la que se crea el ticket
        System.out.println("--------------------------------------------------------------------");
        System.out.println("Producto        Precio      Cantidad        IVA     Precio sin IVA");
        System.out.println("--------------------------------------------------------------------");
        
        //Bucle para ir mostrando los productos uno por uno 
        for (int i = 0; i < cinta.getNumeroProductos(); i++) {
            Producto auxProducto = cinta.mostrarProductos(i);
            double precioSinIva = auxProducto.precio() * auxProducto.cantidad();
            System.out.println(auxProducto.nombre() + "            " + auxProducto.precio() + "            " + auxProducto.cantidad() + "             "
            + auxProducto.iva() + "     " + precioSinIva);
        }
        
        System.out.println("--------------------------------------------------------------------");
        
        double precioConIva4 = cinta.precioConIva4(cinta.totalPrecioSinIva4());
        double precioConIva10 = cinta.precioConIva10(cinta.totalPrecioSinIva10());
        double precioConIva21 = cinta.precioConIva21(cinta.totalPrecioSinIva21());
        
        System.out.println("Nº prod. iva 4%: " + cinta.cantidadProductosIva4() + "  Precio sin IVA: " + cinta.totalPrecioSinIva4() + "   Precio con IVA: " + precioConIva4);
        System.out.println("Nº prod. iva 10%: " + cinta.cantidadProductosIva10() + "  Precio sin IVA: " + cinta.totalPrecioSinIva10() + "   Precio con IVA: " + precioConIva10);
        System.out.println("Nº prod. iva 21%: " + cinta.cantidadProductosIva21() + "  Precio sin IVA: " + cinta.totalPrecioSinIva21() + "   Precio con IVA: " + precioConIva21);
        System.out.println("--------------------------------------------------------------------");
        
        double precioTotal = cinta.precioTotal(precioConIva4, precioConIva10, precioConIva21);
        
        System.out.println("Total a pagar: " + precioTotal + " -- Gracias por su visita");
        System.out.println("--------------------------------------------------------------------");
    }
}
