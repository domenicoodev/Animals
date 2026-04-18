package ChainOfResponsability.ClinicaVeterinaria;

import Animali.Animale;
import Animali.Età;

public class Infortunato implements Animale {
    private Animale animale;
    private int gravità;
    public Infortunato(Animale animale, int gravità)
    {
        if(gravità < 0 || gravità > 1)
        {
            throw new IllegalArgumentException("Livello di gravità non valido!");
        }
        this.gravità = gravità;
        this.animale = animale;
    }
    public int getGravità(){return gravità;}

    @Override
    public String getNome(){return animale.getNome();}
    @Override
    public Età etàAnimale(){return animale.etàAnimale();}
}
