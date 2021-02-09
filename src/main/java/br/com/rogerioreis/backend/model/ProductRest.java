package br.com.rogerioreis.backend.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
