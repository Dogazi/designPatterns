package AbstractFactory.Types.Elfo;

import AbstractFactory.Factories.Exercito;

public class ElfoExercito implements Exercito {

    public static final String DESCRICAO = "EXERCITO ELFO";

    @Override
    public String getDescricao() {
        return DESCRICAO;
    }
}
