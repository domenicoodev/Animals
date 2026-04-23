package FactoryMethod;

import Animali.Animale;
import Animali.Cane;

public class RifugioCaniGrandi extends RifugioCani{

    @Override
    protected Animale creaAnimale(String nome, int anniUmani, int mesiUmani)
    {
        return new Cane(nome,anniUmani,mesiUmani,"grande");
    }
}
