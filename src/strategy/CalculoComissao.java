package strategy;

import java.math.BigDecimal;

public interface CalculoComissao {

    BigDecimal calcularComissao(BigDecimal venda);
}
