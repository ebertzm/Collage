/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textverarbeitung;

import java.util.Arrays;

public class StringTest {

    public static void main(String[] args) {

        /*
        String hi = "Hallo";// 'hi' ist die Referenz, die aktuell auf den Bereich im Speicher zeigt der "Hallo" enthält
        String wo = new String("Welt");//'wo' ist die Referenz, die aktuell auf den Bereich im Speicher zeigt der "Welt" enthält
        // wobei "Welt" ein neues Objekt ist und nicht aus dem Stringpool kommt
        {
        System.out.println("in woNeu: " + woNeu);
        
        String name = "Justus";
        int[] zahlen1 = {1, 2, 3, 4};
        int[] zahlen2 = {1, 2, 3, 4};
        if (zahlen1 == zahlen2) {
            System.out.println("zahlen1 und zahlen2 sind identisch");
        }
        if (Arrays.equals(zahlen1, zahlen2)) {  //Machen wir später
            System.out.println("zahlen1 und zahlen2 haben den gleichen Inhalt");
        }
        if (zahlen2.equals(name)) {
            System.out.println("zahlen1 und zahlen2 haben den selben Inhalt");
        }
        zahlen1 = zahlen2;
        if (zahlen1 == zahlen2) {
            System.out.println("foo");
        }
        zahlen2[0] = 5; //Inhalte von zahlen1 wurde überschrieben durch zahlen2!!
        System.out.println("Erste Stelle des zahlen1-Arrays: " + zahlen1[0]);
        //falls ich auf die Daten von zahlen1 weiterhin zugreifen will muss ich den Inhalt sichern mit: zahlen1=zahlen3 z.B.
         
        String hi = "Hallo";
        String begruessung = hi.concat("Welt");
        System.out.println("In hi: " + hi);
        System.out.println("In begruessung: " + begruessung);
        String wichtiges = hi.toUpperCase();
         */
// Programmierer lieben Kaffee
//wieviele Buchstaben haben die Wörter?
        String satz[] = {"Programmierer", "lieben", "Kaffee"};

        System.out.println("Programmierer hat: " + satz[0].length() + " Buchstaben");
        System.out.println("lieben hat: " + satz[1].length() + " Buchstaben");
        System.out.println("Kaffee hat: " + satz[2].length() + " Buchstaben");

     /*
        String satz1 = "Programmierer lieben Kaffe";
        String[] woerter = satz1.split(" ");
     */   

    }

}
