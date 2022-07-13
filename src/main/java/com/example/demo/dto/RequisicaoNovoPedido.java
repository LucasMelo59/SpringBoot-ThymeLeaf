package com.example.demo.dto;

import com.example.demo.model.Pedido;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequisicaoNovoPedido {

    private String nomeProduto;
    private String urlProduto;
    private String urlImagem;
    private String descricao;

    public Pedido toPedido() {

        Pedido pedido = new Pedido ();
        pedido.setDescricao(descricao);
        pedido.setNome(nomeProduto);
        pedido.setUrlImagem(urlImagem);
        pedido.setUrlProduto(urlProduto);
        return pedido;
    }
}
