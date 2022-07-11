package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Pedido {

    private String nome;
    private Double valor;
    private Date data;
    private String urlProduto;
    private String urlImagem;
    private String descricao;


}
