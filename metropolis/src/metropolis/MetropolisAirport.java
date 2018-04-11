package metropolis;

import de.metropolis.lebewesen.Superman;
import de.metropolis.lebewesen.Vogel;
import de.metropolis.maschinen.Flugzeug;
import de.metropolis.maschinen.Hubschrauber;
import de.metropolis.wetter.Regenwolke;

public class MetropolisAirport {

    public static void main(String[] args) {
        Flieger[] alleMeineFlieger = new Flieger[4];
        alleMeineFlieger[0] = new Vogel();
        alleMeineFlieger[1] = new Flugzeug();
        alleMeineFlieger[2] = new Hubschrauber();
        alleMeineFlieger[3] = new Superman();

        for (Flieger flug : alleMeineFlieger) {  //erweiterte For-Schleife
            flug.starten();
        }
        for (Flieger flug1 : alleMeineFlieger) {
            flug1.fliegen();
        }
        for (Flieger flug2 : alleMeineFlieger){
            flug2.landen();
        }
       Regenwolke meineRegenwolke = new Regenwolke();
       Flieger meineRegenwolke1 = new Regenwolke();
        
       /* givePermissionToLand : alleMeineFlieger){
    
    

    public static void givePermissionToLand(Flieger f) {
        System.out.println("Landung erlaubt");
        f.landen();
*/
    }
}
