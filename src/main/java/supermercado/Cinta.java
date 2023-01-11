/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Será la clase encargada de almacenar cada producto seleccionado
 * en una List
 * Se podrá añadir y quitar productos
 */
public class Cinta {
    
    private List<Producto> cinta;
    private LocalDate fecha = LocalDate.now();
    private LocalTime hora = LocalTime.now();

    public Cinta() {
        this.cinta = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        //Ordenar los elementos de la lista por iva y después por nombre con la clase Comparator
        this.cinta.sort(Comparator.comparing(Producto :: iva).thenComparing(Producto :: nombre));
        
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

    public String getHora() {
        return new SimpleDateFormat("H:mm").format(new Date());
    }
    
    public Producto mostrarProductos(int posicion){
        return this.cinta.get(posicion);
    }
    
    //Método que devuelve un boolean que indica si está o no vacía la lista
    public boolean comprobarSiEstaVacia(){
        return cinta.isEmpty();
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //Devolver cantidad de productos con los diferentes ivas
    public int cantidadProductosIva4(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        //Bucle para guardar en la lista anteriormente creada los productos que tengan un iva del 4%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 4) {
                listaAux.add(auxProducto);
            }
        }
        
        int cantidadProductos  = 0;
        //Bucle que suma los valores de la lista anteriormente rellenada para saber la cantidad total de los
        //productos con un iva del 4%
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
    public int cantidadProductosIva10(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        //Bucle para guardar en la lista anteriormente creada los productos que tengan un iva del 4%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 10) {
                listaAux.add(auxProducto);
            }
        }
        
        int cantidadProductos  = 0;
        //Bucle que suma los valores de la lista anteriormente rellenada para saber la cantidad total de los
        //productos con un iva del 4%
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
    public int cantidadProductosIva21(){
        
        ArrayList<Producto> listaAux = new ArrayList<>();
        
        //Bucle para guardar en la lista anteriormente creada los productos que tengan un iva del 4%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 21) {
                listaAux.add(auxProducto);
            }
        }
        int cantidadProductos  = 0;
        //Bucle que suma los valores de la lista anteriormente rellenada para saber la cantidad total de los
        //productos con un iva del 4%
        for (Producto producto : listaAux) {
            cantidadProductos += producto.cantidad();
        }
        
        return cantidadProductos;
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //Devolver suma de todos los precios que tengan el mismo iva pero sin implementar el iva
    public double totalPrecioSinIva4(){
        
        ArrayList<Double> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        //Bucle para guardar en las listas los productos con un iva del 4%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 4) {
                listaPrecios.add(auxProducto.precio()); //lista que guarda el precio de cada producto de la cinta
                cantidadProductos.add(auxProducto.cantidad()); //lista que guarda la cantidad de cada producto
            }
        }
        
        double precioProductos = 0;
        //Bucle para multiplicar el precio de un producto por su cantidad y sumarlo con los otros productos
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        
        precioProductos = Math.ceil(precioProductos*100)/100;
        
        return precioProductos;
    }
    
    public double totalPrecioSinIva10(){
        
        ArrayList<Double> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        //Bucle para guardar en las listas los productos con un iva del 10%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 10) {
                listaPrecios.add(auxProducto.precio()); //lista que guarda el precio de cada producto de la cinta
                cantidadProductos.add(auxProducto.cantidad()); //lista que guarda la cantidad de cada producto
            }
        }
        
        double precioProductos = 0;
        //Bucle para multiplicar el precio de un producto por su cantidad y sumarlo con los otros productos
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        
        precioProductos = Math.ceil(precioProductos*100)/100;
        
        return precioProductos;
    }
    
    public double totalPrecioSinIva21(){
        
        ArrayList<Double> listaPrecios = new ArrayList<>();
        ArrayList<Integer> cantidadProductos = new ArrayList<>();
        
        //Bucle para guardar en las listas los productos con un iva del 21%
        for (int i = 0; i < getNumeroProductos(); i++) {
            Producto auxProducto = mostrarProductos(i);
            
            if (auxProducto.iva() == 21) {
                listaPrecios.add(auxProducto.precio()); //lista que guarda el precio de cada producto de la cinta
                cantidadProductos.add(auxProducto.cantidad()); //lista que guarda la cantidad de cada producto
            }
        }
        
        double precioProductos = 0;
        //Bucle para multiplicar el precio de un producto por su cantidad y sumarlo con los otros productos
        for (int i = 0; i < listaPrecios.size(); i++) {
            precioProductos += listaPrecios.get(i) * cantidadProductos.get(i);
        }
        
        precioProductos = Math.ceil(precioProductos*100)/100;
        
        return precioProductos;
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //Métodos que devuelven un double con el precio con iva total de los productos con el mismo iva
    public double precioConIva4(double precioSinIva4){
        
        double precio = precioSinIva4 + (precioSinIva4 * 0.04);
        
        precio = Math.ceil(precio*100)/100;
        
        return precio;
    }
    
    public double precioConIva10(double precioSinIva10){
        
        double precio = precioSinIva10 + (precioSinIva10 * 0.1);
        
        precio = Math.ceil(precio*100)/100;
        
        return precio;
    }
    
    public double precioConIva21(double precioSinIva21){
        
        double precio = precioSinIva21 + (precioSinIva21 * 0.21);
        
        precio = Math.ceil(precio*100)/100;
        
        return precio;
    }
    
//----------------------------------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------------------------------
    //Método que devuelve double con el precio total, que es la suma del precio de todos los productos 
    //con iva
    public double precioTotal(double precioIva4, double precioIva10, double precioIva21){
        
        double precioTotal = precioIva4 + precioIva10 + precioIva21;
        precioTotal = Math.ceil(precioTotal*100)/100;
        
        return precioTotal;
    }
}
