package ChainOfResponsability.ClinicaVeterinaria.Veterinari;

import ChainOfResponsability.ClinicaVeterinaria.AbstractHandler;
import ChainOfResponsability.ClinicaVeterinaria.Infortunato;

public class VeterinarioSpecialista extends AbstractHandler {

    @Override
    public boolean handle(Infortunato animale){
        if(animale.getGravità() == 1){
            System.out.println(animale.getAnimale().getClass().getSimpleName() + " " + animale.getNome() + " gestito da Veterinario Specialista.");
        return true;
        }
        else return super.handle(animale);
    }
}
