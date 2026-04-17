package Adapter;

import Animali.Animale;
import Animali.Criceto;
import Animali.Età;

public class CricetoClassAdapter extends Criceto implements Animale {

    public CricetoClassAdapter(String nome, int anniUmani, int mesiUmani){
        super(nome,anniUmani,mesiUmani);
    }

    @Override
    public String getNome(){
        return super.getNome();
    }

    @Override
    public Età etàAnimale()
    {
        Età etàAdattata = new Età(super.calcoloEtà()[0],super.calcoloEtà()[1]);
        return etàAdattata;
    }
}
