/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schule;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.Scanner;

public class Schule {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        LocalDate parsedDate = LocalDate.parse(datum);
        System.out.println("Heute ist: " + LocalDate.now());
        System.out.println("Es ist;" + LocalDateTime.now());
        LocalDate heute = LocalDate.now();
        LocalDate morgen = heute.plusDays(1);
        System.out.println("Morgen ist der: " + morgen);
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Tag?");
        String tag = eingabe.next();

    }

}
