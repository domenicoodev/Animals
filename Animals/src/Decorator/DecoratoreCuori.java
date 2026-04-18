package Decorator;

import Animali.Animale;

public class DecoratoreCuori extends Decorator {
    public DecoratoreCuori(Animale animale) {
        super(animale);
    }

    @Override
    public String getNome(){return "❤" + super.getNome() + "❤";}
}