package AbstractFactory.Types.Elfo;

import AbstractFactory.Factories.Castelo;

public class ElfoCastelo implements Castelo {

    public static final String DESCRICAO = "CASTELO ELFO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
