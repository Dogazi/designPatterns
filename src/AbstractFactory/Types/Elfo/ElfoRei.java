package AbstractFactory.Types.Elfo;

import AbstractFactory.Factories.Rei;

public class ElfoRei implements Rei {

    public static final String DESCRICAO = "REI ELFO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
