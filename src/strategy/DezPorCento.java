package strategy;

import java.math.BigDecimal;

public class DezPorCento implements CalculoComissao {

    public BigDecimal calcularComissao(BigDecimal venda) {
        return venda.multiply(new BigDecimal("0.10").setScale(2));
    }
}
