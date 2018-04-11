
package de.metropolis.lebewesen;

import metropolis.Flieger;
/**
*singleton design pattens
*/
public class Superman implements Flieger{
    private String identität = "Clark Kent";
    private int weltRettungen = 0;
    private static Superman superman; 
   
    @Override
    public void starten(){
        System.out.println("Ich mache mich auf und rette die Welt");
    }
    @Override
    public void fliegen(){
        System.out.println("bin auf dem Weg");
        weltRettungen++;
    }
    @Override
    public void landen(){
        System.out.println("endlich zurück, die Welt ist sicher");
    }
    private static Superman rufesuperman(){
        if (superman==null){
            superman = new Superman();
        }
        return superman;
    }
}
