package AbstractFactory.Types.Ogro;

import AbstractFactory.Factories.Exercito;

public class OgroExercito implements Exercito {

    public static final String DESCRICAO = "EXERCITO OGRO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
