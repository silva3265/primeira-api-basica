package com.romulo.minhaapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.romulo.minhaapi.domain.Usuario;
import com.romulo.minhaapi.repositories.UsuarioRepository;
import com.romulo.minhaapi.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + 
				", Tipo: " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		return repository.findAll();
	}

}
