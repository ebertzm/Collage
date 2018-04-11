
package de.metropolis.maschinen;

import metropolis.Schwimmer;

/**
 *
 * @author CC-Student
 */
public class Schiff implements Schwimmer {

    @Override
    public void ablegen() {
        System.out.println("Ahoi..und ne Bottel voll Rum");
    }

    @Override
    public void schwimmen() {
        System.out.println("überall nur Wasser und ne Bottel voll Rum");
    }

    @Override
    public void anlegen() {
        System.out.println("Bottel ist leer und ich komm an Land");
    
}}
