/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

public class Solares {
    double anchos;
    double largos;

    public Solares(double anchos, double largos) {
        this.anchos = anchos;
        this.largos = largos;
    }

    public Solares() {
    }

    public double getAnchos() {
        return anchos;
    }

    public void setAnchos(double anchos) {
        this.anchos = anchos;
    }

    public double getLargos() {
        return largos;
    }

    public void setLargos(double largos) {
        this.largos = largos;
    }

    @Override
    public String toString() {
        return "Solares{" + "anchos=" + anchos + ", largos=" + largos + '}';
    }
    
    
}
