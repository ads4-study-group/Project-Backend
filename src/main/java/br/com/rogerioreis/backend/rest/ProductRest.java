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

import br.com.rogerioreis.backend.dao.ProductDao;
import br.com.rogerioreis.backend.entity.Product;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/product") // configura a url do webservice
public class ProductRest {
	
	@Autowired // injeta uma instância de productDao aqui
	private ProductDao productDao;
	
	@GetMapping // expõe o método GET
	public List<Product> get(){
		return productDao.findAll();
	}
	
	@PostMapping // expõe o método POST
	public void post(@RequestBody Product product) {
		productDao.save(product);
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") Long id) {
		productDao.deleteById(id);
	}

}
