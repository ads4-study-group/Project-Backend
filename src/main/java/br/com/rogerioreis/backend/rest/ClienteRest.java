package br.com.rogerioreis.backend.rest;

import java.util.List;

import javax.persistence.OrderColumn;

import org.hibernate.annotations.OrderBy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.backend.dao.ClienteDao;
import br.com.rogerioreis.backend.entity.Cliente;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/cliente") // configura a url do webservice
public class ClienteRest {

	@Autowired // injeta uma instância de productDao aqui
	private ClienteDao clienteDao;

	@GetMapping // expõe o método GET
	public List<Cliente> get() {
		return clienteDao.findAll();
	}

	@PostMapping // expõe o método POST
	public void post(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		clienteDao.deleteById(id);
	}

}
