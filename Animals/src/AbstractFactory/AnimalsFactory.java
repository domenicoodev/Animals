package AbstractFactory;

import FactoryMethod.RifugioAnimali;
import FactoryMethod.RifugioCani;
import FactoryMethod.RifugioGatti;

public interface AnimalsFactory {
    RifugioAnimali animaliPiccoli();
    RifugioAnimali animaliGrandi();
}
