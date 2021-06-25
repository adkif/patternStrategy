package superCanard;

import Metiers.Colvert;
import Metiers.Plastique;
import context.Canard;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Canard> canards = new ArrayList<Canard>();
        Canard canard1 = new Colvert();
        Canard canard2 = new Plastique();
        canards.add(canard1);
        canards.add(canard2);
        for(Canard canard: canards){
            canard.afficher();
            canard.appliquerCancan();
            canard.appliquerVol();
            canard.nager();
            System.out.println(" --------------------------");
        }
    }
}
