package FactoryMethod;

import Animali.Animale;
import Animali.Cane;

public class RifugioCani extends RifugioAnimali{

    @Override
    protected Animale creaAnimale(String nome, int anniUmani, int mesiUmani, String taglia)
    {
        return new Cane(nome,anniUmani,mesiUmani,taglia);
    }

    @Override
    protected Animale creaAnimale(String nome, int anniUmani,int mesiUmani)
    {
        throw new IllegalArgumentException("Inserire anche la taglia!");
    }
}
