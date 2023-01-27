/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_danielcarrasco;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab2P2_DanielCarrasco {

    static Scanner ninetales = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList listitaE = new ArrayList();
        Uss admin = new Uss("Pedrito", "admin", 90, "1234");
        boolean vemos = false;
        boolean vemosUss = false;

        do {
            System.out.println("----------Bienvenido----------");
            System.out.println("1-. Registro de inmueble");
            System.out.println("2-. Manejo de estados");
            System.out.println("3-. Log in");
            System.out.println("4-. Salir");
            int ops = ninetales.nextInt();

            //Op 1
            if (ops == 1 && vemos == true) {
                AdminOpUno(listitaE);
            } else if (ops == 1 && vemosUss == true) {
                UssOpUno();
            } else {
                System.out.println("Usted no puede ingresar sin hacer log in");
            }
            //Fin op 1
            //Op 2
            if (ops == 2 && vemos == true) {

            } else {
                System.out.println("Usted no puede ingresar sin ser usuario");
            }
            //Fin op 2

        } while (true);

    }

    public static void AdminOpUno( ArrayList listitaE) {
        System.out.println("-----Menu Registro");
        System.out.println("1-. crear casa, edificio o solar");
        System.out.println("2-. Listar");
        System.out.println("3-. Modificar");
        System.out.println("4-. Borrar");
        System.out.println("5-. Vender");
        int opsM= ninetales.nextInt();
        
        do{
            switch(opsM){
                case 1:
                    for (int i = 0; i < listitaE.size(); i++) {
                        
                    }
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                default:
                    
                    break;
            }
            
        }while (opsM<6);
    }
    
    public static void UssOpUno(){
        System.out.println("1-. Listar");
        System.out.println("2-. Vender");
        int opsM= ninetales.nextInt();
    }

}
