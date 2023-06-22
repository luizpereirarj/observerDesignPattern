package br.com.alura.loja.situacao;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacaoOrcamento{
    public BigDecimal calcularValorExra(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
