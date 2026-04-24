package FactoryMethod;
import Animali.Animale;

public abstract class RifugioCani implements RifugioAnimali {

    protected abstract Animale creaAnimale(String nome, int anniUmani, int mesiUmani);

    @Override
    public Animale registraAnimale(String nome, int anniUmani, int mesiUmani){
        Animale a = creaAnimale(nome, anniUmani, mesiUmani);
        return a;
    }

   /* //VERSIONE ALTRI ANIMALI
    protected abstract Animale creaAnimale(String nome, int anniUmani, int mesiUmani);

    public Animale registraAnimale(String nome, int anniUmani, int mesiUmani){
        Animale a = creaAnimale(nome, anniUmani, mesiUmani);
        return a;
    }
    */
}
