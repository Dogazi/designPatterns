package strategy;

import java.math.BigDecimal;

public class Venda {

    private BigDecimal valor;
    private CalculoComissao comissao = new NullCalculoComissao();

    public Venda(BigDecimal valor, CalculoComissao comissao) {
        this.valor = valor;
        this.comissao = comissao;
    }

    public Venda(BigDecimal valor) {
        this.valor = valor;
        this.comissao = new NullCalculoComissao();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public BigDecimal calcularComissao(){
        return this.comissao.calcularComissao(this.valor);
    }

}
