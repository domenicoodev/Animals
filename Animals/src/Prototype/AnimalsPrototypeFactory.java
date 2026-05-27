package Prototype;

import Animali.AnimaleAstratto;
import Animali.Gatto;

public final class AnimalsPrototypeFactory {

    private AnimalsPrototypeFactory() {}

    private static AnimaleAstratto prototype;

    static {
        registerPrototype(new Gatto("Fufi",1,2));
    }
    static synchronized void registerPrototype(AnimaleAstratto a){
        prototype=a;
    }

    public  static synchronized AnimaleAstratto createAnimale() {
        return  prototype.clone();
    }
}

