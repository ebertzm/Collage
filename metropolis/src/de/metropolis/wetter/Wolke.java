
package de.metropolis.wetter;

import metropolis.Flieger;

public abstract class Wolke implements Flieger{
    protected int hoehe;
    public Wolke(){
        System.out.println("Eine Wolke bildet sich...");
    }
    @Override
    public void fliegen(){
        System.out.println("Wolke ist auf Höhe: "+hoehe);
        
    }
    public void setHoehe(int hoehe){
        this.hoehe=hoehe;
    }
    public abstract void dasIstEineGefahr();
    
}
