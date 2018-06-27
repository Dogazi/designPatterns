package builder;

import static org.junit.Assert.*;
import org.junit.Test;

import java.math.BigDecimal;

public class FilmeTeste {

    @Test
    public void filmeBuilderTeste(){

        Filme filme01 = new Filme.Builder()
                .titulo("Tropa de Elite")
                .categoria("Ação")
                .minutos(new BigDecimal("120"))
                .classificacao("+16")
                .ano(new BigDecimal("2007"))
                .build();


        assertEquals("Tropa de Elite", filme01.getTitulo());
        assertEquals("Ação", filme01.getCategoria());
        assertEquals(new BigDecimal("120"), filme01.getMinutos());
        assertEquals("+16", filme01.classificacao());
        assertEquals(new BigDecimal("2007"), filme01.getAno());
    }
}
