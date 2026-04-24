package AbstractFactory;

import FactoryMethod.RifugioAnimali;
import FactoryMethod.RifugioGattiCuccioli;

public class CatsFactory implements AnimalsFactory{

    @Override
    public RifugioAnimali animaliPiccoli(){
        return new RifugioGattiCuccioli();
    }
}
