package kunden;

public class Kunde {

    //Attribute
    private String name;
    /**
     * enthält den Betrag in €, den der Kunde bezahlen muss
     */
    private double rechnung;
    private boolean darfKontaktiertWerden;

    //Methoden
    public void nameEingeben(String kundenName) {//pulic void setName (String name) Standardvorgehen!!
        name = kundenName;

    }

    public void bestellen(int id, int anzahl) {
        switch (id) {
            case 111: {

                System.out.println("Danke " + name + ", dass du einen Latte Machiato bestellt hast");
                rechnung = rechnung + anzahl * 4.11;

                break;
            }

            case 222: {
                System.out.println("Danke dass du einen Milchkaffee bestellt hast");
                rechnung = rechnung + anzahl * 2.12;
                break;
            }
            case 333: {
                System.out.println("Danke dass du einen Cappuchino bestellt hast");
                rechnung = rechnung + anzahl * 5.00;
                break;
            }
            default: {
                System.out.println("Haben wir im Moment nicht im Programm, dürfen wir dich kontaktieren, wenn es etwas neues gibt?");
                //Vieleicht boolean ändern daftKontaktiert werden
                break;
            }

        }
    }

    public void bezahlen() {
        System.out.println("Die Rechnung beträgt aktuell " + rechnung + "€");
        rechnung = 0;
    }

    public void darfKontaktiertWerden() {
        //soll sagen of er kontaktiert werden darf
        //bezahlen
    }
  
    public String ausgabeName() {
        return name;
    }
}
