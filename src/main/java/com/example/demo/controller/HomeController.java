package com.example.demo.controller;

import com.example.demo.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home  (Model model) {
        Pedido pedido = new Pedido();
        pedido.setNome("Televisao");
        pedido.setValor(2222.76);
        pedido.setUrlImagem("https://m.media-amazon.com/images/I/619vCl4hH3L._AC_SX466_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/PHILCO-Fast-Smart-PTV32G70RCH-Roku/dp/B09PNQZ8VH/ref=asc_df_B09PNQZ8VH/?tag=googleshopp00-20&linkCode=df0&hvadid=379725941484&hvpos=&hvnetw=g&hvrand=2127292191696726039&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001538&hvtargid=pla-1641599446695&psc=1");
        pedido.setDescricao("qualquer coisa");

       List<Pedido> pedidos =  Arrays.asList(pedido);

    model.addAttribute("pedidos", pedidos);

    return "home";
    }
}
