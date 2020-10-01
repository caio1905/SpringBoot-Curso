package com.caio.api.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caio.api.domain.Categoria;
import com.caio.api.repositories.CategoriaRepository;
import com.caio.api.util.exceptions.ObjetoNaoEncontradoException;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer umId) {
		
		Optional<Categoria> obj = null;
		obj = repo.findById(umId); 
		
		return obj.orElseThrow(() -> new ObjetoNaoEncontradoException("Objeto não encontrado Id:" + umId + ", Tipo: " + 
																	Categoria.class.getName()));
		
	}
}
