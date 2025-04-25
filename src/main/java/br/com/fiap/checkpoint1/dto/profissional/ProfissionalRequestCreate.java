package br.com.fiap.checkpoint1.dto.profissional;

import java.math.BigDecimal;

public class ProfissionalRequestCreate {
    private String nome;
    private String especialidade;
    private BigDecimal valor_hora;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public BigDecimal getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(BigDecimal valor_hora) {
        this.valor_hora = valor_hora;
    }
}
