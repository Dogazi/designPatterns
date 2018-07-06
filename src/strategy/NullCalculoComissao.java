package strategy;

import java.math.BigDecimal;

public class NullCalculoComissao implements CalculoComissao {

    public BigDecimal calcularComissao(BigDecimal venda){
        return new BigDecimal("0.00");
    }
}
