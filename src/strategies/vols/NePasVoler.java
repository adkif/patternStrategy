package strategies.vols;

import strategies.IComportementVol;

public class NePasVoler implements IComportementVol {

    @Override
    public void voler() {
        System.out.println("Ne sais pas voler");
    }
}
