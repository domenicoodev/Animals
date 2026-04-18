import Adapter.CricetoClassAdapter;
import Adapter.CricetoObjectAdapter;
import Animali.Animale;
import Animali.Gatto;
import Animali.Cane;
import ChainOfResponsability.ClinicaVeterinaria.Handler;
import ChainOfResponsability.ClinicaVeterinaria.Infortunato;
import ChainOfResponsability.ClinicaVeterinaria.Veterinari.VeterinarioGenerale;
import ChainOfResponsability.ClinicaVeterinaria.Veterinari.VeterinarioSpecialista;
import Decorator.DecoratoreCuori;

public class ProvaAnimali {
    public static void main(String[] args) {
        Animale[] gatti = new Gatto[3];
        Animale[] cani = new Cane[3];
        //ADAPTER PER CRICETO
        Animale mimiClass = new CricetoClassAdapter("Mimi",1,3);
        Animale mimiObject = new CricetoObjectAdapter("Mimi",1,3);

        gatti[0] = new Gatto("Salem", 0,4);
        System.out.println("Il gatto di nome " + gatti[0].getNome()
                + " ha " + gatti[0].etàAnimale().getAnniSpecie() + " anni e "
                + gatti[0].etàAnimale().getMesiSpecie() + " mesi.");

        cani[0] = new Cane("Aria",2, 6,"piccola");
        System.out.println("Il cane di nome " + cani[0].getNome()
                + " ha " + cani[0].etàAnimale().getAnniSpecie() + " anni e "
        + cani[0].etàAnimale().getMesiSpecie() + " mesi.");

        System.out.println("[CLASS ADAPTER] ---> Il criceto di nome " + mimiClass.getNome() +
                " ha " + mimiClass.etàAnimale().getAnniSpecie() + " anni e "
                + mimiClass.etàAnimale().getMesiSpecie() + " mesi" );

        System.out.println("[OBJECT ADAPTER] ---> Il criceto di nome " + mimiObject.getNome() +
                " ha " + mimiObject.etàAnimale().getAnniSpecie() + " anni e "
                + mimiObject.etàAnimale().getMesiSpecie() + " mesi" );
        //DECORATOR
    Animale micioDecorato = new DecoratoreCuori(gatti[0]); // potrei benissimo sostituire gatti[0] con cani[0] o con MimiClass ecc..
                                                            //non ho bisogno di creare sottoclassi per ognuno di essi.
    System.out.println(micioDecorato.getNome());
        Infortunato Carolina = new Infortunato(new Gatto("Carolina",8,0),1);
        //CREO LA CHAIN OF RESPONSABILITY
        Handler handler = new VeterinarioGenerale();
        handler.setNext(new VeterinarioSpecialista()/*.setNext(QUALCOS'ALTRO)*/);
        handler.handle(Carolina);
    }
}