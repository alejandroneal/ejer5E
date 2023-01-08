/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package supermercado;

/**
 *
 * @author Alejandro
 */
public record Producto(String nombre,double precio, int cantidad, int iva) {
    
    public int compareTo( Producto o ) {
        int byIva = Integer.compare(this.iva, o.iva);
        if ( byIva != 0 ) {
            return byIva;
        }
        if ( nombre == null ) {
            return o.nombre == null ? 0 : 1;
        }
        if ( o.nombre == null ) {
            return 1;
        }
        return nombre.compareToIgnoreCase(o.nombre);
    }
}
