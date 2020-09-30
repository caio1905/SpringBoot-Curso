package com.caio.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.api.domain.Categoria;
import com.caio.api.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer umId) {
		
		Optional<Categoria> obj = null;
		obj = repo.findById(umId);
		
		return obj.orElse(null);
		
	}
}
