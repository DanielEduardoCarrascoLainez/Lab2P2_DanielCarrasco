/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_danielcarrasco;

import java.awt.Color;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JColorChooser;

public class Lab2P2_DanielCarrasco {

    static Scanner ninetales = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList listitaE = new ArrayList();
        Uss admin = new Uss("Pedrito", "admin", 90, "1234");
        boolean vemos = false;
        boolean vemosUss = false;
        int ops;

        do {
            System.out.println("----------Bienvenido----------");
            System.out.println("1-. Registro de inmueble");
            System.out.println("2-. Manejo de estados");
            System.out.println("3-. Log in");
            System.out.println("4-. log out");
            System.out.println("5-. salir");
            ops = ninetales.nextInt();

            if (ops == 4) {
                System.out.println("Ya se cerro");
                vemos = false;
                vemosUss = false;
            }

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

        } while (ops < 5);

    }

    public static void AdminOpUno(ArrayList listitaE) {
        System.out.println("-----Menu Registro");
        System.out.println("1-. crear casa, edificio o solar");
        System.out.println("2-. Listar");
        System.out.println("3-. Modificar");
        System.out.println("4-. Borrar");
        System.out.println("5-. Vender");
        int opsM = ninetales.nextInt();

        do {
            switch (opsM) {
                case 1:
                    Color colorengue= Color.red;

                    System.out.println("Elija lo que desea crear");
                    System.out.println("Menu-----");
                    System.out.println("1-. Casa");
                    System.out.println("2-. Edificio");
                    System.out.println("3-. Solar");
                    int opsConstruc = ninetales.nextInt();

                    if (opsConstruc == 1) {
                        System.out.println("Ingrese el numero de la casa");
                        int numeroC = ninetales.nextInt();
                        System.out.println("Ingrese el numero de bloque");
                        int numeroB = ninetales.nextInt();
                        //Luego arreglo esta parte espero
                        JColorChooser.showDialog(null, "aja", colorengue);
                        System.out.println("Ingrese el ancho de la casa");
                        double ancho = ninetales.nextDouble();
                        System.out.println("Ingrese el largo de la casa");
                        double largo = ninetales.nextDouble();
                        System.out.println("Ingrese el numero de banios");
                        int banu = ninetales.nextInt();
                        System.out.println("Ingrese el numero de cuartos");
                        int numeroCua = ninetales.nextInt();
                        System.out.println("Ingrese el nombre del dueño");
                        String due = ninetales.nextLine();
                        
                        Casas cass = new Casas(numeroC, numeroB, colorengue, ancho, largo,banu, numeroCua, due);
                        listitaE.add(cass);
                        
                    }else if(opsConstruc== 2){
                        System.out.println("Ingrese la cantidad de pisos");
                        int pisos= ninetales.nextInt();
                        System.out.println("Ingrese el numero de locales");
                        int locales= ninetales.nextInt();
                        System.out.println("Ingrese las referencias del lugar, es decir la ubicacion");
                        String especificar= ninetales.nextLine();
                        System.out.println("Ingrese el nombre del dueño");
                        String dueño= ninetales.nextLine();
                        
                        Edificios edis = new Edificios(pisos,locales,especificar,dueño);
                        listitaE.add(edis);
                    }else if(opsConstruc==3){
                        System.out.println("Ingrese el ancho");
                        int anchos= ninetales.nextInt();
                        System.out.println("Ingrese el largo");
                        
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

        } while (opsM < 6);
    }

    public static void UssOpUno() {
        System.out.println("1-. Listar");
        System.out.println("2-. Vender");
        int opsM = ninetales.nextInt();
    }

}
