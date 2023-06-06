package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    // construtor com injeção de dependênias: repository, service etc.

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar o pedido no banco de dados.");
        System.out.println("Salvar email com dados do novo pedido.");
    }
}
