package AbstractFactory;

import FactoryMethod.RifugioAnimali;
import FactoryMethod.RifugioGattiAnziani;
import FactoryMethod.RifugioGattiCuccioli;

public class CatsFactory implements AnimalsFactory{

    @Override
    public RifugioAnimali animaliPiccoli(){
        return new RifugioGattiCuccioli();
    }
    @Override
    public RifugioAnimali animaliGrandi(){
        return new RifugioGattiAnziani();
    }
}
