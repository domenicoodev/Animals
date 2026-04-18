package Decorator;

import Animali.Animale;
import Animali.Età;

public abstract class Decorator implements Animale {

    private final Animale animale;
    public Decorator(Animale animale) {
        this.animale = animale;
    }

    @Override
    public String getNome(){return animale.getNome();}

    @Override
    public Età etàAnimale(){return animale.etàAnimale();}
}
