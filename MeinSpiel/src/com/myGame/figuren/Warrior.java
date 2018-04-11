package com.myGame.figuren;

public class Warrior extends GespielterCharakter {

    protected int koerperkraft = 10;

    protected int wutschaden = 10;

    public Warrior(String wirdGespielVon) {
        super(wirdGespielVon);
    }

    public Warrior() {
        super("");
    }

    public Warrior(String wirdGespieltVon, int koerperkraft, int wutschaden) {
        this(wirdGespieltVon);
        this.koerperkraft = koerperkraft;
        this.wutschaden = wutschaden;

    }

    @Override
    public void verwundetWerden(int schaden) {
        System.out.println("AUUUAHHHH");
        super.verwundetWerden(schaden);
        this.lebensPunkte += this.koerperkraft;

        System.out.println("Warrior: Leben: " + lebensPunkte);
        System.out.println("**************");

    }
}
