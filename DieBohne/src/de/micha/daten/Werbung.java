package de.micha.daten;

import kunden.Kunde;

public class Werbung {

    //werbeSpamOpfer soll sofort beim anlegen initialisiert werden
    private Kunde[] werbeSpamOpfer = new Kunde[10];

    public void zeigeAlleKunden() {
        System.out.println("******");
        for (Kunde meinKunde : werbeSpamOpfer) {
            System.out.println("der Kunde ist: " + meinKunde);
        }
        System.out.println("******");
    }

    public void kundeZufuegen(Kunde neuerKunde) {
        for (int i = 0; i < werbeSpamOpfer.length; i++) {
            if (werbeSpamOpfer[i] == null) {
                werbeSpamOpfer[i] = neuerKunde;
                break;
            }

        }

    }
/*
    public void anredeAendern() {
        for (Kunde meinKunde : werbeSpamOpfer) {
            meinKunde.nameEingeben(meinKunde.gibDenNamenAn().toUpperCase());
        }
        Kunde testKunde = werbeSpamOpfer[0];
        kundeIstKoenig(kundenName);

    public
     *
    
     */
    public void kundeIstKoenig(Kunde meinKunde){
        meinKunde.nameEingeben("König");
    }
}

    
