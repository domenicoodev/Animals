package FactoryMethod;
import Animali.Animale;

public abstract class RifugioAnimali {
    //VERSIONE CANI CON STRING TAGLIA
    protected abstract Animale creaAnimale(String nome, int anniUmani, int mesiUmani, String taglia);

    public Animale registraAnimale(String nome, int anniUmani, int mesiUmani, String taglia){
        Animale a = creaAnimale(nome, anniUmani, mesiUmani, taglia);
        return a;
    }

    //VERSIONE ALTRI ANIMALI
    protected abstract Animale creaAnimale(String nome, int anniUmani, int mesiUmani);

    public Animale registraAnimale(String nome, int anniUmani, int mesiUmani){
        Animale a = creaAnimale(nome, anniUmani, mesiUmani);
        return a;
    }
}
