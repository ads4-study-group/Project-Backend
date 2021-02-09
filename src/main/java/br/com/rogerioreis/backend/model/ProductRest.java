package br.com.rogerioreis.backend.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRest {
	
	@Autowired
	private ProductDao productDao;
	
	@GetMapping
	public List<Product> get(){
		return productDao.findAll();
	}
	
	@PostMapping
	public void post(@RequestBody Product product) {
		productDao.save(product);
	}

}
