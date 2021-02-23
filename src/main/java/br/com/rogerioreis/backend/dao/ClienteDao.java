package br.com.rogerioreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.backend.entity.Cliente;

@Repository // faz a classe se comportar como DAO (métodos de persistência)
public interface ClienteDao extends JpaRepository<Cliente, Long> {

}
