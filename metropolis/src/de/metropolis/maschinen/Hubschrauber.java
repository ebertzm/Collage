/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.metropolis.maschinen;

import metropolis.Flieger;


public class Hubschrauber extends Flugmaschine implements Flieger{
    private int anzahlDerSitzplaetze;
    @Override
    public void starten(){
        System.out.println("Ohren zu");
    }
    @Override
    public void fliegen(){
        System.out.println("Hänge in der Luft");
        
    }
    @Override
    public void landen(){
        System.out.println("Aus dem Weg, meine Rotorblätter brauchen Platz");
    }
}
