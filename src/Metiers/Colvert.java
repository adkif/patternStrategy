package Metiers;

import context.Canard;
import strategies.cancan.Cancan;
import strategies.vols.VolerAvecDesAiles;

public class Colvert extends Canard {
    public Colvert() {
        super.setComportementCancan(new Cancan());
        super.setComportementVol(new VolerAvecDesAiles());
    }

    @Override
    public void afficher() {
        System.out.println("Hey, je suis un colvert");
    }
}
