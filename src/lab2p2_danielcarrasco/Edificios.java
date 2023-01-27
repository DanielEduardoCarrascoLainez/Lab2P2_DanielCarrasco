/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

public class Edificios {
    int numPisos;
    int locales;
    String referencia;
    String dueño;

    public Edificios() {
    }

    public Edificios(int numPisos, int locales, String referencia, String dueño) {
        this.numPisos = numPisos;
        this.locales = locales;
        this.referencia = referencia;
        this.dueño = dueño;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    public int getLocales() {
        return locales;
    }

    public void setLocales(int locales) {
        this.locales = locales;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "Edificios{" + "numPisos=" + numPisos + ", locales=" + locales + ", referencia=" + referencia + ", due\u00f1o=" + dueño + '}';
    }
    
    
    
}
