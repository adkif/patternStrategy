package strategies.vols;

import strategies.IComportementVol;

public class VolerAvecDesAiles implements IComportementVol {
    @Override
    public void voler() {
        System.out.println("Canard a 10000 pieds");
    }
}
