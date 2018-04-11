/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meinspiel;


import com.myGame.figuren.GespielterCharakter;
import com.myGame.figuren.Charakter;
import com.myGame.figuren.Hexer;
import com.myGame.figuren.Warrior;
import ki.Oger;
import com.myGame.waffen.Schwert;
import com.myGame.figuren.Krieger;
import com.myGame.figuren.SuperKrieger;
import static com.myGame.waffen.Schwert.sovieleSchwerter;

public class Start {

    public static void main(String[] args) {
        int schwertZahl = sovieleSchwerter();
        System.out.println("Aktuelle Anzahl der Schwerter: " + schwertZahl);
        Oger hauDrauf = new Oger();

        System.out.println(hauDrauf);
        System.out.println("Verteidiger: ");

        GespielterCharakter[] verteidiger = new GespielterCharakter[5];
        verteidiger[1] = new Hexer("Hexer Klaus");
        verteidiger[2] = new Krieger("Krieger Peter");
        verteidiger[3] = new Warrior("Warrior Max");
        verteidiger[0] = new GespielterCharakter("Kämfer Hans");
        verteidiger[4] = new SuperKrieger("SuperKrieger Franz");
        int verteidigerAmLeben = 5;

        //VerteidigerGruppe vg = new Verteidiger();
        //vg.erstelleParty(verteidiger);
        
        while (hauDrauf.istNochDabei()) {
            double tmp = (Math.random() * 100) + 1;
            int index = (int) tmp % 4;
            System.out.println(verteidiger[index]);

            if (verteidiger[index].istNochDabei()) {
                hauDrauf.verwunden(verteidiger[index]);

                if (!verteidiger[index].istNochDabei()) {
                    verteidigerAmLeben--;
                }
            }
            if (verteidigerAmLeben == 0) {
                System.out.println("Alle Verteidiger tot, Glückwunsch Oger");
                break;
            }

            for (GespielterCharakter gc : verteidiger) {
                if (hauDrauf.istNochDabei()) {
                    gc.verwunden(hauDrauf);
                }
            }

            
           // hauDrauf.verwunden(verteidiger[3]);
           // verteidiger[1].verwunden(hauDrauf);
/*
        System.out.println("***********");
        Schwert eins = new Schwert();
        //Schwert zwei = new Schwert();
        //Schwert drei = new Schwert();

        Schwert exK = new Schwert();
        exK.gebeSchwertAnNeuenBesitzer(hauDrauf);
        exK.gebeSchwertAnNeuenBesitzer(verteidiger[2]);
 */      
        }

    }
}