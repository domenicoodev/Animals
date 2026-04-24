package AbstractFactory;

import Animali.Animale;
import FactoryMethod.RifugioAnimali;
import FactoryMethod.RifugioCani;
import FactoryMethod.RifugioCaniGrandi;
import FactoryMethod.RifugioCaniPiccoli;

public class DogsFactory implements AnimalsFactory{

    @Override
    public RifugioAnimali animaliPiccoli(){
        return new RifugioCaniPiccoli();
    }

    @Override
    public RifugioAnimali animaliGrandi(){
        return new RifugioCaniGrandi();
    }

}
