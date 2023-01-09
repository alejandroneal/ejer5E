/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Será la clase encargada de almacenar cada producto seleccionado
 * en una List
 * Se podrá añadir y quitar productos
 */
public class Cinta {
    
    private List<Producto> cinta;
    private LocalDate fecha = LocalDate.now();

    public Cinta() {
        this.cinta = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String tmp = "";
        for (Producto producto : this.cinta) {
            if (producto != null) {
                tmp += producto.toString() + "\n";
            }
        }
        return tmp;
    }
    
    public int getNumeroProductos() {
        return this.cinta.size();
    }
    
    public void anadirProducto(Producto producto){
        this.cinta.add(producto);                  
    }
    
    public int buscarProducto(Producto producto) {
        //Búsqueda secuencial
        for (int i = 0; i < this.cinta.size(); i++) {
            if (producto.equals(this.cinta.get(i))) {
                return i;
            }
        }

        return -1;
    }
    
    public boolean borrarProducto(Producto producto) {
        int pos = buscarProducto(producto);
        if (pos >= 0) {
            this.cinta.remove(pos);
            return true;
        }
        return false;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    
    public Producto mostrarProductos(int posicion){
        return this.cinta.get(posicion);
    }
    
    //Devolver cantidad de productos con los diferentes ivas
    public int cantidadProductosIva4(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 4) {
                listaAux.add(auxProducto);
            }
        }
        int cantidadProductos  = 0;
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
    public int cantidadProductosIva10(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 10) {
                listaAux.add(auxProducto);
            }
        }
        int cantidadProductos  = 0;
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
    public int cantidadProductosIva21(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 21) {
                listaAux.add(auxProducto);
            }
        }
        int cantidadProductos  = 0;
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
    //Devolver suma de todos los precios que tengan el mismo iva
    public double totalPrecioIva4(){
        
        ArrayList<Double> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 4) {
                listaPrecios.add(auxProducto.precio());
                cantidadProductos.add(auxProducto.cantidad());
            }
        }
        
        double precioProductos = 0;
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        return precioProductos;
    }
    
    public double totalPrecioIva10(){
        
        ArrayList<Integer> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 10) {
                listaPrecios.add(i);
                cantidadProductos.add(auxProducto.cantidad());
            }
        }
        
        double precioProductos = 0;
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        return precioProductos;
    }
    
    public double totalPrecioIva21(){
        
        ArrayList<Integer> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 21) {
                listaPrecios.add(i);
                cantidadProductos.add(auxProducto.cantidad());
            }
        }
        
        double precioProductos = 0;
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        return precioProductos;
    }
}
