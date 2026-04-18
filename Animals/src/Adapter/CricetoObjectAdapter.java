package Adapter;

import Animali.Animale;
import Animali.Criceto;
import Animali.Età;

public class CricetoObjectAdapter implements Animale {

    private Criceto c;

    public CricetoObjectAdapter(String nome, int anniUmani, int mesiUmani)
    {
        this.c = new Criceto(nome,anniUmani,mesiUmani);
    }

    @Override
    public String getNome()
    {
        return c.getNome();
    }

    @Override
    public Età etàAnimale()
    {
        Età etàCriceto = new Età(c.calcoloEtà()[0],c.calcoloEtà()[1]);
        return etàCriceto;
    }
}
