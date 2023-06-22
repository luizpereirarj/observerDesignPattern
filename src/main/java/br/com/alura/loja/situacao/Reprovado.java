package br.com.alura.loja.situacao;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class Reprovado  extends SituacaoOrcamento{

    @Override
    public void finalizado(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
