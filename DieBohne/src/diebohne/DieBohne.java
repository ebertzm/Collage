package diebohne;// Das erzeichnis, in dem sich die Datei befindet

import java.util.Scanner;
import kunden.Kunde;
import de.micha.daten.Werbung;


public class DieBohne {// Datei die über "public" ist für jeden sichtbar

   
    public static void main(String[] args) {

        /*
        //int: Ganzzahlen im positiven und negativen Bereich
        int anzahlDerBestelltenKaffee;  //Variablendeclaration: Typ und Name Konvention: !!erster Buchstabe klein!!
        anzahlDerBestelltenKaffee = 2 + 3 * 2; //Initialisierung: erste Zuweisung
        //double: Fließkommazahl
        double gesamtPreis = anzahlDerBestelltenKaffee * 2.11;//Variablendefinition

        //Datentyp String (eigentlich eine Klasse....)
        String nameMeinesKaffees = "Die Bohne";//Immer mit doppelten Hochkommata

        System.out.println("Mein neues Cafe: " + nameMeinesKaffees);//Abkürzung: sout und Tab
        System.out.println("wieviele Kaffees hatte ich heute schon:" + anzahlDerBestelltenKaffee);
        System.out.println("ich muss:" + gesamtPreis + "€ bezahlen");

        /* int id1 = 111;// Mögich auch andere Dahrstellungen der Zahl (0 =oktal(Zahlen bis 8) hexadezimal 0x)
        int id2 = 222;
        int id3 = 333;
        /*
        byte kurzeZahl = 22; //(bis 8bit)
        short auchNeKurzeZahl = 16; //bis 16bit int:32bit, long:64bit
        
        //andere Fließkommazahlen
        float kleineFließkommaZahl = 11.6f; //immer mit einem (f) am ende um einen float und kein double erzeugt
        
        System.out.println("Die gewälte id ist: " +id2);
        
    // Zeilenkommentar = endet am Ende der Zeile
    
    Blockkommentar endet mit * /
    */     
        Scanner eingabe = new Scanner(System.in);

        System.out.println("Hallo Willkommen in der Bohne, wie heißt du?");
        String kundenName = eingabe.nextLine();
        System.out.println("schön dass du da bist " + kundenName);
    

        String sorte1 = "Latte Macciato";
        String sorte2 = "Milchkaffee";
        String sorte3 = "Cappuchino";

        int id1 = 111;
        int id2 = 222;
        int id3 = 333;

        double preis1 = 4.11;
        double preis2 = 2.12;
        double preis3 = 4.59; //einem double einen float zuweisen mit (f) : automatisches konvertieren
        
        int test = (int)3.1415; //expliziet casten

        System.out.println("Unser Kaffee " + sorte1 + " wird bestellt mit der id:" + id1 + "und kostet:" + preis1 + "€");
        System.out.println("Unser Kaffee " + sorte2 + " wird bestellt mit der id:" + id2 + "und kostet:" + preis2 + "€");
        System.out.println("Unser Kaffee " + sorte3 + " wird bestellt mit der id:" + id3 + "und kostet:" + preis3 + "€");

    /* 
        System.out.println("gewählt wurde: " + gewaehlteSorte);

        // boolean eingabeKorrekt = true;
        // eingabeKorrekt = 3<4;
        // eingabeKorrekt = gewaehlteSorte == 111;
        //System.out.println("war die eingegebene ID 111?"+eingabeKorrekt);
        if (gewaehlteSorte == 111) {
            System.out.println("vielen Dank für die Wahl des: " + sorte1);
            System.out.println("bitte zahlen Sie: " + preis1 + "€");
            System.out.println("Vielen Dank für Ihre Bestellung");
        } else {
            if (gewaehlteSorte == 222) {
                System.out.println("vielen Dank für die Wahl des: " + sorte2);
                System.out.println("bitte zahlen Sie: " + preis2 + "€");
                System.out.println("Vielen Dank für Ihre Bestellung");
            } else {
                if (gewaehlteSorte == 333) {
                    System.out.println("vielen Dank für die Wahl des: " + sorte3);
                    System.out.println("bitte zahlen Sie: " + preis3 + "€");
                    System.out.println("Vielen Dank für Ihre Bestellung");
                } else {
                    System.out.println("Sie haben eine Sorte gewählt, die nicht verfügbar ist");
                }
                
//Experiment
{ System.out.println("Unser Kaffee wird in drei Größen angebotenn, klein, mittel und groß");
                char klein ='k';
                char mittel ='m';
                char gross ='g';
                System.out.println("Welche Größe wünschen Sie? Bitte bestellen Sie mit k, m oder g");
                System.out.println("Der Buchstabe k: +"+(int)klein);
                System.out.println("Der Buchstabe m: +"+(int)mittel);
                System.out.println("Der Buchstabe g: +"+(int)gross);
                int zahl = mittel + gross;
                System.out.println("Errechnet wurde: "+(char) (zahl));
                zahl = mittel/6;
                
                System.out.println("errechnet wurde: "+(char)(zahl)+ " oder als Zahl: "+ (int)zahl);
                
                //logische Verknüpfungen
                boolean b1 = true;
                boolean b2 = false;
                boolean verknuepft = b1 & b2; //verknüpft ist nur wahr wenn b1 und b2 wahr sind
                verknuepft = b1 && b2; // Abkürzung: b2 wird nur überprüft, wenn b1 'true' ist
                
                // logische Verknüpfung oder |
                verknuepft = b1 | b2; //wenn b1 oder b2 'true', oder beide
                verknuepft = b1 || b2; //Abkürzung: wird nur ausgeführt wenn b1 'false'
                
                // ^ logische Verknüpfung entweder oder
                verknuepft = b1 ^ b2;
                
                // ! logische Verknüpfung: nicht
                verknuepft = !b1; //verknüpft ist wahr, wenn b1 'false'
                
                // % Modulo Operator: Restklassen- Operator -- gibt der Rest einer ganzzahigen Division
                int zahl1 = 16;
                int zahl2 = 6;
                int mod = zahl1 % zahl2; // ergibt4
                
                //Schleifen (i = i+1 = i++, funktioniert genauso als Counter rückwärts mit i--
                for(int i=0;i<6;i++){
                    System.out.println("gezählt: "+i);
                    for (int j=0;j<15&&i>0;j++){
                        if(j%i==0){
                            System.out.println(j+" ist durch "+i+ "teilbar");
                            
                        }
                }
                //Schritt 1: int i=0
                //Schritt 2: i<6
                //Schritt 3: System.out.println("gezählt: "+i);
                //Schritt 4: i++
                //Schritt 5: i<6 falls -> true
                //Schritt 6: System.out.println("gezählt: "+i);
                //Schritt 7: i++
                //Schritt 8: i<6 falls -> true
                //Schritt 9: System.out.println("gezählt: "+i);
                //usw
                
        
                //bedingte Schleife: Kopfgesteuerte und Fußgesteuerte
                // Kopfgesteuerte:
                Scanner eingabe = new Scanner(System.in);
                System.out.println("Bitte Zahl eingeben: ");
                    int gelesen = eingabe.nextInt();
                    //while: während die Bedingung wahr ist wenn ich weiß wie viele Schleigen benötigt werden, dann for Schleufe 
                    while (gelesen<6){
                        System.out.println("Eingegeben wurde: "+gelesen);
                        gelesen = eingabe.nextInt();
                        }
                    //Fußgesteuerte Schleife:do-while Schleife
                    //int fGelesen=0;
                    do{
                        System.out.println("Bitte eine Zahle eingeben");
                        fGelesen = eingabe.nextInt();
                        System.out.println("gelesen wurde: "+fGelesen);
                    }while (fGelesen>10); //am Ende der do-while Schleife immer ein Symikolon!!
                    
                    int anzahlGeraderZahlen = 10;
                    int[] sammlung; //deklaration des Arrays
                    sammlung = new int [anzahlGeraderZahlen]; // Initialisieung eines Array: Schlüsselwort new
                    int counter = 0;
                    for (int i=0; i<30;i++){
                        
                        if(i%2==0){
                            System.out.println("I:"+i);
                            sammlung[counter]=i;//Zugriff aufdie einzelnen Elemente des Array mit dem Index. Kleinster Index: 0
                            counter++;
                        }
                        if (counter==anzahlGeraderZahlen){
                            break;
                        }
                    }
                    for(int i=0; i>10; i=i+2) {
                        System.out.println("anders: I: "+i);
                    }
                    
                    for (int i=0; i<5; i++) {
                        System.out.print(" "+ sammlung[i] + " ");
                    }
                    
                    System.out.println();
                    for(int i=0; i<sammlung.length; i++){
                        System.out.print(" " +sammlung[i] +" ");
                    }
         
        System.out.println();

        Scanner eingabe = new Scanner(System.in);
        System.out.println("Wieviele Produkte?");
        //int produktAnzahl=eingabe.nextInt();
        int produktAnzahl = 6;
        String[] sorten = new String[produktAnzahl]; //Arrays aben immer eine feste Größe und können nachträglich icht geändert werden
        int[] ids = new int[produktAnzahl];

        ids[3] = 333;
        ids[2] = 222;
        ids[5] = 555;

        for (int i = 0; i < ids.length; i++) {
            System.out.println("An der Stelle " + i + " befindet sich das Element " + ids[i]);
        }
        for (int i = 0; i < ids.length; i++) {
            System.out.println("An der Stelle " + i + " befindet sich das Element " + sorten[i]);
        }
        for (String sorte : sorten) {
            System.out.println("Element: " + sorte);
        }

        String kunden[] = new String[10];//Syntax in Ordnung, [] array Anweisung kann vor, oder nach dem Namen gestzt werden

        int[][] feld4 = {{11, 2, 13}, {3, 4, 5}, {5, 6, 7, 8}, {33}, {3, 6, 9, 12}};

        int[][] feld3 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        int[][] feld1 = {{2, 4, 6}, {1, 3, 9}, {5, 10, 15}};

        System.out.println("Wo ist die 2? " + feld4[0][1]);
        System.out.println("Die 3 steckt in: " + feld4[1][0]);
        System.out.println("was ist der Wert2 feld3 Array2? " + feld3[1][1]);
        System.out.println("was ist der Wert3 in feld1 Array3?  " + feld1[2][2]);

        //for(int i: feld4[3]){
        //    System.out.print(i+ " ");
         
        Scanner eingabe = new Scanner(System.in);
        System.out.println("Hallo Willkommen in der Bohne, wie heißt du?");
        String kundenName = eingabe.nextLine();
        System.out.println("Schön, dass du da bist " + kundenName);
        String sorte1 = "Latte Macchiato";
        String sorte2 = "Milchkaffe";
        String sorte3 = "Cappuchino";

        int id1 = 111;
        int id2 = 222;
        int id3 = 333;

        double preis1 = 4.11;
        double preis2 = 2.12;
        double preis3 = 5.00;//Einem double wird ein float zugewiesen: Automatische "konvertieren"

        System.out.println("Unser Kaffee " + sorte1 + " wird bestellt mit der id: " + id1 + "und kostet:" + preis1 + "€");
        System.out.println("Unser Kaffee " + sorte2 + " wird bestellt mit der id: " + id2 + "und kostet:" + preis2 + "€");
        System.out.println("Unser Kaffee " + sorte3 + " wird bestellt mit der id: " + id3 + "und kostet:" + preis3 + "€");

        System.out.println("Welche Sorte soll es sein?");
        int gewaehlteSorte = eingabe.nextInt();
        System.out.println("Gewählt wurde: " + gewaehlteSorte);

        Kunde meinNeuerKunde = new Kunde();
        meinNeuerKunde.bestellen(gewaehlteSorte);

        meinNeuerKunde.bestellen(gewaehlteSorte);
        meinNeuerKunde.bezahlen();
         */
    
    
        Werbung werbung = new Werbung();
         
        
                
        Kunde k1 = new Kunde();
        k1.nameEingeben("Justus");
        //werbung.kundeZufuegen();
        
        
        Kunde k2 =new Kunde();
        k2.nameEingeben ("Peter");
        //werbung.kundeZufuegen();
        
        Kunde k3 = new Kunde();
        k3.nameEingeben(kundenName);
        
        werbung.zeigeAlleKunden();
        
       
        

    }
}
