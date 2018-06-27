package builder;

import java.math.BigDecimal;

public class Filme {

    public static class Builder {

        private String titulo;
        private String categoria;
        private BigDecimal minutos;
        private String classificacao;
        private BigDecimal ano;

        public Builder titulo(String titulo){
            this.titulo = titulo;
            return this;
        }

        public Builder categoria(String categoria){
            this.categoria = categoria;
            return this;
        }

        public Builder minutos(BigDecimal minutos){
            this.minutos = minutos;
            return this;
        }

        public Builder classificacao(String classificacao){
            this.classificacao = classificacao;
            return this;
        }

        public Builder ano(BigDecimal ano){
            this.ano = ano;
            return this;
        }

        public Filme build(){
            Filme filme = new Filme();
            filme.titulo = titulo;
            filme.categoria = categoria;
            filme.minutos = minutos;
            filme.classificacao = classificacao;
            filme.ano = ano;
            return filme;
        }
    }

    private String titulo;
    private String categoria;
    private BigDecimal minutos;
    private String classificacao;
    private BigDecimal ano;

    public Filme(){
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public BigDecimal getMinutos(){
        return this.minutos;
    }
    public String classificacao(){
        return this.classificacao;
    }
    public BigDecimal getAno() {
        return this.ano;
    }
}
