package AbstractFactory.Types.Ogro;

import AbstractFactory.Factories.Castelo;

public class OgroCastelo implements Castelo {

    public static final String DESCRICAO = "CASTELO OGRO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
