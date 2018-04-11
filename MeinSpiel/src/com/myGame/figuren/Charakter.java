package com.myGame.figuren;

public class Charakter {

    //Attribute
    protected int lebensPunkte;// private int lebenspunkte=0;
    protected int schadensRate;
    protected boolean darfSpielen = true;//Vorininitialisierung wäre:  private boolean darfSpielen = false 

    //Konstruktoren: TESTEN!!!
    public Charakter() {
        System.out.println("Das Objekt wird erstellt");
        //Ein zufällige Zahl soll erzeugt werden
        //Math.random
        double tmp = (Math.random() * 100) + 1;
        lebensPunkte = (int) tmp;
        tmp = (Math.random() * 10) + 1;
        schadensRate = (int) tmp;
    }

    public Charakter(int vipFaktor) {
        System.out.println("Ein VIP wird erzeugt");
        double tmp = (Math.random() * 100) + 1;
        lebensPunkte = (int) tmp + vipFaktor;
        tmp = (Math.random() * 10) + 1;
        schadensRate = (int) tmp;
    }

    public Charakter(String name) {
        if (name.equals("Trump")) {
            int malus = -100;
            System.out.println("Ein Trump wird erzeugt");
            double tmp = (Math.random() * 100) + 1;
            lebensPunkte = (int) tmp + malus;
            tmp = (Math.random() * 10) + 1;
            schadensRate = (int) tmp;
        } else {
            System.out.println("Das Objekt wird erstellt");
            //Ein zufällige Zahl soll erzeugt werden
            //Math.random
            double tmp = (Math.random() * 100) + 1;
            lebensPunkte = (int) tmp;
            tmp = (Math.random() * 10) + 1;
            schadensRate = (int) tmp;
        }
    }
    
    public Charakter(int vipFaktorLeben, int vipFaktorSchaden){
        //Übung: i, j sollen lebenspunkte und schadensrate verbessern
    }
   
    //Methoden
    public void verwundetWerden(int schaden) {
        lebensPunkte = lebensPunkte - schaden; //Gleichbedeutend:  lebenspunkte -= schaden
        if (lebensPunkte <= 0) {
            darfSpielen = false;
            System.out.println("Game over...."+this);
        }
    
    }
    public void verwunden(Charakter fremder) {
        //Das Objekt selbst, also "ich" wird angesprochen über: this
        //this ist Referenz
        /*System.out.println("*********Zur Kontrolle **********");
        System.out.println("this: "+this);
        System.out.println("fremder: "+fremder);
        System.out.println("********Kontrolle Ende *********");*/
        if (this != fremder) {
            fremder.verwundetWerden(schadensRate);
        } else {
            System.out.println("Das mach ich nicht!");
        }

    }

    public void geheiltWerden(int heilung) {
        lebensPunkte += heilung;
    }

    public int getLebensPunkte() {
        return lebensPunkte;
    }

    public boolean istNochDabei() {
        return darfSpielen;
    }
}
