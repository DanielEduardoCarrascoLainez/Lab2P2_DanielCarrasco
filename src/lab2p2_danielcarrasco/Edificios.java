/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

public class Edificios {
    int numPisos;
    int locales;
    String referencia;

    public Edificios() {
    }

    public Edificios(int numPisos, int locales, String referencia) {
        this.numPisos = numPisos;
        this.locales = locales;
        this.referencia = referencia;
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
    
    
}
