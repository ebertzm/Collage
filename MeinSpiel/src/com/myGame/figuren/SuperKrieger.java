
package com.myGame.figuren;

import com.myGame.waffen.Zweihaender;


public class SuperKrieger extends Krieger{
    
    public SuperKrieger(String name) {
        super(name);
    }
    @Override
    public Zweihaender dasIstMeineWaffe(){
        return (Zweihaender)meinSchwert;
    }
    //public void erstelleParty(GespielterCharakter c1, GespielterCharakter c2, GespielterCharakter c3){
        
    //}
    public void verteidiger(GespielterCharakter... c ){
        
    }
}
