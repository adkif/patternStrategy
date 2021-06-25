package Metiers;

import context.Canard;
import strategies.cancan.CancanMuet;
import strategies.vols.NePasVoler;

public class Plastique extends Canard {
    public Plastique() {
        super.setComportementVol(new NePasVoler());
        super.setComportementCancan(new CancanMuet());
    }

    @Override
    public void afficher() {
        System.out.println("Je suis un canard en plastique");
    }
}
