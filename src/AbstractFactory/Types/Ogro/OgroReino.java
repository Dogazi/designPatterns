package AbstractFactory.Types.Ogro;

import AbstractFactory.Factories.Castelo;
import AbstractFactory.Factories.Exercito;
import AbstractFactory.Factories.Rei;
import AbstractFactory.Factories.Reino;

public class OgroReino implements Reino {

    @Override
    public Castelo CriarCastelo() {
        return new OgroCastelo();
    }

    @Override
    public Exercito CriarExercito() {
        return new OgroExercito();
    }

    @Override
    public Rei CriarRei() {
        return new OgroRei();
    }
}
