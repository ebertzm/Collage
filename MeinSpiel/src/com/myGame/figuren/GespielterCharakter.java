package com.myGame.figuren;

public class GespielterCharakter extends Charakter {

    protected String wirdGespieltVon;

    public GespielterCharakter(String spielername) {
        super();
        wirdGespieltVon = spielername;
    }

    public GespielterCharakter(int lebenspunkte, int schadensrate,int wutschaden, String spielername) {
        this(spielername);
        this.lebensPunkte = lebenspunkte;
        this.schadensRate = schadensrate +wutschaden;

    }

    public String zeigeSpielerName() {
        return wirdGespieltVon;
    }

    public void anzeigeDesSpielers() {
        System.out.println("***********");
        System.out.println("Der Char wird gespiel von: " + wirdGespieltVon);
        System.out.println("aktuelle HP: " + this.lebensPunkte);
        System.out.println("Die Schadensrate ist: " + this.schadensRate);
        System.out.println("***********");
    }

    @Override
    public String toString() {
        return "Spieler: " + wirdGespieltVon + " | HP: " + lebensPunkte + " | Dmg: " + schadensRate;
    }

}
