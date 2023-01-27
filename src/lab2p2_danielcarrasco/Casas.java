/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

import java.awt.Color;

public class Casas {
    int numeroCasa;
    int numeroBloq;
    Color colorin;
    double ancho;
    double largo;
    int numeroBa;
    int numeroCuartos;
    String dueño;

    public Casas() {
    }

    public Casas(int numeroCasa, int numeroBloq, Color colorin, double ancho, double largo, int numeroBa, int numeroCuartos, String dueño) {
        this.numeroCasa = numeroCasa;
        this.numeroBloq = numeroBloq;
        this.colorin = colorin;
        this.ancho = ancho;
        this.largo = largo;
        this.numeroBa = numeroBa;
        this.numeroCuartos = numeroCuartos;
        this.dueño = dueño;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public int getNumeroBloq() {
        return numeroBloq;
    }

    public void setNumeroBloq(int numeroBloq) {
        this.numeroBloq = numeroBloq;
    }

    public Color getColorin() {
        return colorin;
    }

    public void setColorin(Color colorin) {
        this.colorin = colorin;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public int getNumeroBa() {
        return numeroBa;
    }

    public void setNumeroBa(int numeroBa) {
        this.numeroBa = numeroBa;
    }

    public int getNumeroCuartos() {
        return numeroCuartos;
    }

    public void setNumeroCuartos(int numeroCuartos) {
        this.numeroCuartos = numeroCuartos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Casas{" + "numeroCasa=" + numeroCasa + ", numeroBloq=" + numeroBloq + ", colorin=" + colorin + ", ancho=" + ancho + ", largo=" + largo + ", numeroBa=" + numeroBa + ", numeroCuartos=" + numeroCuartos + ", due\u00f1o=" + dueño + '}';
    }

   
    
    
}
