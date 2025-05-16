/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversion;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author luis_
 */
public class CONVERSION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una fecha en formato YYYY-MM-DD: ");
        String entrada = scanner.nextLine();

        try {
            LocalDate fecha = LocalDate.parse(entrada);
            LocalDate unaSemanaDespues = fecha.plusWeeks(1);
            LocalDate unMesAntes = fecha.minusMonths(1);
            System.out.println("Fecha ingresada: " + fecha);
            System.out.println("Una semana después: " + unaSemanaDespues);
            System.out.println("Un mes antes: " + unMesAntes);
         } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido. Use el formato YYYY-MM-DD.");   
         }    
        }
    }
   

