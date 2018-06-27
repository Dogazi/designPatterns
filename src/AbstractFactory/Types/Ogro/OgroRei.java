package AbstractFactory.Types.Ogro;

import AbstractFactory.Factories.Rei;

public class OgroRei implements Rei {

    public static final String DESCRICAO = "REI OGRO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
