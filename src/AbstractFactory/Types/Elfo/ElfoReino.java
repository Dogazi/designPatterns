package AbstractFactory.Types.Elfo;

import AbstractFactory.Factories.Castelo;
import AbstractFactory.Factories.Exercito;
import AbstractFactory.Factories.Rei;
import AbstractFactory.Factories.Reino;

public class ElfoReino implements Reino {

    @Override
    public Castelo CriarCastelo() {
        return new ElfoCastelo();
    }

    @Override
    public Exercito CriarExercito() {
        return new ElfoExercito();
    }

    @Override
    public Rei CriarRei() {
        return new ElfoRei();
    }
}
