package FactoryMethod;

import Animali.Animale;
import Animali.Cane;
import Animali.Gatto;

public class RifugioGatti extends RifugioAnimali {

    @Override
    protected Animale creaAnimale(String nome, int anniUmani, int mesiUmani) {
        return new Gatto(nome, anniUmani, mesiUmani);
    }

    @Override
    protected Animale creaAnimale(String nome, int anniUmani, int mesiUmani, String taglia) {
        throw new IllegalArgumentException("I gatti non hanno la taglia!");
    }
}
