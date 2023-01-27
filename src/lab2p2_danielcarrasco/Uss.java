/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_danielcarrasco;

public class Uss {
    private String nombre;
    private String usuario;
    private int edad;
    private String pass;

    public Uss() {
    }

    public Uss(String nombre, String usuario, int edad, String pass) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.edad = edad;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Uss{" + "nombre=" + nombre + ", usuario=" + usuario + ", edad=" + edad + ", pass=" + pass + '}';
    }
    
    
    
}
