/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comparacion;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class COMPARACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = scanner.nextLine();
        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = scanner.nextLine();
        if (cadena1.length() == cadena2.length()) {
            System.out.println("Las cadenas tienen la MISMA longitud.");
        } else {
            System.out.println("Las cadenas tienen DIFERENTE longitud.");
        }
        if (cadena1.equals(cadena2)) {
            System.out.println("El contenido de ambas cadenas es IGUAL.");
        } else {
           System.out.println("El contenido de ambas cadenas es DIFERENTE.");
        }
        }
        
                 
    }
    
