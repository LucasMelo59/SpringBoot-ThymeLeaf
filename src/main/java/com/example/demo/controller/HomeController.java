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
        pedido.setUrlImagem("https://www.google.com/imgres?imgurl=https%3A%2F%2Fimg.freepik.com%2Fvetores-premium%2Ftela-de-tv-realista-painel-de-lcd-de-televisao-moderna-com-partida-de-futebol_97886-738.jpg&imgrefurl=https%3A%2F%2Fbr.freepik.com%2Fvetores-premium%2Ftela-de-tv-realista-painel-de-lcd-de-televisao-moderna-com-partida-de-futebol_4718921.htm&tbnid=W6LwdvjwvQzvKM&vet=12ahUKEwjSqOmTwfH4AhWBHrkGHZDTBsQQMygBegUIARDXAg..i&docid=_ID39eQ1gNpumM&w=626&h=417&q=televisao&ved=2ahUKEwjSqOmTwfH4AhWBHrkGHZDTBsQQMygBegUIARDXAg");
        pedido.setUrlProduto("https://www.amazon.com.br/PHILCO-Fast-Smart-PTV32G70RCH-Roku/dp/B09PNQZ8VH/ref=asc_df_B09PNQZ8VH/?tag=googleshopp00-20&linkCode=df0&hvadid=379725941484&hvpos=&hvnetw=g&hvrand=2127292191696726039&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1001538&hvtargid=pla-1641599446695&psc=1");
        pedido.setDescricao("qualquer coisa");

       List<Pedido> pedidos =  Arrays.asList(pedido);

    model.addAttribute("pedido", pedidos);
    return "home";
    }
}
