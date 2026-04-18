package ChainOfResponsability.ClinicaVeterinaria.Veterinari;

import ChainOfResponsability.ClinicaVeterinaria.AbstractHandler;
import ChainOfResponsability.ClinicaVeterinaria.Infortunato;

public class VeterinarioGenerale extends AbstractHandler {

    @Override
    public boolean handle(Infortunato animale){
        if(animale.getGravità() == 0){
            System.out.println(animale.getAnimale().getClass().getSimpleName() + " " + animale.getNome() + " gestito da Veterinario Generale.");
            return true;
        }
        else{return super.handle(animale);}
    }
}
