package br.com.rogerioreis.backend.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz a classe se comportar como DAO (métodos de persistência)
public interface ProductDao extends JpaRepository<Product, Long> {

}
