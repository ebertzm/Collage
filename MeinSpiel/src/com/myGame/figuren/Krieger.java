package com.myGame.figuren;

import com.myGame.waffen.Schwert;

public class Krieger extends GespielterCharakter {

    protected int koerperkraft = 15;
    protected Schwert meinSchwert;

    public Krieger(String spieler) {
        super(spieler);
    }

    public Krieger(String spieler, int koerperkraft) {
        this(spieler);
        this.koerperkraft = koerperkraft;
    }

    @Override
    public void verwundetWerden(int schaden) {
        System.out.println("HUUUUUUUUUUUUUAAAAAAAAAAAAA");
        super.verwundetWerden(schaden);
        this.lebensPunkte += this.koerperkraft;
        System.out.println("Krieger: Leben: " + lebensPunkte);
        System.out.println("**************");
    }
    
    public Schwert dasIstMeineWaffe(){
        return meinSchwert;
    }
}
