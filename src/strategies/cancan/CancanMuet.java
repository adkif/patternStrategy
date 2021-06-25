package strategies.cancan;

import strategies.IComportementCancan;

public class CancanMuet implements IComportementCancan {
    @Override
    public void cancaner() {
        System.out.println("ne peux pas cancaner, whatsapp seulement");
    }
}
