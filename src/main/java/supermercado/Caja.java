/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

/**
 * Sus atributos son el número de caja y la clase cinta
 * Métodos:
 * generarTicket() --> devuelve un objeto Ticket
 */
public class Caja {
    
    private int numeroIdentificador;
    private Cinta cinta;

    public Caja() {
    }

    public Caja(int numeroIdentificador, Cinta cinta) {
        this.numeroIdentificador = numeroIdentificador;
        this.cinta = cinta;
    }

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public Cinta getCinta() {
        return cinta;
    }

    public void setCinta(Cinta cinta) {
        this.cinta = cinta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Caja{");
        sb.append("\nNumero identificador=").append(numeroIdentificador);
        sb.append(", \ncinta=\n").append(cinta);
        sb.append('}');
        return sb.toString();
    }
    
    public Ticket generarTicket(){
        
        Ticket ticket = new Ticket(this.cinta);
        
        return ticket;
    }
}
