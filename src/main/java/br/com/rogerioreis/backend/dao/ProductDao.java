package br.com.rogerioreis.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rogerioreis.backend.entity.Product;

@Repository // faz a classe se comportar como DAO (métodos de persistência)
public interface ProductDao extends JpaRepository<Product, Long> {

}
