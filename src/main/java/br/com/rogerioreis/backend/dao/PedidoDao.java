package br.com.rogerioreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.backend.entity.Pedido;

@Repository
public interface PedidoDao extends JpaRepository<Pedido, Long> {

}
