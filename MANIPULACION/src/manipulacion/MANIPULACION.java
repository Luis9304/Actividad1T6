/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manipulacion;

import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class MANIPULACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto largo:");
        String texto = scanner.nextLine();
        String textoMinusculas = texto.toLowerCase();
        String palabraObjetivo = "ingeniería";
        int contador = 0;
        int index = 0;
        while ((index = textoMinusculas.indexOf(palabraObjetivo, index)) != -1) {
            contador++;
            index += palabraObjetivo.length();
        }
        System.out.println("La palabra \"ingeniería\" aparece " + contador + " veces.");
        
    }
    
}