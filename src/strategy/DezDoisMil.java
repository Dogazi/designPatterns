package strategy;

import java.math.BigDecimal;

public class DezDoisMil implements CalculoComissao {

    private static final BigDecimal TETO = new BigDecimal("1000.00");

    public BigDecimal calcularComissao(BigDecimal venda){
        if (venda.compareTo(TETO) <= 0) {
            return venda.multiply(new BigDecimal("0.10").setScale(2));
        }
        BigDecimal ateMil = TETO.multiply(new BigDecimal("0.10").setScale(2));
        BigDecimal acimaMil = venda.subtract(TETO).multiply("0.2").setScale(2);

    }
}
