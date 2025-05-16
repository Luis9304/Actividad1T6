/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package convertirnombres;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONVERTIRNOMBRES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String entrada;
        while (true) {
            System.out.print("Ingrese su nombre completo en minúsculas (o escriba 'salir' para terminar): ");
            entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("salir")) {
                System.out.println("Programa terminado.");
                break;
            }
            String nombreMayusculas = entrada.toUpperCase();
            System.out.println("Nombre en mayúsculas: " + nombreMayusculas);
        }
    }
   
}
