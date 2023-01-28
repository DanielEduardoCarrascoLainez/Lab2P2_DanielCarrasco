/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

public class Solares {
    double anchos;
    double largos;
    String dueño;
    double areaT;
    //Error mío no ponerle el dueño ni el area

    public Solares() {
    }

    public Solares(double anchos, double largos, String dueño, double areaT) {
        this.anchos = anchos;
        this.largos = largos;
        this.dueño = dueño;
        this.areaT = areaT;
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

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public double getAreaT() {
        return areaT;
    }

    public void setAreaT(double areaT) {
        this.areaT = areaT;
    }

    @Override
    public String toString() {
        return "Solares{" + "anchos=" + anchos + ", largos=" + largos + ", due\u00f1o=" + dueño + ", areaT=" + areaT + '}';
    }

    
}
