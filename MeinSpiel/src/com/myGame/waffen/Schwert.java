package com.myGame.waffen;

import com.myGame.figuren.Charakter;
import com.myGame.figuren.Hexer;
import com.myGame.figuren.Krieger;
import ki.Oger;

public class Schwert {

    private int id;
    private static int zaehler;
    private Charakter besitzer;

    @SuppressWarnings("empty-statement")
    public Schwert() {
        System.out.println("Ein Schwert wurde geschmiedet");

        System.out.println("*********");
        {
            zaehler++;
            while (zaehler <= 20) {
                break;
            }
        }
        System.out.println("Anzahl der Schwerter: " + (++zaehler));
        //if (anzahl)= zaehler <=50;
        // break;
    }

    public void gebeSchwertAnNeuenBesitzer(Charakter besitzer) {
        this.besitzer = besitzer;
        System.out.println("Das Schwert hat einen neuen Besitzer");
        if (besitzer instanceof Oger) {
            System.out.println("Ah, das Schwert wird zum Zahnstocher");
            return; //Methode wird beendet
        }
        if (besitzer instanceof Hexer) {
            System.out.println("Was soll ich mit dem Ding??");
        }
        if (besitzer instanceof Krieger) {
            System.out.println("Los geht's");

        }
    }
    /**
     * 
     * @return
     * @deprecated Besser verwenden: Static Methode sovieleSchwerter
     */
    @Deprecated
public int schwertiD(){
    return zaehler;
}
    public static int sovieleSchwerter() {//gehört nicht zum Objekt, sondern zur Klasse
        //System.out.println("Besitzer: "+besitzer);
        return zaehler;
    }
}
