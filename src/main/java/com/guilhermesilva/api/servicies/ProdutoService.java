package com.guilhermesilva.api.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.guilhermesilva.api.entities.Produto;
import com.guilhermesilva.api.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository repository;
	
	@Transactional(readOnly = true)
	public List<Produto> findAll() {
		List<Produto> resultado = repository.findAll();
		return resultado;
	}
}
