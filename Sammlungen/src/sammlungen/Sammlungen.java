
package sammlungen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Sammlungen {

   
    public static void main(String[] args) {
        Collection sammlung1 = new ArrayList();
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
        sammlung1.add("Test");
        sammlung1.add("aufrufen");
        System.out.println("Sammlung1 hat aktuell: "+sammlung1.size()+" Elemente");
       // Double wrapperPi = new Double(3.1415);
    
    boolean b = sammlung1.contains("Test");
        System.out.println("Ist Test in der Sammlung? "+b);
   
        List sammlung2 = new ArrayList();
        sammlung2.add("Hallo");
        sammlung2.add("Welt");
        sammlung2.add(new Scanner(System.in));
        Scanner eingabe = new Scanner(System.in);
        sammlung2.add(eingabe);
        double e = Math.E;
        sammlung2.add(3,Math.E);
        System.out.println("Anzahl der Elemente in Sammlung2 " +sammlung2.size());
        for(int i=0; i<sammlung2.size();i++){
            System.out.println("Das Element mit dem Index "+ i + " ist: " + sammlung2.get(i));
            
        }
        int i = sammlung2.indexOf("Hallo");
        System.out.println("Das Element \"Hallo\" ist an der Stelle "+i);
        sammlung2.remove(4);
        System.out.println("Anzahl der Elemente in Sammlung2 " +sammlung2.size());
         List <Kunde> alleKunden = new ArrayList<>();
        Kunde wichtig = new Kunde("Justus Jonas",-1000);
        Kunde interessant = new Kunde("Peter Shaw",0);
        Kunde langweilig = new Kunde ("Bob Andrews",100);
        Stammkunde gaehn = new Stammkunde (10, "Walter", -10);
        alleKunden.add(gaehn);
       
        alleKunden.add(wichtig);
        alleKunden.add(langweilig);
        alleKunden.add(interessant);
        for(Kunde o : alleKunden){
            System.out.println("Kundenguthaben ist: "+o.getRechnungsBetrag());
        }
        
        
    }  
}
