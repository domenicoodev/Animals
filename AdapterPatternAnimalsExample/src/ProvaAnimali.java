import Animali.Animale;
import Animali.Gatto;
import Animali.Cane;

public class ProvaAnimali {
    public static void main(String[] args) {
        Animale[] gatti = new Gatto[3];
        Animale[] cani = new Cane[3];
        gatti[0] = new Gatto("Salem", 1);
        System.out.println("Il gatto di nome " + gatti[0].getNome() + " ha " + gatti[0].anniAnimale() + " anni.");
        cani[0] = new Cane("Aria",3,"piccola");
        System.out.println("Il cane di nome " + cani[0].getNome() + " ha " + cani[0].anniAnimale() + " anni.");
    }
}