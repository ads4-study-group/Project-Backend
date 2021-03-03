package br.com.rogerioreis.backend.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data // é uma anotação do Lombok para não precisar informar get/set/equal hash e
		// toString
@Entity // faza a classe se comportar como entidade (tabela no banco)
public class Cliente {

	@Id // informa que este campo é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define a estratégia de geração de ID
	private Long id;

	private String nome;

}
