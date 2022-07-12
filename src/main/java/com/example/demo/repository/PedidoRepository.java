package com.example.demo.repository;

import com.example.demo.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
@Repository // essa classe aqui é uma repositorio e eu quero criar instancias quando chamar a classe ( explicação da anotação)
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
