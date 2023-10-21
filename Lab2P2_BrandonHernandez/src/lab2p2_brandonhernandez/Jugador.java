package lab2p2_brandonhernandez;

import java.util.ArrayList;

public class Jugador {
    
    private String nombre;
    private int cantCarros;
    private ArrayList<Carro> listaCarros = new ArrayList();
    private int puntosRep;
    private double saldo;

    public Jugador(String nombre, int puntosRep, double saldo) {
        this.nombre = nombre;
        this.puntosRep = puntosRep;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantCarros() {
        return cantCarros;
    }

    public void setCantCarros(int cantCarros) {
        this.cantCarros = cantCarros;
    }

    public ArrayList<Carro> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carro> listaCarros) {
        this.listaCarros = listaCarros;
    }

    public int getPuntosRep() {
        return puntosRep;
    }

    public void setPuntosRep(int puntosRep) {
        this.puntosRep = puntosRep;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCantidad de carros: " + cantCarros + "\nPuntos de reputacion: " + puntosRep + "\nSaldo: " + saldo + " Lps";
    }
    
    
    
}
