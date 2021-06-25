package context;

import strategies.IComportementCancan;
import strategies.IComportementVol;

public abstract class Canard {
    IComportementCancan comportementCancan;
    IComportementVol comportementVol;

    public abstract void afficher();

    public void setComportementCancan(IComportementCancan comportementCancan) {
        this.comportementCancan = comportementCancan;
    }

    public void setComportementVol(IComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void appliquerCancan(){
        comportementCancan.cancaner();
    }

    public void appliquerVol(){
        comportementVol.voler();
    }

    public void nager(){
        System.out.println("je nage");
    }
}
