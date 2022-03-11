package com.guilhermesilva.api.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermesilva.api.entities.Produto;
import com.guilhermesilva.api.repositories.ProdutoRepository;
import com.guilhermesilva.api.servicies.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {
	
	@Autowired
	private ProdutoService service;
	
	@Autowired
	private ProdutoRepository repository;

	@GetMapping
	public List<Produto> findAll() {
		return service.findAll();
	}
	
	@PostMapping
	public void save(@RequestBody Produto produto) {
		repository.save(produto);
	}
}
