package com.myGame.figuren;

public final class Hexer extends GespielterCharakter {

    private int zauberkraft = 35;
    //public int lebenspunkte=100;

    public Hexer(String wirdGespieltVon) {

        super(wirdGespieltVon);
    }

    /*
    public Hexer() {
        super("NoN");
    }
     */
    @Override
    public void verwunden(Charakter fremder) {
        fremder.verwundetWerden(schadensRate + zauberkraft);

    }

    @Override
    public void verwundetWerden(int schaden) {
        System.out.println("Wuschhhhh");
        super.verwundetWerden(schaden);
        this.lebensPunkte = lebensPunkte;

        System.out.println("Hexer: Leben: " + lebensPunkte);
        System.out.println("**************");
    }
}
