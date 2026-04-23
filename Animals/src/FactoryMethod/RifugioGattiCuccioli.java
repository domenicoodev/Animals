package FactoryMethod;

import Animali.Animale;
import Animali.Cane;
import Animali.Gatto;

public class RifugioGattiCuccioli extends RifugioGatti{

    @Override
    protected Animale creaAnimale(String nome, int anniUmani, int mesiUmani)
    {
        if(anniUmani >= 5){
            throw new IllegalArgumentException(nome + " è troppo anziano per il rifugio di gatti cuccioli!");
        }
        return new Gatto(nome,anniUmani,mesiUmani);
    }
}