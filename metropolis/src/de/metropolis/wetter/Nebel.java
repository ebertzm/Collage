
package de.metropolis.wetter;


public abstract class Nebel extends Wolke {
    
    
    @Override
    public void dasIstEineGefahr() {
        System.out.println("langsam... ich kann nichts sehen!");
    }
    
}
