package br.com.rogerioreis.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.backend.dao.ClienteDao;
import br.com.rogerioreis.backend.entity.Cliente;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/backend") // configura a url do webservice
@Api(value = "API Rest Clientes")
public class ClienteRest {

	@Autowired // injeta uma instância de productDao aqui
	private ClienteDao clienteDao;

	@GetMapping // expõe o método GET
	@ApiOperation(value = "Retorna uma lista de clientes")
	public List<Cliente> get() {
		return clienteDao.findAll();
	}

	@PostMapping // expõe o método POST
	@ApiOperation(value = "Salva ou atualiza um cliente")
	public void post(@RequestBody Cliente cliente) {
		clienteDao.save(cliente);
	}

	@DeleteMapping("/{id}")
	@ApiOperation(value = "Deleta um cliente")
	public void delete(@PathVariable("id") Long id) {
		clienteDao.deleteById(id);
	}

}
