package lab2p2_brandonhernandez;

import java.awt.Color;
import java.util.ArrayList;

public class Carro {

    private String marca;
    private String modelo;
    private String marcador;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList();

    public Carro(String marca, String modelo, String marcador, Color color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.marcador = marcador;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarcador() {
        return marcador;
    }

    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    public void setMejoras(ArrayList<String> mejoras) {
        this.mejoras = mejoras;
    }

    @Override
    public String toString() {
        String cadenaFinal = "";
        cadenaFinal += "Marca: " + marca + "\nModelo: " + modelo + "\nMarcador: " + marcador + "\nColor: " + color + "\nPrecio: " + precio;
        if(mejoras.isEmpty()){
            cadenaFinal += "\nNo tiene mejoras";
        } else{
            for (String m : mejoras) {
                cadenaFinal += "\n" + m + "\n";
            }
        }
        return cadenaFinal;
    }
    
    
    
}
