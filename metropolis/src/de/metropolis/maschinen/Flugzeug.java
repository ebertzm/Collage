
package de.metropolis.maschinen;

import metropolis.Flieger;


public class Flugzeug extends Flugmaschine implements Flieger{
    private double gewicht;
    @Override
    public void starten(){
        System.out.println("Ich hebe ab");
        
    }
    
    @Override
    public void fliegen(){
        System.out.println("Ich mache Dreck");
        
    }
    @Override
    public void landen(){
        System.out.println("Weg da!! Landebahn freimachen");
    }
}
