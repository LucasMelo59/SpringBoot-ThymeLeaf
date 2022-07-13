package com.example.demo.controller;

import com.example.demo.dto.RequisicaoNovoPedido;
import com.example.demo.model.Pedido;
import com.example.demo.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.Id;

@Controller
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("formulario")
    public String formulario() {

        return "pedido/formulario";
    }

    @PostMapping("novo")
    public String novo(RequisicaoNovoPedido requisicao) {
        Pedido pedido =  requisicao.toPedido();
        pedidoRepository.save(pedido);
        return "pedido/formulario";
    }
}
